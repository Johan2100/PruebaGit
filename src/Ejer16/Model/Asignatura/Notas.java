package Ejer16.Model.Asignatura;

public enum Notas {
    CERO(0),
    UNO(1),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5),
    SEIS(6),
    SIETE(7),
    OCHO(8),
    NUEVE(9),
    DIEZ(10); // <--- ¡Acuérdate del punto y coma!

    // 2. Campo privado y final para almacenar el número
    private final int valorNumerico;

    // 3. Constructor (privado, para que solo las constantes puedan crearse)
    Notas(int valor) {
        this.valorNumerico = valor;
    }

    // 4. Método público (getter) para acceder al valor numérico
    public int getValorNumerico() {
        return valorNumerico;
    }



}