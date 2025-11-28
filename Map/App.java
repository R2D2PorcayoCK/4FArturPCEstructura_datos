import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();
                                    //HashMap NO GUARDA EL ORDEN DE INSERCIÓN
        map.put(1, "Mouse");
        map.put(2, "Teclado");
        map.put(3, "Monitor");
        map.put(1, "Mouse Gamer"); //SUSTITUYE EL VALOR ASOCIADO A LA CLAVE 1

        System.out.println(map);

        String data = map.get(1);//OBTIENE EL VALOR ASOCIADO A LA CLAVE 1
        System.out.println(data);//MOUSE GAMER
        boolean exist = map.containsValue("Teclado");//VERIFICA SI EXISTE EL VALOR "TECLADO" EN EL MAPA
        System.out.println("Hay un teclado? "+exist);
        map.remove(1);

        for(Map.Entry<Integer, String> row : map.entrySet()){ //INTEGER Y STRING CAMBIAN DEPENDIENDO DE LOS VALORES QUE LE PASES ARRIBA EN MAP.PUT
            
            System.out.println("La key es: "+row.getKey()+" y el valor es: "+row.getValue());
        }

        boolean existKey = map.containsKey(2);//VERIFICA SI EXISTE LA CLAVE 3 EN EL MAPA
       
        System.out.println(existKey);


    }
}