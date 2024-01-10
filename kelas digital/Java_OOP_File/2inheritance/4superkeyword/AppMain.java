public class AppMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Hendra";
        person1.address = "Garut";

        Teacher teacher1 = new Teacher();
        teacher1.name = "Budi";
        teacher1.address = "Bandung";
        teacher1.subject = "Matematika";

        Doctor doctor1 = new Doctor();
        doctor1.name = "Elis";
        doctor1.address = "Jakarta";
        doctor1.specialist = "Dentist";

        Programmer programmer1 = new Programmer();
        programmer1.name = "Rizki";
        programmer1.address = "Surabaya";
        programmer1.technology = "Javascripts";

        person1.greeting();
        teacher1.greeting();
        doctor1.greeting();
        programmer1.greeting();
    }
}
