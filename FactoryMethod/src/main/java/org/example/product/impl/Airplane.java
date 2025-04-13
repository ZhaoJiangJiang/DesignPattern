package org.example.product.impl;

import org.example.product.Transport;

public class Airplane implements Transport {

    @Override
    public String deliver() {
        return "Delivering goods by Airplane.";
    }
}
