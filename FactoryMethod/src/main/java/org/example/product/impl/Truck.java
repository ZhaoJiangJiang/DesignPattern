package org.example.product.impl;

import org.example.product.Transport;

/**
 * 实现具体产品类 Truck
 */
public class Truck implements Transport {

    @Override
    public String deliver() {
        return "Delivering goods by Truck.";
    }
}
