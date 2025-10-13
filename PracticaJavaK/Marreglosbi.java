public class Marreglosbi {
    public static void main(String[] args) {
        int[][] arrTest = {
            {1, 1},
            {4, 1, 1},
            {5, 6, 8},
            {4, 5, 3, 8},
            {2, 5, 8},
            {2, 4, 6, 9, 10}
        };

        int[][] nuevo = new int[arrTest.length][];

        for (int i = 0; i < arrTest.length; i++) {
            int[] fila = arrTest[i];
            nuevo[i] = new int[fila.length + 1];

            for (int j = 0; j < fila.length; j++) {
                nuevo[i][j] = fila[j];
            }

          
            nuevo[i][fila.length] = fila[fila.length - 1] + 1;
        }

        System.out.println("Arreglo original:");
        for (int i = 0; i < arrTest.length; i++) {
            for (int j = 0; j < arrTest[i].length; j++) {
                System.out.print(arrTest[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Arreglo modificado:");
        for (int i = 0; i < nuevo.length; i++) {
            for (int j = 0; j < nuevo[i].length; j++) {
                System.out.print(nuevo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
