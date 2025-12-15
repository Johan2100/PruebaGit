package Ejer15.Partitura;

//son autor (el autor de la partitura),
//instrumento (el instrumento musical asociado con la partitura),
//tempo (la velocidad en pulsaciones por minuto).
class Partitura {
    private String autor,instrumento;
    private int bpm, cantidadInstrumento;


    public Partitura(String autor, int bpm, String instrumento) {
        this.autor = autor;
        this.bpm = bpm;
        this.instrumento = instrumento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getCantidadInstrumento() {
        return cantidadInstrumento;
    }

    public void setCantidadInstrumento(int cantidadInstrumento) {
        this.cantidadInstrumento = cantidadInstrumento;
    }


  //METODOS

    public double aumentoTempo(){
        double result = getBpm();
        result += 10;
        return result;
    }
    public double reduceTempo(){
        double result = getBpm();
        result -= 10;
        return result;

        //MAS BONITO: this.bpm -=10;
    }

    public String toString(){
        String result;
        result="Autor "+getAutor()+", Instrumento: "+getInstrumento()+", Tempo: "+getBpm();
        return result;
    }

    public void cambiarInstrumento(String instrumento){
       this.instrumento = instrumento;
        System.out.println("Cambiando....");
    }

    public void agregarInstrumento(String instrumento){
        this.instrumento +=", "+instrumento;
        System.out.println("Añadiendo....");
        cantidadInstrumento++;
    }

    public String numeroInstrumento(){
        String result;
        result = ""+getCantidadInstrumento();
        return result;
        //Profesora -> String[] instrumentos = instrumento.split(", "); "Banana" Split.
        //Se separa todo el string en subcadenas.
    }
}
