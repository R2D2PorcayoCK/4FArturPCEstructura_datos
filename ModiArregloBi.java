public class ModiArregloBi {
    public static void main(String[] args) {
        int[][] arrEntrada = {
            {1},
            {6, 3, 1},
            {1, 2, 3, 4},
            {0, 5, 3, 0},
            {2, 5, 9},
            {2, 4, 8, 9, 10}
        };

        int[][] nuevo = new int[arrEntrada.length][];

        for (int i = 0; i < arrEntrada.length; i++) {
            int[] fila = arrEntrada[i];
            nuevo[i] = new int[fila.length + 1];

            for (int j = 0; j < fila.length; j++) {
                nuevo[i][j] = fila[j];
            }

            if (fila.length % 2 == 0) {
                nuevo[i][fila.length] = fila[0] + fila[fila.length - 1];
            } else {
                nuevo[i][fila.length] = 0;
            }
        }

        System.out.println("Arreglo original:");
        for (int i = 0; i < arrEntrada.length; i++) {
            for (int j = 0; j < arrEntrada[i].length; j++) {
                System.out.print(arrEntrada[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nArreglo modificado:");
        for (int i = 0; i < nuevo.length; i++) {
            for (int j = 0; j < nuevo[i].length; j++) {
                System.out.print(nuevo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
