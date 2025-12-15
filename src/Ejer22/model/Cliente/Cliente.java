package Ejer22.model.Cliente;
import Ejer22.model.Pedidos.Pedidos;

import java.util.Arrays;

public class Cliente {
    private String nif,nombre;
    private Pedidos[] pedidos; // Tendra un array de pedidos.

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
        return "Pedido [nombre: "+nombre+", nif: "+nif+", pedidos: "+Arrays.toString(pedidos)+"]";
        // Modificado en clase en vez de mostrar todos los pedidos, muestra la cantidad de pedidos: pedidos,length;
    }

}
