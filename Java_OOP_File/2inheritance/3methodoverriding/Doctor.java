public class Doctor extends Person{
    String specialist;

    void surgery(){
        System.out.println("I can surgery operation Patiens");
    }

    @Override
    void greeting(){
        System.out.println("Hello my name is "+ name);
        System.out.println("I, came from "+ address);
        System.out.println("My occupation is a "+specialist+" doctor.");
    }
    
}
