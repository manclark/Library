package Library;

public class Runner {

	public static void main(String[] args) {

		Books book1 = new Books(1000, "Ross Manclark");

		LibraryManager l1 = new LibraryManager();

		l1.addInItem(book1);
		l1.removeAnItem(book1.getiDNumber());
	}

}
