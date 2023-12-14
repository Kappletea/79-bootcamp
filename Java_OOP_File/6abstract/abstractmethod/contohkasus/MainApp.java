import childs.Circle;
import childs.Triangle;
import parents.Shape;

public class MainApp {
    public static void main(String[] args) {
        Shape lingkaran = new Circle(20, "Biru");
        Shape segitiga = new Triangle(10, 15, "Yellow");

        System.out.println("luas lingkaran berwarna "+lingkaran.getColor()+" adalah "+lingkaran.getArea()+".");
        System.out.println("luas segitigas berwarna "+segitiga.getColor()+" adalah "+segitiga.getArea()+".");
    }
}