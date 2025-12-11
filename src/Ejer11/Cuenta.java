package Ejer11;
/*
Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
Tendrá dos métodos:
    ingresar(double cantidad): se ingresa una cantidad a la cuenta (es decir, se suma a la cantidad que ya tenga el objeto).
        Si la cantidad introducida es negativa, no se hará nada.

    retirar(double cantidad): se retira una cantidad a la cuenta,
        si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
*/
class Cuenta {

    String titular;
    int saldo = 0;
    double ingresar(int cantidad){

        saldo += cantidad;

        return saldo;
    }

    double retirar(int cantidad){

       saldo -= cantidad;

        if (saldo <=0 ){
            saldo = 0;
            return saldo;
        }
        return saldo;
    }


}
