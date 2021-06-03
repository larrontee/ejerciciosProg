import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ModificacionDOM {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
            DocumentBuilder db= dbf.newDocumentBuilder();
            Document doc=db.parse(new File("Biblioteca.xml"));
            //crearLibro(doc);
            recorriendoDom(doc);
            escribir(doc);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }



    public static void crearLibro(Document doc){
        Scanner sc = new Scanner(System.in);

        Element l= doc.createElement("libro");

        Element t= doc.createElement("titulo");
        System.out.println("introduce el titulo del libro");
        t.setTextContent(sc.nextLine());

        Element a= doc.createElement("autor");
        System.out.println("introduce el autor del libro");
        a.setTextContent(sc.nextLine());

        Element e= doc.createElement("editorial");
        System.out.println("introduce la editorial del libro");
        e.setTextContent(sc.nextLine());

        Element p= doc.createElement("paginas");
        System.out.println("introduce el numero de paginas del libro");
        p.setTextContent(sc.nextLine());

        l.appendChild(t);
        l.appendChild(a);
        l.appendChild(e);
        l.appendChild(p);

        doc.getDocumentElement().appendChild(l);
        escribir(doc);
    }


    public static void escribir(Document doc){

        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origeDom= new DOMSource(doc.getDocumentElement());
            File fichero= new File("ejercicio2.xml");
            StreamResult destino = new StreamResult( fichero);
            transformer.transform(origeDom,destino);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }


    public static void recorriendoDom(Document doc){
        Node root = doc.getDocumentElement();
        NodeList hijos = root.getChildNodes();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < hijos.getLength(); i++) {
            if (hijos.item(i).getNodeType()==Node.ELEMENT_NODE){
                NodeList nietos=hijos.item(i).getChildNodes();
                for (int j = 0; j < nietos.getLength(); j++) {
                    if (nietos.item(j).getNodeType()==Node.ELEMENT_NODE){
                        Element e =(Element) nietos.item(j);
                        if (e.getTagName().equals("autor")){
                            Element pais = doc.createElement("pais");
                            pais.setTextContent("esp");
                            e.appendChild(pais);
                        }
                    }
                }
            }
        }
    }
}
