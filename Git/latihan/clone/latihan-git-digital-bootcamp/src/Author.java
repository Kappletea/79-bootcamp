
public class Author {
	//Attribute
	private String firstName;
	private String lastName;
	private String country;
	private int age;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	public Author(String firstName, String lastName, String country, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.age = age;
	}
	
	//Addtitional Method
	public String getFullName() {
		return firstName + " " + lastName;
	};
	
	public String toString() {
		
		return "Author Name : " + getFullName();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	};
}
