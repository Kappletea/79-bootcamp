
public class Novel extends Book{
	private String genre;
	
	public Novel() {
		// TODO Auto-generated constructor stub
	}

	public Novel(String bookCode, String title, Novelis author, Publisher publisher, Double price, String genre) {
		super(bookCode, title, author, publisher, price);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public void calculatePrice() {
		// TODO Auto-generated method stub
		super.calculatePrice();
	}
	
}
