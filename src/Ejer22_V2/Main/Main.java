package Ejer22_V2.Main;
import Ejer22_V2.model.Cliente.Cliente;
import Ejer22_V2.model.Pedidos.Pedidos;

import java.util.Scanner;


public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stePosLibre = 0,codPed=0;
        System.out.print("Introduzca IVA: ");
        Pedidos.IVA = sc.nextDouble();


        Cliente[] clientes = new Cliente[100];
        int op;
        do{
            System.out.println("""
                    *** MENU EMPRESA DE ENVIOS *** 
                    
                    
                    1. Registrar Cliente 
                    2. Lista de Clientes
                    3. Agregar Pedido
                    4. Generar factura 
                    5. Cliente con más pedidos
                    6. Cliente más caro
                    7. Localizar pedido con código       
                    8.
                    9. Cambiar IVA         
                    0. Salir
                                   
                    """);
            op = sc.nextInt();
            sc.nextLine();
            //Factura -> Nombre cliente, listado pedido y total a pagar.

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
                    System.out.println();
                }

                case 2->{
                    if(stePosLibre <=0 ){
                        System.out.println("No hay clientes añadidos");
                        System.out.println();
                    }else {
                        //stePosLibre nos sirve como contador de posiciones rellenas.
                        for (int i = 0; i < stePosLibre; i++) {
                            //syso llama al toString automáticamente.
                            //si no hubieramos hecho un toString()
                            //se llamaría a uno por defecto (raro).
                            System.out.println(clientes[i]);
                        }
                        System.out.println();
                    }
                }

                case 3->{
                    System.out.print("Descripción del pedido: ");
                    String descripcion= sc.nextLine();

                    System.out.print("Precio del producto: ");
                    double precio = sc.nextDouble();
                    //generar código internamente en que el código sea único.
                    sc.nextLine();
                    Pedidos p = new Pedidos(descripcion, precio, codPed++);
                    System.out.print("Nif del cliente: ");
                    String nifC = sc.nextLine();
                    boolean encontrado= false;
                    for (int i = 0; i < stePosLibre && !encontrado; i++) {
                        if (clientes[i].getNif().equals(nifC)){
                            //agregar pedido p a cliente:
                            clientes[i].agregarPedido(p);
                            encontrado= true;

                        }
                    }

                    if (encontrado) {
                        System.out.println("Pedido agregado");
                        System.out.println();
                    }else
                        System.out.println("Lo siento, el nif introducido no se ha encontrado");
                        System.out.println();

                }

                case 4->{
                    System.out.print("Introduzca el nif del cliente: ");
                    String nifR = sc.nextLine();
                    System.out.println();
                    boolean encontrado = false;
                    for (int i = 0; i < stePosLibre; i++) {
                        if (clientes[i].getNif().equals(nifR)){
                            encontrado = true;
                            clientes[i].facturaCliente();

                        }
                    }
                }

                case 5->{
                    Cliente clienteMax = clientes[0]; // Objeto cliente 'max'.
                    for (int i = 1; i <stePosLibre ; i++) {
                        //cliente[i] > max, actualizamos clientes[i]
                        if(clientes[i].getPedidos() == null && clientes[i].getPedidos().length > clienteMax.getPedidos().length){
                            clienteMax =  clientes[i];
                        }
                    }
                    System.out.println("El cliente con más pedidos es "+clienteMax);
//                    int max = 0;
//                    Cliente c = null;
//                    int pos = 0;
//
//                    for (int i = 0; i < stePosLibre; i++) {
//                        if(clientes[i].getPedidos().length > max){
//                            max = clientes[i].getPedidos().length;
//                            c = clientes[i];
//                            pos = i;
//
//                        }
//
//                    }
                }

                case 6->{
                    Cliente clienteMax = clientes[0]; // Objeto cliente 'max'.
                    for (int i = 1; i <stePosLibre ; i++) {
                        //cliente[i] > max, actualizamos clientes[i]
                        if(clientes[i].gastoTotal() > clienteMax.gastoTotal()){
                            clienteMax =  clientes[i];
                        }
                    }
                    System.out.println("El cliente que más a gastado es "+clienteMax);
                }

                case 7 ->{
                    System.out.print("Introduzca el cod de paquete: ");
                    int codF = sc.nextInt();
                    System.out.println();
                    boolean encontrado = false;

                    Cliente comprador = clientes[0];



//                   INTENTO EN CLASE
//                    for (int i = 0; i < stePosLibre && !encontrado; i++) {
//
//                        if (comprador.getPedidos()[i].getCodigo() == codF){
//                            encontrado = true;
//                            comprador = clientes [i];
//                            System.out.println("El cliente que ha efectuado la compra es "+comprador.getNombre()+
//                                    " y "+comprador.getPedidos()[i]);
//                        }
//                    }

                    //FORMA CLASE

                    for (int i = 0; i < stePosLibre && !encontrado; i++) {
                        Pedidos p = clientes[i].localizaPedido(codF);
                        if (p!=null){
                            encontrado = true;
                            System.out.println("Cliente: "+clientes[i]);
                        }

                    }


                }

                case 9 ->{
                    System.out.print("Nuevo valor IVA: ");
                    double iva = sc.nextDouble();
                    Pedidos.modificaIVA(iva);
                    System.out.println("Se ha cambiado correctamente el iva a "+Pedidos.IVA);

                }



            }

        }while(op != 0);



    }
}
