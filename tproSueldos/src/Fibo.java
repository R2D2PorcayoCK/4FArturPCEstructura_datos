import java.util.Scanner;

public class Fibo {

    // Método recursivo para calcular el n-ésimo número de Fibonacci
    static int fibo(int n) {
        if (n <= 1) return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de terminos de la secuencia Fibonacci: ");
        int n = scan.nextInt();

        System.out.println("Secuencia Fibonacci de " + n + " términos:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }

        scan.close();
}

}