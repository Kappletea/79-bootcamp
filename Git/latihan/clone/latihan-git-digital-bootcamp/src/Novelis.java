
public class Novelis extends Author {
	private Boolean serial;
	private String rating;
	
	public Novelis() {
		// TODO Auto-generated constructor stub
	}

	public Novelis(String firstName, String lastName, String country, int age, Boolean serial, String rating) {
		super(firstName, lastName, country, age);
		this.serial = serial;
		this.rating = rating;
	}

	public Boolean getSerial() {
		return serial;
	}

	public void setSerial(Boolean serial) {
		this.serial = serial;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + 
				"\nSerial : " + serial +
				"\nRating : " + rating;
	}
}
