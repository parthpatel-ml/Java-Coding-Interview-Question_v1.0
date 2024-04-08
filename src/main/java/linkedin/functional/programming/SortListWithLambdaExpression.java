package linkedin.functional.programming;

import java.util.ArrayList;
import java.util.List;

public class SortListWithLambdaExpression {
    public static void main(String[] args) {
        List<SortListWithLambdaExpression.Item> items = new ArrayList<>();
        items.add(new SortListWithLambdaExpression.Item(1, "shirt", 100));
        items.add(new SortListWithLambdaExpression.Item(2, "shoes", 3800));
        items.add(new SortListWithLambdaExpression.Item(3, "pants", 1500));
        items.add(new SortListWithLambdaExpression.Item(4, "hat", 70));
        items.add(new SortListWithLambdaExpression.Item(5, "jacket", 1250));
        List<SortListWithLambdaExpression.Item> result = SortListWithLambdaExpression.sortList(items);
        System.out.println(result);
    }

    static List<Item> sortList(List<Item> items) {

        List<Item> result = new ArrayList<>(items);
        // Your code goes here. Sort the result list using a lambda expression.
        result.sort((Item item1, Item item2) -> (int) (item1.getPrice() - item2.getPrice()));
        return result;
    }

    public static class Item {
        int id;
        String name;
        float price;

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

        public Item(int id, String name, float price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "[" + this.id + ", " + this.name + ", " + this.price + "]";
        }
    }

}
