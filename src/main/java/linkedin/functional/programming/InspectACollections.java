package linkedin.functional.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class InspectACollections {

    // Return the total value of the shopping cart in the items array.
    static float getCartTotal(List<Item> items) {
        // Your code goes here. Use an internal iterator (Java's forEach() method)
        // to add each item's value to the cart.
        float sum=0;
        for(Item item: items){
            sum = sum + (item.getPrice() * item.getQuantity());
        }
        return sum;
    }

    static float getCartTotal_2(List<Item> items) {
        AtomicReference<Float> total = new AtomicReference<Float>(0f);
        items.forEach(item -> {
            total.updateAndGet(p -> p + item.getPrice() * item.getQuantity());
        });
        return total.get();
    }

    // A model class holding each item's values
    public static class Item {
        private int id;
        private String name;
        private float price;
        private int quantity;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public Item(int id, String name, float price, int quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "[" + this.id + ", " + this.name + ", " + this.price + "]";
        }
    }

    public static void main(String[] args) {
        List<InspectACollections.Item> items = new ArrayList<>();
        items.add(new InspectACollections.Item(1, "shirt", 100, 2));
        items.add(new InspectACollections.Item(2, "shoes", 3800, 1));
        items.add(new InspectACollections.Item(3, "pants", 1500, 3));
        items.add(new InspectACollections.Item(4, "hat", 70, 5));
        items.add(new InspectACollections.Item(5, "jacket", 1250, 1));
        float result = InspectACollections.getCartTotal(items);
        float result_2 = InspectACollections.getCartTotal_2(items);
        System.out.println(result);
        System.out.println(result_2);
    }
}
