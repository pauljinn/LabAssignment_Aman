import java.util.*;

public class BookService {
	public List<Book> findDuplicateBooks(Book[] books){
		List<Book> duplicateBook = new ArrayList<>();
		for(int i=0;i<books.length;i++) {
			for(int j= i+1;j<books.length;j++) {
				if(books[i].equals(books[j]))
					duplicateBook.add(books[i]);
				break;
			}
		}
		return duplicateBook;
	}

}
