package org.example.product;

public class ModernCoffeeTable extends CoffeeTable{
    @Override
    public void putCoffee() {
        System.out.println("Putting coffee on a modern table");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}
