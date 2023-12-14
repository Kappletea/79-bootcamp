package childs;
import parents.Person;

public class Teacher extends Person {
    public String subject;


    public Teacher(){

    }

    public Teacher(String name, String address, String subject){
        super(name,address);
        this.subject = subject;
    }

    public void teaching(){
        System.out.println("I can teach "+ subject +", so anyone who wants to learn can talk to me.");
    }

    @Override
    public void greeting(){
        super.greeting();//memanggil method greeting pada person class
        System.out.println("My job is a "+ subject+ "teacher.");
    }
}
