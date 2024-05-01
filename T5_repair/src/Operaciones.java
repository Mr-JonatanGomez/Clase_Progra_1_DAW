public class Operaciones { // aqui sin main

    public int sumar (int a, int b){
        return a+b;

    }
    public int restar (int a, int b){
        return a-b;


    }

    public double dividir (int a, int b){
        return (double) a/b;

    }

    public int generarAleatorio (int i){

        return (int)(Math.random()*(i+1));
    }

    //recursividad es algo que se llama a si mismo
    //calcula el factrorial
    //5! = 5 * 4 * 3* 2 * 1

    public int calcularFactorial (int numero){
        if (numero ==1){
            return 1;
        }
        //!2 = 2*1 =2
        //!4
        return numero * calcularFactorial (numero -1);
    }





}
