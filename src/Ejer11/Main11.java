package Ejer11;
/*Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
Tendrá dos métodos:
    ingresar(double cantidad): se ingresa una cantidad a la cuenta (es decir, se suma a la cantidad que ya tenga el objeto).
        Si la cantidad introducida es negativa, no se hará nada.

    retirar(double cantidad): se retira una cantidad a la cuenta,
        si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.


    Crear una clase Principal, con un objeto Cuenta con propiedades solicitadas por teclado.
    A continuación el programa solicitará de forma repetida cantidades a ingresar o retirar
    (haciendo la pregunta previamente de que opción se quiere realizar). El programa terminará cuando la cuenta se quede a 0.
*/
import java.util.Scanner;
class Main11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta cliente1 = new Cuenta();
        double saldoretirar = 1;
        int cantidadT=0;
        boolean saldonegativo = false;

        System.out.print("Introduce titular de la cuenta: ");
        cliente1.titular= sc.nextLine();

do {
    System.out.printf("""
            ***** SELECIONA OPERACIÓN *****
            Bienvenido %s
            1. Ingresar
            2. Retirar 
            3. Salir
            
            """,cliente1.titular);
    int op = sc.nextInt();
    System.out.println();

    switch (op) {

        case 1 -> {
            System.out.print("Introduzca la cantidad a ingresar: ");
            int cantidad = sc.nextInt();

            while (cantidad <= 0) {
                System.err.println(" Error, ingresa una cantidad positiva ");
                System.out.println();
                System.out.print("Introduzca la cantidad a ingresar: ");
                cantidad = sc.nextInt();
            }

            double saldoingresar= cliente1.ingresar(cantidad);

            System.out.println("La saldo de la cuenta es "+saldoingresar);

        }

        case 2 -> {

            System.out.print("Introduzca la cantidad a retirar: ");
            int cantidad = sc.nextInt();

            saldoretirar = cliente1.retirar(cantidad);
            if (saldoretirar > 0) {
                System.out.printf("El saldo de la cuenta de %.2f%n ", saldoretirar);
                System.out.println();
            }else {
                System.out.println("El saldo de la cuenta 0");
                saldonegativo = true;
            }

        }
        case 3 ->{
            System.out.println("Ha deseado salir de la cuenta, hasta luego "+cliente1.titular);
            System.exit(00);

        }
        default -> {
            System.err.println("Error operación no válida");
        }


    }

}while(!saldonegativo);

    }
}
