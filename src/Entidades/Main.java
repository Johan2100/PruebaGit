package Entidades;

class Main {
    // Metodo MAIN: este metodo es el punto de arranque de la app.
 public static void main(String[] args) { // SOLO TRABAJA CON UN MAIN

     //INSTANCIAR UN OBJETO ALUMNO:
     Alumno alumno1 = new Alumno();
     System.out.println(alumno1); // Como contiene un conjunto de elementos, nos mostrará la dirección de memoria.
     System.out.println(alumno1.nif);
     System.out.println(alumno1.edad);
     System.out.println(alumno1.nombre);



     //alumno1 es una variable objeto con tres campos:
     /* nif,nombre, edad. */

     alumno1.nif = "23456D";  // LA PROPIEDAD . NOS LLEVA A LAS PROPIEDADES DE CADA ATRIBUTO DE LA CLASE.
     alumno1.nombre=" Johan Mora";
     alumno1.edad= 12;

     System.out.printf("""
             
             Nombre: %s
             Edad: %d
             DNI: %s
             """,alumno1.nombre,alumno1.edad,alumno1.nif);
     //INSTANCIAMOS OTRO ALUMNO
     Alumno alumno2 = new Alumno();

     alumno2.nif= "3405D";
     alumno2.nombre= "Pepe Juan";
     alumno2.edad= 13;

     String mayor = alumno1.edad > alumno2.edad? "Alumno 1 mayor": "Alumno 2 mayor";

     System.out.println(mayor);

     //ASIGANMOS AL PRIMER ALUMNO EL NOMBRE DEL SEGUNDO:
     alumno1.nombre= alumno2.nombre;

     //ARRAY DE ALUMNOS PARA GUARDAR TODOS LOS ALUMNOS

     Alumno[] alumnos = new Alumno[20];

     for (int i = 0; i < alumnos.length; i++) {
         alumnos[i] = new Alumno();

     }

     //ASIGNO EDAD ALEATORIA A TODOS LOS ALUMNOS:
     for (int i = 0; i < alumnos.length; i++) {
         alumnos[i].edad = (int)(Math.random()*100);
     }

     // MOSTRAMOS LA EDAD DE TODOS LOS ALUMOS DEL ARRAY:
     for(Alumno a: alumnos ){
         System.out.println(a.edad);
     }


    }
}
