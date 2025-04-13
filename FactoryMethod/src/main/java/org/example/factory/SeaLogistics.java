package org.example.factory;

import org.example.product.Transport;
import org.example.product.impl.Ship;

/**
 * 实现具体工厂：SeaLogistics
 */
public class SeaLogistics extends Logistics{

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
