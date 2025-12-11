package Ejer13;

public class Cafetera {
    double capacidadMaxima, capacidadActual;

    public Cafetera(double capMaxima, double capacidadActual) {
        this.capacidadMaxima = capMaxima;
        this.capacidadActual = capacidadActual;
    }

    public double setcapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void llebarCafetera() {
        capacidadActual = capacidadMaxima;
    }

    public String servirTaza(double capTaza) {
        String result;
        if (capacidadActual < capTaza)
            result = "Solo te voy a servir " + capacidadActual;
        else
            result = "Taza llena";
        capacidadActual -= capacidadActual > capTaza ? capacidadActual - capTaza : 0;

        return result;
    }
    public void vaciarCafetera(){
        capacidadActual = 0;
    }

    public void agregarCafe(double cantidad){

        capacidadActual = (cantidad+capacidadActual > capacidadMaxima )? capacidadMaxima:cantidad+capacidadActual;
    }
}
