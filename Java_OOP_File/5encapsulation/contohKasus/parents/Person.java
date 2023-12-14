package parents;

public class Person {
    public String name;
    public String address;

    public Person(){
        super();
    }

    public Person(String name, String address){
        super();
        this.name = name;
        this.address = address;
    }

    public void greeting(){
        System.out.println("Hello my name is "+ name + ".");
        System.out.println("I, come from " + address+ ".");
    }

    // method getter setter
    // getter
    public boolean isExpensive() {
        return this.expensive;
    }

    // setter
    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }

    // tipe data object
    // getter
    public String getName() {
        return this.name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // tipe data primitif (int)
    // getter
    public int getId() {
        return this.id;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }
}
