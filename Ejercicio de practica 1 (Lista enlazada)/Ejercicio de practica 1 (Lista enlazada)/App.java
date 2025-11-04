public class App {
    public static void main(String[] args) throws Exception {

        SinglyLinkedList lista = new SinglyLinkedList();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

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

