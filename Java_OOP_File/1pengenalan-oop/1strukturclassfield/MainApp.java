public abstract class MainApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "eko";
        person1.address = "tegal";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
    }
}
