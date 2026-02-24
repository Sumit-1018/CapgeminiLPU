package in.cg.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.cg.entities.Profile;
import in.cg.entities.User;

public class App {

    private static SessionFactory factory;

    static {
        Configuration cfg = new Configuration();

        // load hibernate.cfg.xml
        cfg.configure("/in/cg/config/hibernate.cfg.xml");

        // register annotated classes
        cfg.addAnnotatedClass(User.class);
        cfg.addAnnotatedClass(Profile.class);

        factory = cfg.buildSessionFactory();
    }

    public static void main(String[] args) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            // ---------- create profile ----------
            Profile profile = new Profile();
            profile.setProfileNo("100L");

            // ---------- create user ----------
            User user = new User();
            user.setName("Sumit");

            // ---------- link both sides ----------
            user.setProfile(profile);   // owner side
            profile.setUser(user);     // inverse side (IMPORTANT)

            // ---------- save ----------
            // because of CascadeType.ALL,
            // saving user will also save profile
            session.persist(user);

            tx.commit();
            System.out.println("Data saved successfully");

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }

        session.close();
        factory.close();
    }
}
