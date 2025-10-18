public class App {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.printForward();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        list.printForward();
        System.out.println("-------------Imprimir Backward");
        list.printBackward();
       
        list.remove(1); 
        list.remove(5); 
        list.remove(7); 

        System.out.println("Lista después de eliminar:");
        list.printForward();
    }
    
}
