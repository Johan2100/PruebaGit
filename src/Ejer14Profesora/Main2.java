package Ejer14Profesora;

import Ejer14Profesora.Punto.PuntosProfe;
import Ejer14Profesora.Trayectoria.Trayectoria;
import Ejer14Profesora.Vehiculo.VehiculoProfe;

import java.util.Scanner;

public class Main2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuanto gasta (L/Km) tu vehículo: ");
        double gasto = sc.nextDouble();

        VehiculoProfe coche1 = new VehiculoProfe (gasto);
        System.out.println("""
                ***** TRAYECTORIA ****
                 ¿Cuantos puntos tiene tu trayectoria ?
                """);
        int numPuntos = sc.nextInt();
        PuntosProfe[] trayectoria = new PuntosProfe[numPuntos];

        for (int i = 0; i < trayectoria.length; i++) {
            System.out.println("Introduzca X e Y : ");
            System.out.print("X: ");  double x = sc.nextDouble();
            System.out.print("Y: ");  double y = sc.nextDouble();
            trayectoria[i] = new PuntosProfe(x,y);
        }

        Trayectoria tr = new Trayectoria(trayectoria);
        System.out.print("Su gasto ha sido: "+coche1.gastadoTrayectoriav2(tr));
    }
}
