package Library;

public class Books extends Library {

	private String author;

	public Books(int iDNumber, String author) {
		super(iDNumber);

		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "The book added, iD number:" + getiDNumber() + " Written by: " + getAuthor();

	}
}
