package Ejer14.Main;


import Ejer14.Coche.Coche14;
import Ejer14.Puntos.Puntos14;

import java.util.Scanner;
public class Main14 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la marca del vehículo: ");
        String marca = sc.nextLine();

        System.out.print("Introduce la capacidad máxima (L) del vehículo: ");
        double capMaxima = sc.nextDouble();

        System.out.print("Introduce el gasto del vehículo (L/Km): ");
        double gasto = sc.nextDouble();

        Coche14 coche1 = new Coche14(capMaxima,marca,gasto);

        System.out.println("*** INTRODUZCA SU PUNTO DE PARTIDA ***");

        System.out.print("Punto X: ");
        double inicialX = sc.nextDouble();

        System.out.print("Punto Y: ");
        double inicialY = sc.nextDouble();

        Puntos14 trayectoria = new Puntos14(inicialX, inicialY);

        System.out.println("El punto de partida es "+ trayectoria.getInicialX1()+" y "+ trayectoria.getInicialY1());

        System.out.println("*** INTRODUZCA SU PUNTO FINAL ***");
        System.out.print("Punto X: ");
        double finalX = sc.nextDouble();

        System.out.print("Punto Y: ");
        double finalY = sc.nextDouble();

        double ultimo= trayectoria.recorrido(finalX,finalY);

        System.out.printf("El recorrido es de %.2f Km",ultimo);
        System.out.println();
        double consumo = (ultimo/100)*coche1.getGasto();
        System.out.printf("El consumo es total es %.2fL",consumo);





    }
}
