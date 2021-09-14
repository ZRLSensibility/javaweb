package com.pojo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 * @author ZRL
 * @create 2021-07-12 12:09
 */
public class Dom4jTest {
    @Test
    public void test1(){
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read("src/books.xml");
            System.out.println(document);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test2() throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read("src/books.xml");
        Element rootElement = document.getRootElement();
//        System.out.println(rootElement);

        List<Element> books = rootElement.elements("book");
        for(Element book : books){
            Element nameElement = book.element("name");
            String nameText = nameElement.getText();

            String priceText = book.elementText("price");
            String authorText = book.elementText("author");
            String snValue = book.attributeValue("sn");

            System.out.println(new Book(snValue,nameText,Double.parseDouble(priceText),authorText));
        }

    }


}
