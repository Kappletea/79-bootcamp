public abstract class MainApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "eko";
        person1.address = "tegal";
        person2.name = "Joko";
        person2.address = "Surabaya";


        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Padepokan 79");
        person2.sayHello("Padepokan 79");
        System.out.println(person2.sayAddress());


    }
}
