public class App {
    public static void main(String[] args) throws Exception {

        ArrayQueue<Customer> queue = new ArrayQueue<>();

        queue.offer(new Customer(1, "Kevin"));
        queue.offer(new Customer(2, "Arturo"));
        queue.offer(new Customer(3, "Gibran"));
        queue.offer(new Customer(4, "Ana"));
        queue.offer(new Customer(5, "María"));
        queue.offer(new Customer(6, "Luis"));

        int elementBefore = queue.getSize();
        System.out.println("Lista original:");
        queue.print();

        int elementAfter = queue.getSize();
        System.out.println("\nLista invertida:");
        queue.reverse();
        queue.print();

        System.out.println("\n Resumen:");
        System.out.println("Clientes antes de invertir: " + elementBefore);
        System.out.println("Clientes después de invertir: " + elementAfter);
        System.out.println("Simulación completada con éxito.");
    }
}
