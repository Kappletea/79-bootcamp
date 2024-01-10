public class Programmer extends Person {
    String technology;

    public Programmer(){

    }

    public Programmer(String name, String address, String technology){
        super(name,address);
        this.technology = technology;
    }

    void hacking(){
        System.out.println("I can hack a website");
    }

    void coding(){
        System.out.println("I can create an application using technology: "+technology+".");
    }

    @Override
    void greeting(){
        super.greeting();//memanggil method greeting pada person class
        System.out.println("My job is a "+technology+" programmer");
    }
}
