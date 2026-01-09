package Utilidades.Teclados;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {

    public static int leerEntero(){

        //Objeto que instanciamos que se asocia al scanner, otra versión del scanner
        //Este solo te lee cadenas, sabiendo que va a ser un número la conviertes en int con el parsero
        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.parseInt(br.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);

        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

    }

    public static double leerDecimal(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Double.parseDouble(br.readLine());
            //return 0
        } catch (IOException e) {
            throw new RuntimeException(e);
            //return 0
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
    public static String leerCadena(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
            //return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
            //return null;
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
            //return null;
        }

    }

}
