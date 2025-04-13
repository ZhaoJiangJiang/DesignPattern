package org.example.product;

public class VictorianChair extends Chair {

    @Override
    public void sitOn() {
        System.out.println("Sitting on an ornate Victorian chair");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}
