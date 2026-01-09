package Ejer17.Model.pLibreta;

import Ejer17.Model.pPersona.Persona;

import java.util.Arrays;

public class Libreta {
    private Persona[] personas;
    int codP=0;

    public Libreta(Persona[] personas) {
        this.personas = personas;
    }

    public String toString() {
        return "Libreta{" +
                "personas=" + Arrays.toString(personas) +
                '}';
    }

    public void agregarPersona(Persona p ){
        if (codP < personas.length) {
            personas[codP++] = p; // Guardamos en la posición actual del contado
            System.out.println("Persona añadida correctamente en la posición " + (codP - 1));
        } else {
            System.out.println("Error: El array está lleno. No se puede agregar a " + p.getNombre());
        }
    }

    public void eliminarPersona(String nombre){
//        boolean encontrado = false;
//        Persona[] aux = new Persona[personas.length-1];
//        for (int i = 0; i < personas.length && !encontrado; i++) {
//            if (personas[i].getNombre().equals(nombre)){
//                for (int j = i; j < personas.length-1; j++) {
//                    personas[i] = personas[i+1];
//                }
//
//            }
//        }

        int indiceEliminar = -1;
        //personas[i] != null &&
        // 1. Buscar el índice de la persona
        for (int i = 0; i < personas.length; i++) {
            if ( personas[i] != null && personas[i].getNombre().equals(nombre)) {
                indiceEliminar = i;
                break;
            }
        }

        // 2. Si se encontró, crear el nuevo array
        if (indiceEliminar != -1) {
            Persona[] aux = new Persona[personas.length - 1];
            int k = 0; // Índice para el nuevo array
            for (int i = 0; i < personas.length; i++) {
                if (i == indiceEliminar) continue; // Saltamos el que queremos borrar
                aux[k++] = personas[i];
            }
            this.personas = aux; // Reemplazamos el array original
            System.out.println("Persona eliminada.");
        } else {
            System.out.println("No se encontró a la persona.");
        }

    }
}
