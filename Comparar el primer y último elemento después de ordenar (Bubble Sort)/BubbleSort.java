import java.util.Arrays;

public class BubbleSort{
    public void sort(int[] arr){
        int n = arr.length;
        boolean swapped = true;

        System.out.println("Arreglo original: ");
        System.out.println(Arrays.toString(arr));

        for(int i=0; i < n - 1; i++){
            swapped = false;

            for(int j=0; j < n - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;  
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

        int min = arr[0];

        int max = arr[n - 1];

        int diferencia = max - min;

        System.out.println("Arreglo ordenado: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Valor mínimo: " + min);
        System.out.println("Valor máximo: " + max);
        System.out.println("Diferencia (máximo - mínimo): " + diferencia);
    }
}
