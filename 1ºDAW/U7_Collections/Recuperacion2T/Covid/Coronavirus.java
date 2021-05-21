package Covid;

import java.io.*;
import java.util.*;

public class Coronavirus {
    public static void main(String[] args) {
        Medico medico =new Medico("Pedro", "Larrubia",2,"San Juan");
        Paciente p1=new Paciente("pepe",20,50.2,true,medico,'a');
        Paciente p2=new Paciente("juan",40,10.2,false,medico,'a');

        Coronavirus covid=new Coronavirus();
        covid.addPaciente(p1.getCepa(),p1);
        covid.addPaciente(p2.getCepa(),p2);
        System.out.println(covid.getPacientes());

        covid.darDeAltaPaciente(p1);
        System.out.println(covid.getPacientes());
        covid.addPaciente(p1.getCepa(),p1);

        covid.pacientesDeUnDocotor(2);
        covid.pacientesPorEdad('a');
        covid.pacientesPorPeso('a');

        //covid.guardarPacientes();
        covid.cargarPacientes();

    }
    String nombreCientifico;
    Map<Character, Set<Paciente>> pacientes;

    public Coronavirus() {
        this.nombreCientifico = "COVID-19";
        this.pacientes = new HashMap<>();
    }

    public boolean addPaciente(Character cepa,Paciente p){
        if (cepa.equals(p.getCepa())){
            Set<Paciente> nuevoSet=new HashSet<>();
            if (!pacientes.containsKey(cepa)){
                nuevoSet.add(p);
                pacientes.put(cepa,nuevoSet);
                return true;

            } else{
                pacientes.get(cepa).add(p);
            }
            return true;
        }
        System.out.println("no concuerda la cepa del paciente con la cepa del conjunto donde lo quieres meter");
        return false;
    }

    public boolean darDeAltaPaciente(Paciente p){
        Collection<Set<Paciente>> listaConjuntos= pacientes.values();

        for (Set<Paciente> conjuntoAux : listaConjuntos) {
            if (conjuntoAux.contains(p)) {
                conjuntoAux.remove(p);
                return true;
            } else {
                System.out.println("No se ha encontrado el paciente");
                return false;
            }
        }
        return false;
    }

    public void pacientesDeUnDocotor(int ncolegiado){
        Collection<Set<Paciente>> listaConjuntos= pacientes.values();

        for (Set<Paciente> conjuntoAux : listaConjuntos) {
            for (Paciente p : conjuntoAux) {
                if (p.getMedico().getNumColegiado() == ncolegiado) {
                    System.out.print(p);
                }
            }
        }
    }

    public void pacientesPorPeso(Character cepa){
        List<Paciente> nuevoConjunto=new ArrayList<>(pacientes.get(cepa));
        Collections.sort(nuevoConjunto);
        System.out.println(nuevoConjunto);
    }
    public void pacientesPorEdad(Character cepa){
        List<Paciente> nuevoConjunto=new ArrayList<>(pacientes.get(cepa));
        Collections.sort(nuevoConjunto, new Comparator<Paciente>() {
            @Override
            public int compare(Paciente o1, Paciente o2) {
                return o1.getEdad()-o2.getEdad();
            }
        });
        System.out.println(nuevoConjunto);
    }


    public void guardarPacientes(){
        try {
            ObjectOutputStream writer=new ObjectOutputStream(new FileOutputStream("pacientes.dat"));
            Collection<Set<Paciente>> totalPacientes =pacientes.values();
            Iterator<Set<Paciente>> it= totalPacientes.iterator();
            while (it.hasNext()){
                Set<Paciente> aux= it.next();
                for (Paciente p:aux) {
                    writer.writeObject(p);
                }
            }
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void cargarPacientes(){
        try {
            ObjectInputStream leer=new ObjectInputStream(new FileInputStream("pacientes.dat"));
            while (true){
                Paciente p= (Paciente)leer.readObject();
                addPaciente(p.getCepa(),p);
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }






    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public Map<Character, Set<Paciente>> getPacientes() {
        return pacientes;
    }

    public void setPacientes(Map<Character, Set<Paciente>> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "Coronavirus{" +
                "nombreCientifico='" + nombreCientifico + '\'' +
                ", pacientes=" + pacientes +
                '}';
    }
}
