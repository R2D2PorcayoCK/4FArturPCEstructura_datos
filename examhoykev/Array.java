public class Array {
    public static void main(String[] args) {

       //sumando rodos los numeros del arreglo
       // Sumatoria de arreglo Bi

       int[][] arrTest={
            {1,3,7,8},
            {0,6,3,1},
            {1,2,3,4},
            {0,5,3,0},
            {2,5,9,0}
        };

        int suma = 0;

        for(int i = 0; i < arrTest.length; i++){
            for(int j = 0; j < arrTest[i].length; j++){
                suma += arrTest[i][j];
            }
        }

        System.out.println("La suma de todo el arreglo es: " +suma);

    }

}
