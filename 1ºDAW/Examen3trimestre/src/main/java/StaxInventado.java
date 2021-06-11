import org.w3c.dom.events.Event;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StaxInventado {
    public static void main(String[] args) {
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("jugadores.xml"));
            while (){

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
