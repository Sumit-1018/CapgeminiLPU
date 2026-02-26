package in.cg.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.cg.resources.JavaConfigFile;
import in.cg.service.BookService;
import in.cg.service.LibraryService;
import in.cg.service.MemberService;

public class LibraryApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfigFile.class);

        BookService bookService = context.getBean(BookService.class);
        MemberService memberService = context.getBean(MemberService.class);
        LibraryService libraryService = context.getBean(LibraryService.class);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n-------LIBRARY MENU-------");
            System.out.println("1. Register Member");
            System.out.println("2. Add Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. View Books");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    memberService.registerMember(name, email);
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    bookService.addBook(title, author);
                    break;

                case 3:
                    System.out.print("Member ID: ");
                    int mId = sc.nextInt();
                    System.out.print("Book ID: ");
                    int bId = sc.nextInt();
                    libraryService.issueBook(mId, bId);
                    break;

                case 4:
                    System.out.print("Member ID: ");
                    int rmId = sc.nextInt();
                    System.out.print("Book ID: ");
                    int rbId = sc.nextInt();
                    libraryService.returnBook(rmId, rbId);
                    break;

                case 5:
                    bookService.getAllBooks().forEach(b ->
                            System.out.println(
                                    b.getId()+" | "+b.getTitle()+" | "+b.getAuthor()+" | Available:"+b.isAvailable()
                            ));
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}