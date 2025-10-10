import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception{

        Queue<Package>cola= new ArrayDeque<>();

        Package p1 = new Package(1, 12.5, "Gimnasio");
        Package p2 = new Package(2, 3.2, "Ropa");
        Package p3 = new Package(3, 18.0, "Equipo audio");
        Package p4 = new Package(4, 1.1, "Joyero");
        Package p5 = new Package(5, 9.9, "Utensilios");
        Package p6 = new Package(6, 13.2, "Herramientas");

        cola.offer(p1);
        cola.offer(p2);
        cola.offer(p3);
        cola.offer(p4);
        cola.offer(p5);
        cola.offer(p6);

        Utils u = new Utils(cola);

        System.out.println("lista origin: " +cola);

        u.storeRec(cola);
        System.out.println("Despacho pesado: " +u.heavyStack);
        System.out.println("Despachando light: "+u.lightStack);

       



         u.dispatchHeavyRec(u.heavyStack, u.dispatched);
         u.dispatchLightRec(u.lightStack, u.dispatched);

          System.out.println("orden final: "+u.dispatched);

          



        // System.out.println("Pila original: " +cola);

        // //u.storeRec(incoming);

        // u.storeRec(cola);
        // System.out.println("Despachando pesados: " +u.heavyStack);

        // for(Package p : u.heavyStack){
        //     System.out.println("Encolando : " +p.getDesc());
        //     u.dispatched.add(u.heavyStack.poll());
        //     if(u.heavyStack.peek()!=null);
        // }

        // if(u.heavyStack.peek()!=null){
        //     System.out.println("Siguiemte: "+u.heavyStack.peek().getDesc());
        // }else{
        //     System.out.println("Se termino de surtir, no hay next... ");
        // }
        // System.out.println("Se termino de surtir los heavy...");

        // //----------------------------------------------------------
        // //----------------------------------------------------------

        // System.out.println("Despachando ligeros: " +u.lightStack);
        // u.dispatchLightRec(lightStack, dispatched);

        // if(u.lightStack.peek()!=null){
        //     System.out.println("Siguiemte: "+u.lightStack.peek().getDesc());
        // }else{
        //     System.out.println("Se termino de surtir, no hay next... ");
        // }
        // System.out.println("Se termino de surtir los light...");

    }
    
}
