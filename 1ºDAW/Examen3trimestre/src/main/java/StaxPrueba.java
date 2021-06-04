

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StaxPrueba {
    public static void main(String[] args) {
        int contador = 0;
        Double caloriastotales = 0.0;
        String platoMasCalo="";
        String platoDef="";
        String tagActual="";
        Double caloriasplato=0.0;
        Double caloriasMax=0.0;

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("menu.xml"));

            while (xmlReader.hasNext()) {

                XMLEvent event= xmlReader.nextEvent();

                if (event.isEndElement()){
                    EndElement e=event.asEndElement();
                    if (e.getName().getLocalPart().equals("food")){
                        contador++;
                        platoMasCalo="";
                    }
                    tagActual="";
                } else if(event.isStartElement()) {
                    StartElement e=event.asStartElement();

                    if (e.getName().getLocalPart().equals("calories")){
                        tagActual="calorias";
                    }else if (e.getName().getLocalPart().equals("name")){
                        tagActual="nombre";
                    }else if (e.getName().getLocalPart().equals("price")){
                        tagActual="precio";
                    }else if (e.getName().getLocalPart().equals("description")){
                        tagActual="info";
                    }
                } else if (event.isCharacters()) {
                    Characters c = event.asCharacters();
                    if(tagActual.equals("nombre")){
                        platoMasCalo+="Nombre: "+c.getData();
                    }else if(tagActual.equals("precio")){
                        platoMasCalo+="Precio: "+c.getData();
                    }else if(tagActual.equals("info")){
                        platoMasCalo+="Info: "+c.getData();
                    }else if(tagActual.equals("calorias")){
                        caloriasplato=Double.parseDouble(c.getData());
                        caloriastotales+=Double.parseDouble(c.getData());
                        if (caloriasMax<caloriasplato){
                            caloriasMax=caloriasplato;
                            platoMasCalo+="Calorias: "+c.getData();
                            platoDef=platoMasCalo;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Cantidad de plato del menu= "+ contador);
        System.out.println("Total calorias "+ caloriastotales);
        System.out.println(platoDef);
    }
}
