package Entidades;
import java.util.Scanner;
public class Main2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Alumno alumno = new Alumno();

        alumno.nif="3493S";
        alumno.edad= 50;
        alumno.nombre= "Rigoberto";

        alumno.matricula = new Matricula(); // DAR VALOR A LOS ATRIBUTOS DE LA MÁTRICULA
            alumno.matricula.codigo= 200;
            alumno.matricula.descripcion= "DAM";
            alumno.matricula.cantidad= 2.5;

        //QUIERO VER SI alumno ES MAYOR DE EDAD:
        alumno.mayorEdad();

        Alumno alumno2 = new Alumno(); // OBJETO
        alumno2.edad=12;
        alumno2.mayorEdad();

        int codigoAlumno = alumno.getCodigoMatricula();
        System.out.println(codigoAlumno);

        // PRECIO CON IVA
        // EN EL MOMENTO DE LLAMAR AL METODO LOS PARAMETROS TIENEN QUE TENER UN VALOR
        System.out.print("Introduce la cantidad de IVA: ");
        int iva = sc.nextInt();
        double matriculaIva = alumno.matricula.cantidadIva(iva); //También puedes usar aqui cantidadIva(sc.nextInt());
        System.out.println(matriculaIva);



    }
}
