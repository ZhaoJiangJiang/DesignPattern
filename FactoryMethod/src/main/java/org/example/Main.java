package org.example;

import org.example.factory.AirLogistics;
import org.example.factory.Logistics;
import org.example.factory.RoadLogistics;
import org.example.factory.SeaLogistics;

/**
 * 客户端代码
 */
public class Main {
    public static void main(String[] args) {
        // 使用卡车运输
        Logistics roadLogistics = new RoadLogistics();
        System.out.println(roadLogistics.planDelivery());

        // 使用船运输
        Logistics seaLogistics = new SeaLogistics();
        System.out.println(seaLogistics.planDelivery());

        // 使用飞机运输
        Logistics airLogistics = new AirLogistics();
        System.out.println(airLogistics.planDelivery());
    }
}