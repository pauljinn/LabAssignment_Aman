import java.util.*;
public class BookTest {

	public static void main(String[] args) {\
		//Collection of books as local repository.
		Book[] books = {
				new Book(101,"The Leader Who Had No Title","Robin Sharma"),
				new Book(102,"Object Oriented Programming","Balaguruswami"),
				new Book(103,"Head First Java","Sierra & Bates"),
				new Book(101,"The Leader Who Had No Title","Robin Sharma"),
				new Book(104,"Head First Servlet and JSP","Sierra & Bates"),
				new Book(102,"Object Oriented Programming","Balaguruswami")
		};
		BookService bookService = new BookService();
		List<Book> duplicateBooks = bookService.findDuplicateBooks(books);
		System.out.println("Total Duplicate books: " + duplicateBooks.size());
		System.out.println(duplicateBooks);

	}

}
