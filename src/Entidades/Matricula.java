package Entidades;

class Matricula {

    int codigo;
    double cantidad;
    String descripcion;

    // Si un metodo necesita datos ajenos al objeto para operar,
    // hay que pasarselo como parametro.

    double cantidadIva(int iva){

        double resultIva = cantidad+(cantidad*iva)/100;
        return resultIva;
    }

}
