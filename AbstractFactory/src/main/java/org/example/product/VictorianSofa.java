package org.example.product;

public class VictorianSofa extends Sofa{
    @Override
    public void lieOn() {
        System.out.println("Lying on an Victorian sofa");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}
