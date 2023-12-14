package childs;
import parents.Product;

public class Item extends Product {
    private int price;

    public Item(){

    }

    public Item(String name, int price){
        super(name);
        this.price = price;
    }

    @Override
    //implementasi method abstract pada child class supaya menjadi bentuk konkrit dan jelas
    public void printInformation(){
        System.out.println("Product Name: " + getName());
        System.out.println("Product Price: "+ getPrice());
    }

    public int getPrice(){
        return price;
    }

    public int setPrice(int price){
        this.price = price
    }
}
