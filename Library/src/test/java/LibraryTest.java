import static org.junit.Assert.*;

import org.junit.Test;

import Library.Books;
import Library.LibraryManager;

public class LibraryTest {

	@Test
	public void testCheckInBook() {

		Books book1 = new Books(1000, "Ross Manclark");

		LibraryManager l1 = new LibraryManager();

		l1.addInItem(book1);
		System.out.println(book1.getAuthor());
		assertEquals(book1.getAuthor(), "Ross Manclark");
		assertEquals(book1.getiDNumber(), 1000);

	}

	@Test
	public void testRemoveAnItem() {

		Books book1 = new Books(1000, "Ross Manclark");

		LibraryManager l1 = new LibraryManager();

		l1.removeAnItem(book1);
		
		

	}

}
