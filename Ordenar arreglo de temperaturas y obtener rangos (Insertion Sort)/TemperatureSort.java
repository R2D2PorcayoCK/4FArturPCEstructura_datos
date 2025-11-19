import java.util.Arrays;

public class TemperatureSort {

    public void printArray(double[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public void sort(double[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            double temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(arr));
    }

    public void showResults(double[] arr){
        double min = arr[0];
        double max = arr[arr.length - 1];
        double rango = max - min;

        System.out.println("Temperatura mínima: " + min);
        System.out.println("Temperatura máxima: " + max);
        System.out.println("Rango: " + rango);

        System.out.print("3 temperaturas más bajas: ");
        for(int i = 0; i < 3 && i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("3 temperaturas más altas: ");
        int count = 0;
        for(int i = arr.length - 1; i >= 0 && count < 3; i--){
            System.out.print(arr[i] + " ");
            count++;
        }
        System.out.println();
    }
}
