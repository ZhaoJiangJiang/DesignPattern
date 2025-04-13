package org.example.factory;

import org.example.product.Chair;
import org.example.product.CoffeeTable;
import org.example.product.Sofa;

/**
 * 定义抽象工厂接口
 */
public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
