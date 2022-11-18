import domain.Cart;
import domain.LineItem;
import domain.Price;
import domain.Product;

import java.util.Currency;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        /*Product applePencil = new Product("Apple Pencil");
        cart.addLineItem(new LineItem(applePencil, 2));
*/
        Product sonyHeadphones = new Product("Sony headphones", new Price(5));
        cart.addLineItem(new LineItem(sonyHeadphones, 1));

        /*cart.listOfItems();

        cart.removeItem(applePencil);

        System.out.println("List after removing items: ");*/

        cart.listOfItems();

        System.out.println("removed items:" +cart.getRemovedProducts());

        Cart cart2 = new Cart();
        Product sonyHeadphones1 = new Product("Sony headphones", new Price(5));
        cart.addLineItem(new LineItem(sonyHeadphones1, 1));

        System.out.println(cart.equals(cart2));


    }
}





