package com.ioc;

public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/book/it?page=10&size20&name=spring-boot";

        Encoder encoder = new Encoder(new Base64Encoder());
        String result = encoder.encode(url);
        System.out.println(result);


    }
}
