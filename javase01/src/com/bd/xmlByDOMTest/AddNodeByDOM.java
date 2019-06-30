package com.bd.xmlByDOMTest;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class AddNodeByDOM {
    Document doc = null;

    public AddNodeByDOM(String srcPath) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = builder.parse(srcPath);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveNodeByDOM(String outputPath) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(outputPath);
            transformer.transform(source,result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    public void addElement(String outputPath) {
        Element ele = doc.createElement("book");
        ele.setAttribute("name", "java讲义");
        Element childEle = doc.createElement("Type");
        childEle.setAttribute("name", "信息类书籍");
        ele.appendChild(childEle);
        Element root = doc.getDocumentElement();
        root.appendChild(ele);
        saveNodeByDOM(outputPath);

    }

    public static void main(String[] args) {
        AddNodeByDOM instance = new AddNodeByDOM("asserts/book.xml");
        instance.addElement("asserts/newBook.xml");
    }
}
