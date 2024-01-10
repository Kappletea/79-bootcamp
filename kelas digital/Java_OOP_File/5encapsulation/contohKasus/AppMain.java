
import childs.Doctor;
import childs.Programmer;
import childs.Teacher;
import parents.Person;

public class AppMain{
    public static void main(String [] args) {
        
        Person person1 = new Person();
        person1.setName("Rofiq");
        person1.setAddress("Bandung");

        System.out.println(person1.getName());
        System.out.println(person1.getAddress());

        
    }   
    
    static void sayHello(Person person){
        String message;

        if (person instanceof Programmer) {
            Programmer programmer = (Programmer) person;
            message = "Hello, "+ programmer.getName() +". seorang programmer "+ programmer.getTechnology() +".";
        } else if (person instanceof Teacher){
            Teacher teacher = (Teacher) person;
            message = "Hello, "+ teacher.getName() +". seorang guru "+ teacher.getSubject() +".";
        } else if (person instanceof Doctor) {
            Doctor doctor = (Doctor) person;
            message = "Hello, "+ doctor.getName() +". seorang dokter "+doctor.getSpecialist()+".";
        } else {
            message = "Hello, "+ person.getName() +".";
        }
        System.out.println(message);

    }
}