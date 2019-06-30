package com.bd.xmlByDOMTest;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ParseXMLByDOM {
    public static void main(String[] args) {
        // 创建一个DocumentBuilderFactory对象
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // 创建一个DocumentBuilder对象
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            // 通过DocumentBuilder对象的parser方法加载books.xml文件到当前项目下
            Document document = builder.parse(new File("asserts/book.xml"));
            // 获取所有book节点的集合
            NodeList bookList = document.getElementsByTagName("book");
            // 通过nodelist的getLength()方法可以获取bookList的长度
            System.out.println("length:" + bookList.getLength());
            // 遍历每一个book节点
            for (int i = 0; i < bookList.getLength(); i++) {
                Node node = bookList.item(i);
                //获取book节点的所有属性集合
                NamedNodeMap attrs = node.getAttributes();
//遍历book的属性
                for (int j = 0; j < attrs.getLength(); j++) {
                    //通过item(index)方法获取book节点的某一个属性
                    Node attr = attrs.item(j);
                    //获取属性名
                    System.out.print("属性名：" + attr.getNodeName());
                    //获取属性值
                    System.out.println("--属性值" + attr.getNodeValue());
                }
                //解析book节点的子节点
                NodeList childNodes = node.getChildNodes();
                //遍历childNodes获取每个节点的节点名和节点值
                System.out.println("第" + (i+1) + "本书共有" +
                        childNodes.getLength() + "个子节点");
                for (int k = 0; k < childNodes.getLength(); k++) {
                    //区分出text类型的node以及element类型的node
                    if (childNodes.item(k).getNodeType() == Node.ELEMENT_NODE) {
                        //获取了element类型节点的节点名
                        System.out.print("第" + (k + 1) + "个节点的节点名："
                                + childNodes.item(k).getNodeName());
                        //获取了element类型节点的节点值
                        System.out.println("--节点值是：" + childNodes.item(k).getFirstChild().getNodeValue());
                        //System.out.println("--节点值是：" + childNodes.item(k).getTextContent());
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
