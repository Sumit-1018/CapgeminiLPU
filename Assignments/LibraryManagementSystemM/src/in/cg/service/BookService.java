package in.cg.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cg.model.Book;
import in.cg.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepo;
	private long idCounter = 1;
	
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public void addBook(String title, String author) {
		Book book = new Book((int)idCounter++, title, author, true);
		bookRepo.addBook(book);
		System.out.println("Book added: " + book.getTitle());
	}
	
	public Book getBookById(int id) {
		return bookRepo.getBookById(id);
	}
	
	public List<Book> getAllBooks() {
		return bookRepo.getAllBooks();
	}
}
