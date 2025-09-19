import java.util.Scanner;

public class Cadena {

     static int cade(int n) {
        if (n == 0){
             return 0;
        } 
        return cade(n - 1) ;


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("Ingresa una cadena de texto: \n");







        scan.close();
    }
}
