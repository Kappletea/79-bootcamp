public class Person{
    String name, address;
    final String country ="Indonesia";

    Person(){

    }

    Person(String paramName){
        name = paramName;
    }
    //constructor overloading
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", Myname is " + name + ".");
    }
    
    //method return value
    String sayAddress(){
        return "I, come from " + address +".";
    }
}