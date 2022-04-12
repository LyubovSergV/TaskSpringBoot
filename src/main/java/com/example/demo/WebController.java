package com.example.demo;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class WebController {

    @RequestMapping("/hello")
    public String sayHello(Model model) {
        System.out.println("saying hello world Spring Boot...");
        model.addAttribute("message","Greetings from Nam Ha Minh");
        return "hello";
    }

    @RequestMapping("/code")
   public String titleCBRF() throws IOException {
       String url = "https://www.cbr.ru/";
       Document doc = Jsoup.connect(url).get();
       return doc.title();
    }

}
