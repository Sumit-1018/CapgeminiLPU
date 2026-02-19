package in.cg.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.cg.entities.Bank;
import in.cg.entities.Account;

public class BankMain {

    private static SessionFactory factory;

    static {
        Configuration cfg = new Configuration();
        cfg.configure("/in/cg/config/hibernateBank.cfg.xml");
        cfg.addAnnotatedClass(Bank.class);
        cfg.addAnnotatedClass(Account.class);
        factory = cfg.buildSessionFactory();
    }

    public static void main(String[] args) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {

            // create bank
            Bank bank = new Bank();
            bank.setName("SBI");

            // create accounts
            Account a1 = new Account();
            a1.setNumber("ACC101");
            a1.setBalance(5000);

            Account a2 = new Account();
            a2.setNumber("ACC102");
            a2.setBalance(8000);

            // link both sides
            a1.setBank(bank);
            a2.setBank(bank);

            bank.getAccounts().add(a1);
            bank.getAccounts().add(a2);

            // save bank → accounts saved due to cascade
            session.persist(bank);

            tx.commit();
            System.out.println("Saved successfully");

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }

        session.close();
        factory.close();
    }
}
