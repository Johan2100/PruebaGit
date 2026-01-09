package Ejer17.Model.pPersona;

public class Persona {
    private String nombre, dir;
    private int edad;

    public Persona(String nombre, int edad, String dir) {
        this.nombre = nombre;
        this.edad = edad;
        this.dir = dir;

    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
