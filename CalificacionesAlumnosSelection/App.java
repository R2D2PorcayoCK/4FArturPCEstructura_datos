import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SelectionSort sorting = new SelectionSort();
        Scanner sc = new Scanner(System.in);

        System.out.println(">>> Bienvenido al sistema <<<");
        System.out.print("¿Cuántos alumnos deseas registrar? ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        String[] nombre = new String[n];
        int[] cal = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa tu nombre: ");
            nombre[i] = sc.nextLine();

            System.out.print("Ingresa tu calificación: ");
            cal[i] = sc.nextInt();
            sc.nextLine(); // limpiar buffer antes del siguiente nombre
        }

        sc.close();

        System.out.println("\nDatos sin ordenar:");
        for (int i = 0; i < n; i++) {
            System.out.println(nombre[i] + " : " + cal[i]);
        }

        sorting.sort(nombre, cal);
    }
}
