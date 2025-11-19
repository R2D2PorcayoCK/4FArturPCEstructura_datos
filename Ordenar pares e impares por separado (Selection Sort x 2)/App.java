import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SelectionSort sorting = new SelectionSort();

        System.out.println("¿Cuántos números deseas ingresar?");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Ingresa un número:");
            arr[i] = sc.nextInt();
        }

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arr));

        int countPares = 0;
        int countImpares = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                countPares++;
            } else {
                countImpares++;
            }
        }

        int[] pares = new int[countPares];
        int[] impares = new int[countImpares];

        int p = 0;
        int im = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                pares[p] = arr[i];
                p++;
            } else {
                impares[im] = arr[i];
                im++;
            }
        }

        System.out.println("Ordenando pares...");
        sorting.sort(pares);

        System.out.println("Ordenando impares...");
        sorting.sort(impares);

        System.out.println("Pares ordenados:");
        System.out.println(Arrays.toString(pares));

        System.out.println("Impares ordenados:");
        System.out.println(Arrays.toString(impares));
    }
}
