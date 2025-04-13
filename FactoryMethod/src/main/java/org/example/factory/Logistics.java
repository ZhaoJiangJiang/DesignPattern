package org.example.factory;

import org.example.product.Transport;

/**
 * 定义抽象工厂
 */
public abstract class Logistics {
    // 工厂方法
    public abstract Transport createTransport();

    public String planDelivery() {
        Transport transport = createTransport();
        return "Planning logistics: " + transport.deliver();
    }
}
