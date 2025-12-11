package Ejer13.Main13;

import Ejer13.Cafetera;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Capacidad Máxima: ");
        double capMax = sc.nextDouble();

        System.out.print("Cantidad actual: ");
        double capActual = sc.nextDouble();

        Cafetera caf = new Cafetera(capMax,capActual);

        int op;

        do{
            System.out.println();
            System.out.println("""
            ***** SELECIONA OPERACIÓN *****
            Bienvenido 
            1. Llenar
            2. Vaciar 
            3. Servir taza
            4. Agregar café
            5. Estado Máquina 
            0. Apagar
            """);
            op = sc.nextInt();
            System.out.println();
            switch (op){
                case 1 ->{
                    caf.llebarCafetera();
                }
                case 2 ->{
                    caf.vaciarCafetera();
                }
                case 3 ->{
                    System.out.print("Capacidad de la taza: ");
                    double capTaza = sc.nextDouble();
                    System.out.println(caf.servirTaza(capTaza));
                }
                case 4 ->{
                    System.out.print("Cuanto café agregas? : ");
                    double cafe = sc.nextDouble();
                    caf.agregarCafe(cafe);
                }
                case 5 -> {
                    System.out.println("Actual "+caf.getCapacidadActual());
                    System.out.println("Máxima "+caf.getCapacidadMaxima());
                }
                case 0 ->{
                    System.exit(00);
                }
            }

        }while(op != 0);
    }
}
