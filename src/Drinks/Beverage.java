package Drinks;

public abstract class Beverage {

    protected String description = "Unknown Drinks.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}