package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://metanit.com/java/tutorial/").get();
        var Element0 = document.selectFirst("h1");
        System.out.println(Element0.text());
        var Element2 = document.select("body > div#container > div.outercontainer > div.innercontainer > div.item.center.menC > ol.content > li > ol.subsubcontent > li > p > a");
        var Element1 = document.select("body > div#container > div.outercontainer > div.innercontainer > div.item.center.menC > ol.content > li > p > a");
        System.out.println(Element1.get(0).text());
        System.out.println("   " + Element2.get(1).text());
        System.out.println("   " + Element2.get(2).text());
        System.out.println("   " + Element2.get(3).text());
        System.out.println("   " + Element2.get(4).text());
        System.out.println("   " + Element2.get(5).text());
        System.out.println("   " + Element2.get(6).text());

    }
}