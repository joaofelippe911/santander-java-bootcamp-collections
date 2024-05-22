package list.shoppingCart;

public class Item {
    private String name;
    private Double value;
    private int quantity;

    public Item(String name, Double value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item {" +
                "nome='" + name + '\'' +
                ", valor=" + value +
                ", quantidade=" + quantity +
                '}';
    }
}
