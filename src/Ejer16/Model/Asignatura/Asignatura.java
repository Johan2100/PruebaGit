package Ejer16.Model.Asignatura;

public class Asignatura {
    private String nombre;
    private int curso;
    private Notas nota;

    public Asignatura(int curso, String nombre) {
        this.curso = curso;
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Notas getNota() {
        return nota;
    }

    public void setNota(Notas nuevanota) {
        this.nota = nuevanota;
    }

    public String toString() {
        return "Asignatura{" +
                "curso:" + curso +
                ", nombre:'" + nombre + '\'' +
                ", nota:" + nota +
                '}';
    }
}
