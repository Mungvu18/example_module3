package model;

public class Product {
    private int id;
    private String name;
    private Double price;
    private int amount;
    private String color;
    private String description;
    private String category_name;

    public Product(String name, Double price, int amount, String color, String description, String category_name) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.color = color;
        this.description = description;
        this.category_name = category_name;
    }

    public Product(int id, String name, Double price, int amount, String color, String description, String category_name) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.color = color;
        this.description = description;
        this.category_name = category_name;
    }

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
