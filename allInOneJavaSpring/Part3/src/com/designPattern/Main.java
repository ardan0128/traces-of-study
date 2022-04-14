package com.designPattern;

import com.designPattern.adapter.*;
import com.designPattern.aop.AopBrowser;
import com.designPattern.decorator.*;
import com.designPattern.facade.Ftp;
import com.designPattern.facade.Reader;
import com.designPattern.facade.SftpClient;
import com.designPattern.facade.Writer;
import com.designPattern.observer.Button;
import com.designPattern.observer.IButtonListener;
import com.designPattern.proxy.Browser;
import com.designPattern.proxy.BrowserProxy;
import com.designPattern.proxy.IBrowser;
import com.designPattern.singleton.AClazz;
import com.designPattern.singleton.BClazz;
import com.designPattern.singleton.SocketClient;
import com.designPattern.strategy.*;

import java.util.concurrent.atomic.AtomicLong;

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
        System.out.println();

        /**
         * Electronic110V를 계속 생성하지말고 Singleton으로 사용할 수 있지 않을까
         */

        // Proxy Pattern
        System.out.println("Proxy Pattern");
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();

        IBrowser browser1 = new BrowserProxy("www.naver.com");
        browser1.show();
        browser1.show();
        browser1.show();
        browser1.show();
        browser1.show();
        System.out.println();

        // Aop Pattern
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();
        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        aopBrowser.show();
        System.out.println("loading time : " + end.get());
        System.out.println();

        // Decorator Pattern
        System.out.println("Decorator Pattern");
        ICar audi = new Audi(1000);
        audi.showPrice();

        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();
        System.out.println();

        // Observer Pattern
        System.out.println("Observer Pattern");
        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });
        button.click("메시지 전달 : click 1");
        button.click("메시지 전달 : click 2");
        button.click("메시지 전달 : click 3");
        button.click("메시지 전달 : click 4");
        System.out.println();

        // Facade Pattern
        System.out.println("Facade Pattern");
        SftpClient sftpClient = new SftpClient("www.naver.com", 22, "/home/etc", "text.txt");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
        System.out.println();

        // Strategy Pattern
        System.out.println("Strategy Pattern");
        Encoder encoder = new Encoder();
        EncodingStrategy base64 = new Base64Strategy();
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello design pattern";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);
    }

    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
