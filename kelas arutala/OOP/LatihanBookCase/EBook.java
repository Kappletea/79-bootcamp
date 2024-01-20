package LatihanBookCase;

public abstract class EBook {
    protected String bookCode;
    protected String title;
    protected Author author;
    protected Publisher publisher;
    protected boolean volumeSeries;
    protected String genre;
    protected double tax;

    public EBook() {
        this.bookCode = "";
        this.title = "";
        this.author = new Author();  
        this.publisher = new Publisher();  
        this.volumeSeries = "";
        this.genre = "";
        this.tax = 0.0;
    }

    public String toString(){}
    public abstract String getFullName();
    public abstract void setTittle();
    public abstract void setPrice();
    public abstract String getBookCode();
    public abstract String getTitle();
    public abstract Double getPrice();
    

    
}
