package Ejer22_V2.model.Pedidos;

public class Pedidos {
    private String descripcion;
    private int codigo;
    private double precio;

    public static double IVA; //No hacemos ni get ni set, y no hace falta constructor
    // Ya que todos los objetos pueden acceder a ella.

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

    //Metodo que modifique el IVA
    //STATIC DE LA CLASE: Metodo static
    //Para poder llamar el metodo, tenemos que poner Static.

    public static void modificaIVA(double iva){
        IVA = iva;
        System.out.println("Aplicando cambios....");
    }
}
