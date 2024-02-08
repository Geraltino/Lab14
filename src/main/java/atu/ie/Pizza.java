package atu.ie;

public class Pizza implements MenuItem{
    private String name;
    private double price;
    private String ingredients;

    public Pizza(String name, double price, String ingredients){
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
