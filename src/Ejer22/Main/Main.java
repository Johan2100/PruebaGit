package Ejer22.Main;
import Ejer22.model.Cliente.Cliente;
import java.util.Scanner;


public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stePosLibre = 0;

        Cliente[] clientes = new Cliente[100];
        int op;
        do{
            System.out.println("""
                    *** MENU EMPRESA DE ENVIOS *** 
                    
                    1. Registrar Cliente 
                    2. Registrar Pedido 
                    3. 
                    
                    
                    
                    """);
            op = sc.nextInt();

            switch (op){
                case 0 ->{
                    //volcariamos todos lo datos del sistema. Porque no tenemos base de datos.
                    System.out.println("Hasta la próxima");
                    System.exit(00);
                }
                case 1 ->{
                    System.out.print("Introduce Nif: ");
                    String nif = sc.nextLine();

                    System.out.print("Introduce Nombre: ");
                    String nombre = sc.nextLine();

                    Cliente c = new Cliente(nif,nombre); // Cliente c = new Cliente(nif,nombre,null). Usamos el otro bonito.
                    clientes[stePosLibre++] = c; // Usamos este array para no sobreescribir a la hora de añadir otro cliente.
                    System.out.println("El cliente ha sido registrado correctamente. ");


                }

                case 2->{
                    for (Cliente c : clientes)
                        System.out.println(c);

                }

            }

        }while(op != 0);



    }
}
