import domain.Cart;
import domain.LineItem;
import domain.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hell");
        Cart cart = new Cart();

        Product applePencil = new Product("Apple Pencil");
        cart.addLineItem(new LineItem(applePencil, 2));

        Product sonyHeadphones = new Product("Sony headphones");
        cart.addLineItem(new LineItem(sonyHeadphones, 1));

        cart.listCartItems();
    }
}





