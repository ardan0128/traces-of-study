package com.designPattern;

import com.designPattern.adapter.*;
import com.designPattern.singleton.AClazz;
import com.designPattern.singleton.BClazz;
import com.designPattern.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {
        // Singleton Pattern
        System.out.println("Singleton Pattern");
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두 개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
        System.out.println();

        // Adapter Pattern
        System.out.println("Adapter Pattern");
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V cleanerAdapter = new SocketAdapter(cleaner);
        connect(cleanerAdapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);

        /**
         * Electronic110V를 계속 생성하지말고 Singleton으로 사용할 수 있지 않을까
         */
    }

    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
