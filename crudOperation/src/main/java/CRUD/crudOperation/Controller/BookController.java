package CRUD.crudOperation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CRUD.crudOperation.entity.Book;
import CRUD.crudOperation.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	
	public List<Book> getAllBooks() {

		return bookService.getAllBooks();

	}

	@GetMapping("/books/{id}")
	public Book getBooksById(@PathVariable String id) {
		return this.bookService.getBooksById(Integer.parseInt(id));
	}

	@PostMapping("/books")
	public Book addNewBooks(@RequestBody Book book) {

		return this.bookService.addNewBooks(book);
	}

	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {

		return this.bookService.updateBook(book);

	}
	
	@DeleteMapping("/books/{id}")
	public void deleteBookById(@PathVariable int Id) {
		bookService.deleteBookById(Id);
		
	}
	

}
