package org.example.product;

public class ModernChair extends Chair {

    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}
