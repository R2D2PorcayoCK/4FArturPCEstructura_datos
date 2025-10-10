import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        
    int [][] arrBiA = new int [4][4];

    //Declaracion
    int[][] arrBiB;

    //Inicializacion
    arrBiB=new int [4][4];
    System.out.println(arrBiA[0][0]);
    arrBiA[3][3] = 10;

    //imprimir
    for(int i = 0; i < arrBiB.length; i++){
        for (int j = 0; j < arrBiB.length; j++){
            System.out.println(arrBiA[i][j]);
        }
        System.out.println();
    }
    System.out.println(arrBiB[0][3]);
    //Declaracion literal
    int [][] arrBiC={
        {1, 2, 3, 4},
        {1, 2, 3, 4},
        {1, 2, 3, 4},
        {1, 2, 3, 4}
    };
    //imprimir mediante for each
    for(int[] fila : arrBiC){
        for (int valor : fila) {
            System.out.println(valor);
        }
        System.out.println();
    }
        System.out.println(Arrays.deepToString(arrBiC));

        //Arreglo irregular
        int[][] arrBiD={
            {1,2,3},
            {1,2,3,4,5},
            {1},
            {2,2,2,2,2,2,},

        };
        System.out.println(Arrays.toString(arrBiD[0]));
        for(int i = 0; i < arrBiD.length; i++){
            for(int j = 0; j < arrBiD.length; j++){
                System.out.println(arrBiD[i][j]);;
            }
            System.out.println();
        }
        int[] a = {1,2,3,4};
        int[] b = new int[4];
        System.out.println(Arrays.toString(b));
        System.arraycopy(a, 0, b, 0, 4);
        // for(int i = 0; i < a.length; i++){
        //     b[i] = a[i];
        // }
        int[] c = Arrays.copyOf(a, 5);
        System.out.println(Arrays.toString(c));

    }
}

//Tamaño arreglo 4