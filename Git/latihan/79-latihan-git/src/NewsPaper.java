
public class NewsPaper extends Book {
	private String category;
	private String topic;
	
	public NewsPaper() {
		// TODO Auto-generated constructor stub
	}

	public NewsPaper(String bookCode, String title, Author author, Publisher publisher, Double price, String category,
			String topic) {
		super(bookCode, title, author, publisher, price);
		this.category = category;
		this.topic = topic;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	
}
