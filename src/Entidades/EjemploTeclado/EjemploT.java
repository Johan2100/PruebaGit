package Entidades.EjemploTeclado;

import Utilidades.Teclados.Teclado;

public class EjemploT {
    public static void main(String[] args) {
        System.out.println("Introduce decimal: ");
        double num = Teclado.leerDecimal();
        System.out.println("Introduce entero: ");
        int entero = Teclado.leerEntero();
        System.out.println("Introduce nombre: ");
        String nombre = Teclado.leerCadena();

    }
}
