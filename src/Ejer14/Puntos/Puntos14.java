package Ejer14.Puntos;

public class Puntos14 {

    double inicialX1,inicialY1;
    double trayectoria;

    public Puntos14(double inicialX1, double inicialY1) {
        this.inicialY1 = inicialY1;
        this.inicialX1 = inicialX1;
    }

    public double getInicialY1() {
        return inicialY1;
    }

    public double getInicialX1() {
        return inicialX1;
    }

    public double recorrido(double finalX2, double finalY2){
      trayectoria = Math.hypot(inicialX1-finalX2,inicialY1-finalY2);
      return trayectoria;
    }

}
