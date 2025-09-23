import java.util.ArrayDeque;
import java.util.Queue;

public class Banco {
    public static void main(String[] args) {
        System.err.println("Hola kevin");
        Queue<Cliente> queue = new ArrayDeque<>();

        Cliente c1 = new Cliente(1, "Gibran");
        c1.agregarDocumento("Doc1");
        c1.agregarDocumento("Doc2");

        Cliente c2 = new Cliente(2, "Matias");
        c2.agregarDocumento("Doc1");
        c2.agregarDocumento("Doc2");

        Cliente c3 = new Cliente(3, "Mayra");
        c3.agregarDocumento("Doc1");
        c3.agregarDocumento("Doc2");

        queue.offer(c1);
        queue.offer(c2);
        queue.offer(c3);

        while (!queue.isEmpty()) {
            Cliente actual = queue.poll();
            System.out.println("Cliente en atención: " + actual.nombre);
            actual.atender();
            System.out.println("Cola restante: " + queue);
        }
    }
}

