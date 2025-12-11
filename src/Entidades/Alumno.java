package Entidades;

class Alumno {

    // ATRIBUTOS / PROPIEDADES / CAMPOS / VARIABLES, por convenio en minúsculas
    String nif, nombre;
    int edad;
    Matricula matricula;

    // MÉTODOS: códigos que los objeto alumno
    // creado en tiempo de ejecución pueden llamar.
    // El metodo se creará aqui pero en el objeto sera quién lo llame.
    // y solo lo llama el objeto de la misma clase.

    //METODO QUE MUESTRE POR PANTALLA CON TRUE O FALSE EN FUNCION SI EL ALUMNO ES MAYOR DE 18;
    // PONEMOS void PORQUE EL METODO NO ME DEVUELVE NINGUN VALOR.

    void mayorEdad(){
        //EL CÓDIGO QUE HAGAMOS AQUÍ TIENE ACCESO DIRECTAMENTE A TODAS LOS DATOS DEL OBJETO QUE LO LLAMA
        if(edad > 18){
            System.out.println("Es mayor de edad");
        }else
            System.out.println("Es menor de edad");
    }
    // SI EL METODO RETORNA ALGUN VALOR, HAY QUE PONER EL TIPO DE TATO DE ESE VALOR
    //Podemos usar int[] para que me de un array de enteros o en este caso codigo de matricula.
    int getCodigoMatricula(){

        int result = matricula.codigo;
        return result;
    }


}
