public class BingoEnero {
    static int [] numerosBingo = new int[90];
    public static void main(String[] args) {
        generaCarton();
    }

    public static void generaCarton() {
        int[] miCarton = new int[15];


        for (int i = 0; i < miCarton.length; i++) {
            do {
                int aleatorio = (int) (Math.random() * 15) + 1;
               //System.out.print(aleatorio+", ");
                boolean repetido = true;
                for (int itemRepe:miCarton) {
                    if (itemRepe == aleatorio){
                        repetido = true;
                        break;
                    }
                    else if (repetido=false){
                        miCarton[i] =aleatorio ;
                        break;
                    }
                    System.out.println(miCarton[i]);
                }

            }while (false);



        }


    }
}
