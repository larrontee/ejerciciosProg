import org.w3c.dom.events.Event;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class RecorridoStax {
    public static void main(String[] args) {
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("Biblioteca.xml"));
            Scanner sc = new Scanner(System.in);

            System.out.println("nombre del autor");
            String aut=sc.nextLine();
            boolean dentrolibro= false;
            boolean dentropaginas=false;
            boolean menor=false;
            int npags=1000;
            String librocorto = "";
            boolean dentro = false;
            int contador=0;
            int contadorlibros=0;


            while (xmlReader.hasNext()){
                XMLEvent e = xmlReader.nextEvent();
                if (e.isStartElement()){
                    StartElement startTag= e.asStartElement();

                    if (startTag.getName().getLocalPart().equals("autor")){
                        dentro = true;
                    }
                    if (startTag.getName().getLocalPart().equals("libro")){
                        dentrolibro = true;
                        contadorlibros++;
                    }
                    if (startTag.getName().getLocalPart().equals("paginas")){
                        dentropaginas = true;
                    }

                } else if (e.isEndElement()){
                    EndElement endElement = e.asEndElement();
                    if (endElement.getName().getLocalPart().equals("libro")) {
                        contadorlibros++;
                        dentrolibro = false;
                    }
                    if (endElement.getName().getLocalPart().equals("titulo")) {
                        dentro = false;
                    }
                    if (endElement.getName().getLocalPart().equals("paginas")) {
                        dentropaginas=false;
                    }
                } else if (e.isCharacters()){
                    Characters texto = e.asCharacters();
                    if (dentropaginas){
                        String paginas=texto.getData();
                        npags =Integer.parseInt(paginas);

                    }
                    if (dentrolibro){
                        String libro = texto.getData();

                    }
                    if (dentro){
                        if (texto.getData().equals(aut)){
                            contador++;
                        }

                    }
                }
            }

            System.out.println("numero de libros de "+aut+" = "+contador);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
