package domain;

public class LineItem {
    Product product;
    int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
