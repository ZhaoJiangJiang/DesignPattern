package org.example.factory;

import org.example.product.Transport;
import org.example.product.impl.Airplane;

public class AirLogistics extends Logistics{

    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
