import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        List<Worker> workers = new ArrayList<>();


        // Inicializa trabajadores
        workers.add(new Worker(1, "Naul", 1000));
        workers.add(new Worker(2, "Carlos", 800));
        workers.add(new Worker(3, "Emiliano", 3000));
        workers.add(new Worker(4, "Deguito", 560));
        workers.add(new Worker(5, "Kevin", 50));
        workers.add(new Worker(6, "Gibran", 6000));


        // Calcula el promedio
        double total = 0;
        for (Worker w : workers) {
            total += w.getSueldo();
        }
        double promedio = total / workers.size();
        System.out.println("Promedio de sueldos: " + promedio);


        //  Elimina sueldos menores a 1000
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).getSueldo() < 1000) {
                workers.remove(i);
                i--; // retroceder indice ya que la lista se va haciendo mas chica
            }
        }


        // Muestra la  lista actualizada
        System.out.println("\nLista actualizada:");
        for (Worker w : workers) {
            System.out.println(w);
        }


    }
}
