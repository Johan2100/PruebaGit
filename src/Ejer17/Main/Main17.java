package Ejer17.Main;

import Ejer17.Model.pLibreta.Libreta;
import Ejer17.Model.pPersona.Persona;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main17 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        int stePosLibre = 0;
        do{

            Persona[] personas = new Persona[100];
            Libreta libreta = new Libreta(personas);
            System.out.println("""
                    *** LIBRETA DE DIRECCIONES ***
                    
                    1. Agregar Persona
                    2. Eliminar Personas
                    3. Conteo de Persona
                    0. Salir
                    """);
            op = sc.nextInt();

            switch (op){
                case 0 ->{
                    System.out.println("Saliendo del programa....");
                    System.exit(00);
                }

                case 1->{
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Dirección: ");
                    String dir = sc.nextLine();
                    Persona p = new Persona(nombre,edad,dir);

                    libreta.agregarPersona(p);

                }

                case 2->{
                    sc.nextLine();
                    System.out.print("Introduzca el nombre de la persona: ");
                    String nombre = sc.nextLine();
                    libreta.eliminarPersona(nombre);
                }

                default -> {
                    System.err.println("Error. Carácter no válido ");
                }


            }
        }while (op != 0);

    }
}
