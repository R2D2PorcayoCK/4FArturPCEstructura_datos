import java.util.ArrayDeque;
import java.util.Deque;


public class Stack {


public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Deque<String> paginaWeb = new ArrayDeque<>();


        paginaWeb.push("Pagina1");
        paginaWeb.push("Pagina2");
        paginaWeb.push("Pagina3");

         for (String pagweb : paginaWeb){
            System.out.println(pagweb); //imprime 3,2,1
          
        }


        System.out.println("Quitando a: " + paginaWeb.pop()); // Elimina pagina


        System.out.println("Siguiente: " + paginaWeb.peek()); // Muestra pagina


        paginaWeb.push("Nueva pagina creada..."); // Crea una nueva pagina


        System.out.println("Stack: " + paginaWeb); //Muestra stack de paginas


    }


}


