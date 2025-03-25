import java.util.*;
public class Product {
    static Scanner sc=new Scanner(System.in);
    private String name;
    private int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (obj == null || getClass() != obj.getClass())
        return false;
        Product product = (Product) obj;
        return Objects.equals(name, product.name) && price == product.price;
    }
    public static void main(String[] args) {
        Product p1 = new Product(sc.next(), sc.nextInt());
        Product p2 = new Product(sc.next(), sc.nextInt());
        System.out.println(p1.equals(p2));
    }
}