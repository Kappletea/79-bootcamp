package LatihanBookCase;

public class Novel extends EBook{
    
    Novel(String bookCode, String title, Author author, Publisher publisher, boolean volumeSeries, String genre, double tax){
        super();
        this.bookCode = bookCode;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.volumeSeries = volumeSeries;
        this.genre = genre;
        this.tax = tax;
    }


    public String toString(){}
    @Override
    public String getFullName(){

    }
    @Override
    public void setTittle(){

    }
    @Override
    public void setPrice(){

    }
    @Override
    public String getBookCode(){

    }
    @Override
    public String getTitle(){

    }
    @Override
    public Double getPrice(){

    }
  
}
