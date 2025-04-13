package org.example.product;

public class VictorianCoffeeTable extends CoffeeTable{

    @Override
    public void putCoffee() {
        System.out.println("Putting coffee on a victorian table");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}
