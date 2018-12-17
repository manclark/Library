package Library;

public class Person extends Library {

	private String name;

	public Person(int iDNumber, String name) {
		super(iDNumber);

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
