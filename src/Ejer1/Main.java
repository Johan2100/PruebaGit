package Ejer1;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejer1.Persona per1 = new Ejer1.Persona();

        System.out.print("Introduce tu nombre: ");
        per1.nombre = sc.nextLine();

        System.out.println("""
                
                1. Saludar 
                2. Despedir
                
                """);
        int op = sc.nextInt();

        switch (op){

            case 1 ->{
                per1.saludar();
            }
            case 2 ->{
                per1.adios();
            }

        }

    }
}
