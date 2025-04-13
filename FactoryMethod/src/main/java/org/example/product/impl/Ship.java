package org.example.product.impl;

import org.example.product.Transport;

/**
 * 实现具体产品类 Ship
 */
public class Ship implements Transport {
    @Override
    public String deliver() {
        return "Delivering goods by Ship.";
    }
}
