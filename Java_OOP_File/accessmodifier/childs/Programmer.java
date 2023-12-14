package childs;
import parents.Person;

public class Programmer extends Person {
    public String technology;

    public Programmer(){

    }

    public Programmer(String name, String address, String technology){
        super(name,address);
        this.technology = technology;
    }

    public void hacking(){
        System.out.println("I can hack a website");
    }

    public void coding(){
        System.out.println("I can create an application using technology: "+technology+".");
    }

    @Override
    public void greeting(){
        super.greeting();//memanggil method greeting pada person class
        System.out.println("My job is a "+technology+" programmer");
    }
}
