package Library;

import java.util.ArrayList;
import java.util.stream.Collectors;

import Library.Books;

public class LibraryManager {

	private ArrayList<Library> libraryList = new ArrayList<Library>();

	public void listOfItemsInLibrary() {

		libraryList.stream().forEach(System.out::println);

	}

	public void addInItem(Books book) {

		libraryList.add(book);

	}

	public void removeAnItem(int iDNumber) {

		this.libraryList.removeAll(
				libraryList.stream().filter(book -> book.getiDNumber() != iDNumber).collect(Collectors.toList()));

	}

	public void removeAnItem(Books book1) {
		// TODO Auto-generated method stub
		
	}

}