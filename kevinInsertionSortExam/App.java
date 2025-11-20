public class App {
    public static void main(String[] args) {
        InsertionSort sorting= new InsertionSort();

        int[] arr ={1,8,7,0,6,5,4,3,11,9,100,10,2};

        System.out.println(">>>Ordenado<<<");
        sorting.sort(arr);
        System.out.println();

        for(int a : arr){
            System.out.println(a);
        }
        
        sorting.sort(arr);
    
        int min = arr[0];
        int mindos = arr[1];
        int max = arr[arr.length - 1];
        int maxmen = arr[arr.length -2];

        System.out.println("Este es el numero min" + min);
        System.out.println("Este es el numero max" + max);
        System.out.println("Este es el numero segundomax" + maxmen);
        System.out.println("Este es el numero segundomin" + mindos);
        
    }
}

