public class Teacher extends Person {
    String subject;

    void teaching(){
        System.out.println("I can teach "+ subject +", so anyone who wants to learn can talk to me.");
    }

    @Override
    void greeting(){
        super.greeting();//memanggil method greeting pada person class
        System.out.println("My job is a "+ subject+ "teacher.");
    }
}
