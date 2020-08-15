package CRUD.crudOperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CRUD.crudOperation.dao.BookManagement;
import CRUD.crudOperation.entity.Book;

@Service
public class BookService {
	
	List<Book> books;
	
	@Autowired
	private BookManagement bookManagement;
	
	public List<Book> getAllBooks(){
		
	return	this.bookManagement.findAll();
		
	}

	public Book getBooksById(Integer id) {
		
		return this.bookManagement.getOne(id);
	}

	public Book addNewBooks(Book book) {
	 
	    bookManagement.save(book);
		
		return book;
	}

	public Book updateBook(Book book) {
		bookManagement.save(book);
		return book;
	}

	public void deleteBookById(int id) {
		
//	Book books = bookManagement.getOne(i);
		
		bookManagement.deleteById(id);
	}

}
