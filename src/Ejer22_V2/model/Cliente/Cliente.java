package Ejer22_V2.model.Cliente;
import Ejer22_V2.model.Pedidos.Pedidos;

import java.util.Arrays;

public class Cliente {
    private String nif,nombre;
    private Pedidos[] pedidos;
    private double precioT=0; // Tendra un array de pedidos.

    public double getPrecioT() {
        return precioT;
    }

    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }

    public Cliente(String nif, String nombre, Pedidos[] pedidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.pedidos = pedidos;
    }

    public Cliente(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pedidos[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedidos[] pedidos) {
        this.pedidos = pedidos;
    }

    public String toString(){
        return "Cliente [nombre: "+nombre+", nif: "+nif+", pedidos: "+Arrays.toString(pedidos)+"]";
        // Modificado en clase en vez de mostrar todos los pedidos, muestra la cantidad de pedidos: pedidos,length;
        //,,(pedidos.length == null )?0:pedidos.length
    }

    public void agregarPedido(Pedidos p){ //Necesita un objeto pedido.
        if (pedidos == null){
            pedidos = new Pedidos[1];
            pedidos [0] = p;
        }else {
            Pedidos[] aux = new Pedidos[pedidos.length+1];

            for (int i = 0; i < pedidos.length; i++) {
                aux[i] = pedidos[i];
            }
            aux[aux.length - 1]=p;
            pedidos = aux;

        }
    }

    public void facturaCliente(){
        System.out.printf("""
                - Nombre: %s """,nombre);
        System.out.println();
        precioT = 0;
        for (Pedidos n :pedidos){
            System.out.println("- "+(n.getDescripcion())+", precio: "+n.getPrecio());
            precioT+=n.getPrecio();
        }
        System.out.println("El precio total es "+precioT);
        System.out.println();


    }

    public double gastoTotal(){
        if (pedidos == null){
            return 0;  // Metodo termina devolviendo 0
        }

        for (Pedidos n :pedidos){ // Es similar a pedidos[n].getPrecio();
            precioT+=n.getPrecio();
        }
        precioT+= precioT*Pedidos.IVA/100;

        return precioT;

    }

    public Pedidos localizaPedido(int cod){
        Pedidos result = null;
        if(pedidos != null){
            for(Pedidos p : pedidos ){
                if(p.getCodigo() == cod){
                    result = p;
                }
            }

        }
        return result;
    }







}
