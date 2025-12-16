package Ejer22_V2.model.Pedidos;

public class Pedidos {
    private String descripcion;
    private int codigo;
    private double precio;

    public Pedidos(String descripcion,double precio, int codigo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void modificarDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String toString(){
        return "Pedido [cod: "+codigo+", descripcion: "+descripcion+", precio: "+precio+"]";
    }
    public void rebajaprecio(double descuento){
        double result;

    }
}
