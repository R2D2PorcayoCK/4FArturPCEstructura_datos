import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App{
    public static void main (String[] args) {

        Set<String> set = new TreeSet<>();
                              //HasSet<>(); NO GARANTIZA ORDEN AL IMPRIMIR
                              //LinkedHashSet<>(); GARANTIZA ORDEN DE INSERCION
                              //TreeSet<>(); GARANTIZA ORDEN NATURAL (ALFABETICO, NUMERICO)

        set.add("Azul");
        set.add("Verde");
        set.add("Rojo");
        set.add("Amarillo");
        set.add("Rojo");//SE OMITE POR DUPLICIDAD

        System.out.println(set);//IMPRIME TODOS MENOS UNO POR DUPLICIDAD

        boolean existeRed = set.contains("Rojo");//EXISTE X ONJETO
        System.out.println("¿Existe el color Rojo? " + existeRed);

        set.remove("verde");//ELIMINA ELEMENTO
        int  tam = set.size();//OBTIENE TAMAÑO

        for(String data : set){//RECORRIDO ESTANDAR
            System.out.println("Dato: " + data);
        }
        
        System.out.println("Tamaño del conjunto: " + tam);
    }
}
