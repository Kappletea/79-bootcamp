public class Programmer extends Person {
    String technology;

    void hacking(){
        System.out.println("I can hack a website");
    }

    void coding(){
        System.out.println("I can create an application using technology: "+technology+".");
    }

    @Override
    void greeting(){
        System.out.println("Hello my name is "+ name);
        System.out.println("I, came from "+ address);
        System.out.println("My job is a "+technology+" programmer");
    }
}
