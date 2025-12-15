package Ejer14Profesora.Trayectoria;

import Ejer14Profesora.Punto.PuntosProfe;

public class Trayectoria {
    private PuntosProfe[] puntos;

    public PuntosProfe[] getPuntos() {
        return puntos;
    }

    public void setPuntos(PuntosProfe[] puntos) {
        this.puntos = puntos;
    }

    public Trayectoria(PuntosProfe[] puntos) {
        this.puntos = puntos;
    }
}
