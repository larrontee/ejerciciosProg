import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class PracticaDom {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("menu.xml"));
            //mostrarXML(doc);
            //cantidadPlatos(doc);
            platoMasCaro(doc);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
    }

    public static void mostrarXML(Document doc) {
        Node root = doc.getDocumentElement();
        NodeList hijos = root.getChildNodes();
        for (int i = 0; i < hijos.getLength(); i++) {
            if (hijos.item(i).getNodeType() == Node.ELEMENT_NODE) {

                Element food = (Element) hijos.item(i);
                NodeList nietos = hijos.item(i).getChildNodes();
                System.out.println("<" + food.getTagName() + ">");
                for (int j = 0; j < nietos.getLength(); j++) {
                    if (nietos.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        Element caracteristica = (Element) nietos.item(j);
                        NodeList contenido = hijos.item(j).getChildNodes();
                        System.out.println("    <" + caracteristica.getTagName() + ">");
                        System.out.println("        " + caracteristica.getTextContent());
                        System.out.println("    </" + caracteristica.getTagName() + ">");
                    }
                }
                System.out.println("</" + food.getTagName() + ">");
            }
        }
    }

    public static void cantidadPlatos(Document doc) {
        Node root = doc.getDocumentElement();
        NodeList hijos = root.getChildNodes();
        int contador=0;
        for (int i = 0; i < hijos.getLength(); i++) {
            if (hijos.item(i).getNodeType() == Node.ELEMENT_NODE) {
                contador++;
            }
        }
        System.out.println("numero de platos= "+contador);
    }
    public static void platoMasCaro(Document doc){
        Node root = doc.getDocumentElement();
        NodeList hijos = root.getChildNodes();
        String nombreplato="";
        boolean platomascaro=false;
        Double precio=0.0;
        Double nuevoPrecio=0.0;
        for (int i = 0; i < hijos.getLength(); i++) {
            if (hijos.item(i).getNodeType() == Node.ELEMENT_NODE) {

                Element food = (Element) hijos.item(i);
                NodeList nietos = hijos.item(i).getChildNodes();
                System.out.println("<" + food.getTagName() + ">");
                for (int j = 0; j < nietos.getLength(); j++) {
                    if (nietos.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        Element caracteristica = (Element) nietos.item(j);
                        System.out.println("    <" + caracteristica.getTagName() + ">");
                        if (caracteristica.getTagName().equals("price")){
                            nuevoPrecio=Double.parseDouble(caracteristica.getTextContent());
                            if (nuevoPrecio>precio){
                                precio=nuevoPrecio;
                                platomascaro = true;
                            }
                        }
                        if (caracteristica.getTagName().equals("name") && platomascaro){
                            nombreplato=caracteristica.getTextContent();
                        }
                    }
                }
            }
        }
        System.out.println("Nombre "+nombreplato+" precio"+precio);
    }
}