public class Doctor extends Person{
    String specialist;

    public Doctor(){

    }

    public Doctor(String name, String address, String specialist){
        super(name,address);
        this.specialist = specialist;
    }
    void surgery(){
        System.out.println("I can surgery operation Patiens");
    }

    @Override
    void greeting(){
        super.greeting();//memanggil method greeting pada person class
        System.out.println("My occupation is a "+specialist+" doctor.");
    }
    
}
