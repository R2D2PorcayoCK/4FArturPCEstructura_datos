import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingresa un numero primo: \n");
        int n = scan.nextInt();
        int resultado = pr(n);

        System.out.print("La suma de los numeros" +n+ "naturales es:" + resultado);

        scan.close();
    
    }
     static int pr(int n) {
       if (n == 0){
             return 0;
        } 
        return n + pr(n - 1);


    }
}
