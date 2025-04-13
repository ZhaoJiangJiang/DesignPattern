package org.example.factory;

import org.example.product.Transport;
import org.example.product.impl.Truck;

/**
 * 实现具体工厂 RoadLogistics
 */
public class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
