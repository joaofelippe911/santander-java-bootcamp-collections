package list.shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> itemsList;

    public ShoppingCart() {
        this.itemsList = new ArrayList<>();
    }

    public void addItem(String name, Double value, int quantity) {
        itemsList.add(new Item(name, value, quantity));
    }

    public void removeItem(String name) {
        List<Item> itemsToRemove = new ArrayList<>();

        for (Item item : itemsList) {
            if (item.getName().equalsIgnoreCase(name)) {
                itemsToRemove.add(item);
            }
        }

        itemsList.removeAll(itemsToRemove);
    }

    public double calculateTotalValue() {
        Double totalValue = 0.00;

        for (Item item : itemsList) {
            totalValue += item.getValue() * item.getQuantity();
        }

        return totalValue;
    }

    public void showItems() {
        if (itemsList.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        System.out.println(itemsList);
    }
}
