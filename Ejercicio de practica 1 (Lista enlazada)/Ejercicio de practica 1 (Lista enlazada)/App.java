public class App {
    public static void main(String[] args) throws Exception {

        SinglyLinkedList lista = new SinglyLinkedList();
        lista.add(10);
        lista.add(15);
        lista.add(20);
        lista.add(25);
        lista.add(30);
        lista.add(35);

        System.out.println("Lista Original:");
        lista.printList();

        SinglyLinkedList listaPares = new SinglyLinkedList();
        SinglyLinkedList listaImpares = new SinglyLinkedList();

        Node actual = lista.head;

        while (actual != null) {
            if (actual.data % 2 == 0) {
                listaPares.add(actual.data);
            } else {
                listaImpares.add(actual.data);
            }
            actual = actual.next;
        }

        System.out.println("Numeros Pares: ");
        listaPares.printList();

        System.out.println("Numeros Impares: ");
        listaImpares.printList();
    }
}
