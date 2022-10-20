package models;

public class Item {
    private String name;
    private int quantity;
    private double price;

    public Item(String name, double price, int quantity) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null/blank");
        }
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be less than zero");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("quantity cannot be less than zero");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Item(Item source) {
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }

    public String toString() {
        return name + ": " + price + " (" + quantity + ")";
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null/blank");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be less than zero");
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("quantity cannot be less than zero");
        }
        this.quantity = quantity;
    }
}

