package domain;

public class Product{

    public Product(String name, Price price) {
        this.name = name;
        this.price = price;
    }

    String name;
    Price price;

   /* @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        *//* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false *//*
        if (!(o instanceof Product)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Product c = (Product) o;

        // Compare the data members and return accordingly
        return ((Product) o).name == this.name;
    }*/

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
