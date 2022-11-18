package domain;

public class Product{

    public Product(String name) {
        this.name = name;
    }

    String name;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
