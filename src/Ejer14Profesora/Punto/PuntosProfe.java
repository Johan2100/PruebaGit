package Ejer14Profesora.Punto;

public class PuntosProfe {
    private double x,y;

    public PuntosProfe(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(PuntosProfe p){
        //coordenadas que llaman al metodo.
        //coordenadas del punto parámetro: p.getX(), p.getY();

        double dif = ((x-p.getX())*(x-p.getX()))+((y- p.getY())*(y- p.getY()));
        return Math.sqrt(dif);
    }


}
