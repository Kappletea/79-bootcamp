public abstract class MainApp {
    public static void main(String[] args) {
        //constructor param
        Person person1 = new Person("Eko", "Tegal");
        person1.sayHello("Padepokan 79");
        System.out.println(person1.sayAddress());
        
        //constructor default
        Person person2 = new Person();
        person2.name = "Joko";
        person2.address = "surabaya";
        person2.sayHello("Padepokan79");
        System.out.println(person2.sayAddress());

        //membuat objek dari class person menggunakan construc 1
        Person person3 = new Person("Budi");
        person3.address = "Bandung";
        person3.sayHello("Padepokan79");
        System.out.println(person3.sayAddress());

    }
}
