package org.example;

import org.example.factory.FurnitureFactory;
import org.example.factory.impl.ModernFurnitureFactory;
import org.example.factory.impl.VictorianFurnitureFactory;
import org.example.product.Chair;
import org.example.product.CoffeeTable;
import org.example.product.Sofa;


/**
 * 客户端代码
 */
public class Main {
    public static void main(String[] args) {
        // 选择风格
        FurnitureFactory furnitureFactory = new VictorianFurnitureFactory();

        // 创建一套风格统一的家具
        Chair chair = furnitureFactory.createChair();
        Sofa sofa = furnitureFactory.createSofa();
        CoffeeTable coffeeTable = furnitureFactory.createCoffeeTable();

        // 使用家具
        chair.sitOn();
        sofa.lieOn();
        coffeeTable.putCoffee();

        System.out.println(
                "Furniture set: " + chair.getStyle() + ", " +
                        sofa.getStyle() + ", " + coffeeTable.getStyle()
        );
    }
}