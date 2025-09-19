import java.nio.channels.Pipe.SourceChannel;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    int fibonacci(int n){
            if (n <= 1) return n;
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    for (int i = 0; i < n; i++){
        System.out.println("El termino del fibonacci" + i + fibonacci(i));
    }

}
