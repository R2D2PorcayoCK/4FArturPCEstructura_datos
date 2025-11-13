public class SelectionSort {

    public void sort(String[] nombre, int[] cal) {
        int n = cal.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < cal.length; j++) {
                if (cal[j] < cal[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambio de posición
            int temp = cal[minIndex];
            cal[minIndex] = cal[i];
            cal[i] = temp;

            String tempNombre = nombre[minIndex];
            nombre[minIndex] = nombre[i];
            nombre[i] = tempNombre;
        }

        System.out.println("\nDatos ordenados:");
        for (int i = 0; i < n; i++) {
            System.out.println(nombre[i] + " : " + cal[i]);
        }
    }
}


 