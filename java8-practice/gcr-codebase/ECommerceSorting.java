import java.util.*;

class Item {
    String name;
    int price;
    int discount;

    Item(String name, int price, int discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String toString() {
        return name + " | Price: " + price + " | Discount: " + discount + "%";
    }
}

public class ECommerceSorting {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("Shoes", 3000, 20));
        items.add(new Item("Watch", 5000, 10));
        items.add(new Item("Bag", 2000, 30));

        // Sort by Price
        items.sort((a, b) -> a.price - b.price);
        System.out.println("Sorted by Price:");
        items.forEach(System.out::println);

        // Sort by Discount
        items.sort((a, b) -> b.discount - a.discount);
        System.out.println("\nSorted by Discount:");
        items.forEach(System.out::println);
    }
}
