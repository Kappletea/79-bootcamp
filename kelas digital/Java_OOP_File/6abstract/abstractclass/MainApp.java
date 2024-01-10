public class MainApp {
    //jika abstrak, tidak bisa secara langsung instansiasi object seperti berikut:
    Product product1 = new Product();

    //tetapi kita dapat membuat objek dari instansiasi child class nya
    Product product2 = new Item();
}
