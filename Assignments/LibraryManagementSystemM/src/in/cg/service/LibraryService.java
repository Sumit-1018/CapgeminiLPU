package in.cg.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cg.model.Book;
import in.cg.model.Member;

@Service
public class LibraryService {
	@Autowired
	private MemberService memberservice;
	@Autowired
	private BookService bookService;
	
	public LibraryService(MemberService memberservice, BookService bookService) {
		this.memberservice = memberservice;
		this.bookService = bookService;
	}
	public void issueBook(int memberId, int bookId) {
        Member member = memberservice.getMemberById(memberId);
        Book book = bookService.getBookById(bookId);

        if (member == null) {
            System.out.println("Member not found");
            return;
        }

        if (book == null) {
            System.out.println("Book not found");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book already issued");
            return;
        }

        book.setAvailable(false);
        System.out.println("Book issued successfully!");
    }

    public void returnBook(int memberId, int bookId) {
        Book book = bookService.getBookById(bookId);

        if (book == null) {
            System.out.println("Book not found");
            return;
        }

        book.setAvailable(true);
        System.out.println("Book returned successfully!");
    }
}
