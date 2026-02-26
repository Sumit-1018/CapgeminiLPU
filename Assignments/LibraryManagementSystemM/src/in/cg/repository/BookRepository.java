package in.cg.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import in.cg.model.Book;
import in.cg.service.BookService;

@Repository
public class BookRepository {
	
	public List<Book> books= new ArrayList<>();
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public Book getBookById(int id) {
		for(Book book:books) {
			if(book.getId()==id) {
				return book;
			}
		}
		return null;
	}
	
	public List<Book> getAllBooks() {
		return books;
	}
	
}
