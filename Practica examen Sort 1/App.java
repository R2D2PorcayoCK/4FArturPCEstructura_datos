public class App{
    public static void main(String[] args) throws Exception{
        BubbleSort bubbleSort = new BubbleSort();

        //Snippet:

        int[][] miArreglo = { {1, 2, 7, 3}, {4, 9, 5, 6},  {12, 57, 3, 89}, {44, 6, 71, 20}};

        System.out.println("Antes de ordenar:"); 

        for (int i = 0; i < miArreglo.length; i++) { // Recorre las filas
            for (int j = 0; j < miArreglo[i].length; j++) { // Recorre las columnas de la fila actual
                System.out.print(miArreglo[i][j] + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }

        for (int i = 0; i < miArreglo.length; i++) {
            bubbleSort.sort(miArreglo[i]);
        }

        System.out.println("\nDespues de ordenar:"); 

        for (int i = 0; i < miArreglo.length; i++) { 
            for (int j = 0; j < miArreglo[i].length; j++) { 
                System.out.print(miArreglo[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
