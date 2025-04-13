package org.example.product;

public class ModernSofa extends Sofa{
    @Override
    public void lieOn() {
        System.out.println("Lying on a modern sofa");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}
