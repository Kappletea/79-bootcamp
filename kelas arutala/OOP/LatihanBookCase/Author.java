package LatihanBookCase;

public abstract class Author {
    protected String firstName;
    protected String lastName;
    protected String country;
    protected int age;
    protected String rating;
    protected String serial;

    public Author() {
        this.firstName = "";
        this.lastName = "";
        this.country = "";  
        this.age =  0;  
        this.rating = "";
        this.serial = "";
    }

    public abstract String getFullName();
    public abstract String toString();
    public abstract void setFirstName();
    public abstract void setLastName();
    public abstract void setCountry();
    public abstract void setAge();
    public abstract String getFirstName();
    public abstract int getAge();
    public abstract String getCountry();
    public abstract String getLastName();
}
