public class Person{
    String name, address;
    final String country ="Indonesia";

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", Myname is" + name + ".");
    }

    //method return value
    String sayAddress(){
        return "I, come from " + address +".";
    }
}