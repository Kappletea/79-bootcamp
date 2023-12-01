
public class Comic extends Book {
	private Boolean volumeSeries;
	
	public Comic() {
		// TODO Auto-generated constructor stub
	}

	public Comic(String bookCode, String title, Mangaka author, Publisher publisher, Double price,
			Boolean volumeSeries) {
		super(bookCode, title, author, publisher, price);
		this.volumeSeries = volumeSeries;
	}

	public Boolean getVolumeSeries() {
		return volumeSeries;
	}

	public void setVolumeSeries(Boolean volumeSeries) {
		this.volumeSeries = volumeSeries;
	}
	@Override
	public void calculatePrice() {
		// TODO Auto-generated method stub
		super.calculatePrice();
	}
}
