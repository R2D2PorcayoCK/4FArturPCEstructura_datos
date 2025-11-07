import java.util.Arrays;

public class BubbleSort{
    public void sort(int[] arr){
        int n = arr.length;
        boolean swapped = true;
        //Recorremos todos los arreglos del arreglo
        for(int i=0; i < n - 1; i++){
            //Recorremos los elementos ayacentes -1-i (por los que ya fueron recorridos)
            for(int j=0; j < n - 1 - i; j++){
                //preguntar si el elemento corriente es mayor al siguiente
                if(arr[j] > arr[j+1]){
                    //se realiza el intercambio
                    int temp = arr[j];
                    arr[j] = arr[j+1];//pasa el elemento siguiente al actual
                    arr[j+1] = temp; //asigna el siguiente elemento con el valor de temp 
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
        //impresion
        System.out.println("Arreglo ordenado: ");
        System.out.println(Arrays.toString(arr));
    }
   
}
