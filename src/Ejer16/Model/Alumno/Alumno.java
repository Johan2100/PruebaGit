package Ejer16.Model.Alumno;

import Ejer16.Model.Asignatura.Asignatura;
import Ejer22_V2.model.Pedidos.Pedidos;

public class Alumno {

    private String nombre,nif;
    private Asignatura[] asignaturas;

    public Alumno(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
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

//    public void newAsignatura( Asignatura Asig){
//        if (asignaturas == null){
//            asignaturas = new Asignatura[1];
//            asignaturas [0] = Asig;
//        }else {
//            Pedidos[] aux = new Pedidos[asignaturas.length+1];
//
//            for (int i = 0; i < asignaturas.length; i++) {
//                aux[i] = asignaturas[i];
//            }
//            aux[aux.length - 1]= Asig ;
//            asignaturas = aux;
//
//        }
//    }

}
