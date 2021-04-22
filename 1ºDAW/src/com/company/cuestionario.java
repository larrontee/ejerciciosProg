package com.company;

import java.util.Scanner;

public class cuestionario {
    public static void main(String[] args) {
        int cuernometro=0;
        int valorcuernometro=0;
        Scanner sc = new Scanner(System.in);


        System.out.println("cuestionario si tu pareja es infiel");
        System.out.println("introduce 1 si es no, 2 si es algo y 3 si ocurre");

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        cuernometro= sc.nextInt();
        if (cuernometro<1 || cuernometro>3){
            System.out.println("valor no valido repita la encuesta.");
        } else{
            valorcuernometro+=cuernometro;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        cuernometro= sc.nextInt();
        if (cuernometro<1 || cuernometro>3){
            System.out.println("valor no valido repita la encuesta.");
        } else{
            valorcuernometro+=cuernometro;
        }
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
        cuernometro= sc.nextInt();
        if (cuernometro<1 || cuernometro>3){
            System.out.println("valor no valido repita la encuesta.");
        } else{
            valorcuernometro+=cuernometro;
        }
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        cuernometro= sc.nextInt();
        if (cuernometro<1 || cuernometro>3){
            System.out.println("valor no valido repita la encuesta.");
        } else{
            valorcuernometro+=cuernometro;
        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
        cuernometro= sc.nextInt();
        if (cuernometro<1 || cuernometro>3){
            System.out.println("valor no valido repita la encuesta.");
        } else{
            valorcuernometro+=cuernometro;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        cuernometro= sc.nextInt();
        if (cuernometro<1 || cuernometro>3){
            System.out.println("valor no valido repita la encuesta.");
        } else{
            valorcuernometro+=cuernometro;
        }
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        cuernometro= sc.nextInt();
        if (cuernometro<1 || cuernometro>3){
            System.out.println("valor no valido repita la encuesta.");
        } else{
            valorcuernometro+=cuernometro;
        }
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        cuernometro= sc.nextInt();
        if (cuernometro<1 || cuernometro>3){
            System.out.println("valor no valido repita la encuesta.");
        } else{
            valorcuernometro+=cuernometro;
        }
        System.out.println("9. Has notado que últimamente se perfuma más");
        cuernometro= sc.nextInt();
        if (cuernometro<1 || cuernometro>3){
            System.out.println("valor no valido repita la encuesta.");
        } else{
            valorcuernometro+=cuernometro;
        }
        System.out.println("10. ¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
        cuernometro= sc.nextInt();
        if (cuernometro<1 || cuernometro>3){
            System.out.println("valor no valido repita la encuesta.");
        } else{
            valorcuernometro+=cuernometro;
        }


        System.out.println("tu puentuacion es"+ valorcuernometro);
        if (valorcuernometro <= 10){
            System.out.println("no tienes cuernos");
        } else {
            System.out.println("tienes cuernos");
    }   }
}