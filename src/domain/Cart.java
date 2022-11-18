package domain;

import java.util.ArrayList;
import java.util.List;

public class Cart{
    private final List<LineItem> items;
    private final List<Product> removedProducts;

    public Cart() {
        this.items = new ArrayList<>();

        removedProducts = new ArrayList<>();
    }

    public void addLineItem(LineItem item){
        items.add(item);
    }

    public void removeItem(Product product)
    {
        removedProducts.add(product);
        items.removeIf((item)->item.product.equals(product));
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }

    public void listOfItems(){
        System.out.println(items);
    }

    public List<Product> getRemovedProducts() {
        return removedProducts;
    }
}
