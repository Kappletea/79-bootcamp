package childs;
import parents.Person;

public class Programmer extends Person {
    private String technology;

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
        System.out.println("Hello my name is "+ getName()+ ".");
        System.out.println("I, come from "+ getAddress()+ ".");
        System.out.println("My job is a "+technology+" programmer");
    }

     // setter dan getter
    public String getTechnology() {
        return this.technology;
    }

    public void setTechnology(String tech) {
        this.technology = tech;
    }
}
