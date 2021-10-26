package lessons.lesson26102021;

import lombok.SneakyThrows;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class DOMExample {

    @SneakyThrows
    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        Document parse = documentBuilder.parse("src/main/resources/xmlDocs/companies.xml");

        Node firstChild = parse.getFirstChild();
//        System.out.println(firstChild.getNodeName());
        NodeList childNodes = firstChild.getChildNodes();
//        for (int i = 0; i < childNodes.getLength(); i++) {
//            System.out.println(childNodes.item(i).getNodeName() + " value: " +
//                    childNodes.item(i).getNodeValue() + " text: " +
//                    childNodes.item(i).getTextContent());
//        }

        Node item = childNodes.item(3);
        NodeList childNodes1 = item.getChildNodes();
        Node item1 = childNodes1.item(1);
        System.out.println(item1.getNodeName());
        System.out.println(item1.getTextContent());
    }
}
