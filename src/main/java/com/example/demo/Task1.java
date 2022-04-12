package com.example.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String url = "https://www.cbr.ru/";
        Document doc = Jsoup.connect(url)
                .timeout(5000)
                .get();
        System.out.println(doc.title());
        System.out.println(doc.toString());

    }
}
