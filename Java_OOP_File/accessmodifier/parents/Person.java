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
}
