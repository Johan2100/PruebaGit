package Ejer14Profesora.Vehiculo;

import Ejer14Profesora.Punto.PuntosProfe;
import Ejer14Profesora.Trayectoria.Trayectoria;

public class VehiculoProfe {
    private double gastoKm;

    public VehiculoProfe(double gastoKm) {
        this.gastoKm = gastoKm;
    }

    public double gastadoTrayectoria( PuntosProfe[] puntos) {
        double result =0;

        for (int i = 0; i < puntos.length-1; i++) {
            result += puntos[i].distancia(puntos[i+1]);
        }

        return result*gastoKm;
    }

    // VERSION 2
    public double gastadoTrayectoriav2(Trayectoria t){
        double result =0;

        for (int i = 0; i < t.getPuntos().length-1; i++) {
            result += t.getPuntos()[i].distancia(t.getPuntos()[i+1]);
        }

        return result*gastoKm;
    }


}
