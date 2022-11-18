package domain;

import java.util.ArrayList;
import java.util.List;

public class Cart{
    private final List<LineItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addLineItem(LineItem item){
        items.add(item);
    }

    public String listCartItems() {
        return "Cart{" +
                "items=" + items +
                '}';
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}
