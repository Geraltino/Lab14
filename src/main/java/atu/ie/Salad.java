package atu.ie;

public class Salad implements MenuItem{
    private String name;
    private double price;
    private String ingredients;

    public Salad(String name, double price, String ingredients){
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }
    public Salad() {
        name = "";
        price = 0;
        ingredients = "";
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return ingredients;
    }

}
