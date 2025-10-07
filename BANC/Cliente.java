import java.util.ArrayDeque;
import java.util.Deque;

public class Cliente {
    int id;
    String nombre;
    Deque<String> docs;

    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        docs = new ArrayDeque<>();
    }

    public void agregarDocumento(String doc) {
        docs.push(doc);
    }

    public void atender() {
        while (!docs.isEmpty()) {
            System.out.println("Retirando doc: " + docs.pop());
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
}
