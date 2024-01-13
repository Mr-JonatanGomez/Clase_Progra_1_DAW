public class OperadoresAsignacion{
public static void main(String[] args) {
    // SON LOS QUE IGUALAN UN VALOR A ALGO, se puede asignar y operar
    int numeroAsignado = 40;
    numeroAsignado += 20; /* esto quiere decir lo que valía
                             antes + lo que te digo, deberia ser 60*/
    System.out.println(numeroAsignado);
    numeroAsignado -= 10;// ahora restara 10 al anterior valor valido (60)
    System.out.println(numeroAsignado);
    numeroAsignado *= 2;// ahora multiplicara 2 al anterior valor valido (50)
    System.out.println(numeroAsignado);
    numeroAsignado /= 4;// ahora restara 10 al anterior valor valido (100)
    System.out.println(numeroAsignado);
    numeroAsignado %= 10;// ahora restara 10 al anterior valor valido (60)
    System.out.println(numeroAsignado);
    }

}
