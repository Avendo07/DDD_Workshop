import domain.Cart;
import domain.LineItem;
import domain.Price;
import domain.Product;

import java.util.Currency;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.listOfItems();

        HashMap<String, Price> productPrice = new HashMap<>();

        productPrice.put("Sony headphones", new Price(10));

        Product sonyHeadphones = new Product("Sony headphones", new Price(5));
        cart.addLineItem(new LineItem(sonyHeadphones, 1));




    }
}





