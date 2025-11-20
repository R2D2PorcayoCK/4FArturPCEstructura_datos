public class InsertionSort {
      public void sort(int[] arr){

        int n = arr.length;
        
        for (int i = 1; i < n; i++) { //Comenzamos desde el segundo elemento

            int temp = arr[i]; //El primer elemento de la parte desornadana (comparativo)

            int j = i - 1; //comenzamos desde el ultimo elemento de la parte ordenada

            while(j >= 0 && arr[j] > temp){ //Recorrer la parte ordenada (fin-inicio)

                //recorrer la derecha los elementos mayores al temporal
                arr[j+1] = arr[j];
                j--;
            }

            //insertar el elemento en su posicion correcta
            arr[j+1] = temp;

        }

    }

}
//Instrucciones:

//Declara e inicializa un arreglo con números aleatorios.
//Ordena con Insertion Sort ascendente.

//Muestra:
//Mínimo
//Segundo mínimo
//Máximo
//segundo maximo