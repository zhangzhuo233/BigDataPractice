package com.bd.xmlByDOMTest;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class SaveXMLByDOM {
    void doTransFormer() {
        try {
            // 创建TransformerFactory对象
            TransformerFactory factory = TransformerFactory.newInstance();
            // 创建Tranformer对象用来设置属性
            Transformer former = factory.newTransformer();
            // 创建DOMSource对象
            DOMSource source = new DOMSource();
            // Todo: 设置输出属性
            // 创建StreamResult对象
            StreamResult result = new StreamResult(new File("asserts/newBook.xml"));
            // 将XML保存到指定文件中
            former.transform(source, result);

        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SaveXMLByDOM _ = new SaveXMLByDOM();
        _.doTransFormer();
    }
}
