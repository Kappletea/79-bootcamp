public class Person{
    String name, address;
    final String country ="Indonesia";

    Person(){

    }

    Person(String paramName){
        name = paramName;
    }
    //constructor overloading
    Person(String paramName, String paramAddress){
        this(paramName);
        address = paramAddress;
    }
    
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", Myname is " + name + ".");
    }
    
    //method return value
    String sayAddress(){
        return "I, come from " + address +".";
    }
}