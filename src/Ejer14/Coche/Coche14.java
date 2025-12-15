package Ejer14.Coche;

public class Coche14 {
    private double capacidadCombustible;
    private double capacidadActual;
    private double gasto;
    private String marca;

    public Coche14(double capacidadCombustible, String marca, double gasto) {
        this.capacidadCombustible = capacidadCombustible;
        this.marca = marca;
        this.gasto = gasto;
    }

    public double getGasto() {
        return gasto;
    }
}
