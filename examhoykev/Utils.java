import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Utils{

    Queue<Package> incoming= new ArrayDeque<>(); // cola de llegada (entrada de paquetes)
    Deque<Package> heavyStack = new ArrayDeque<>(); // estante/pila para paquetes PESADOS
    Deque<Package> lightStack= new ArrayDeque<>();  // estante/pila para paquetes LIGEROS
    List<Package> dispatched = new ArrayList<>(); // lista de paquetes despachados en orden final

    public Utils(Queue<Package> incoming){
    this.incoming= new ArrayDeque<>();
    this.heavyStack= new ArrayDeque<>();
    this.lightStack= new ArrayDeque<>();
    this.dispatched=new ArrayList<>();
    }

    public void storeRec(Queue<Package> incoming){

        if(incoming == null || incoming.isEmpty()){
        return;
        }

        Package p = incoming.poll();

        if(p.isHeavy()==true){
        this.heavyStack.push(p);
        }else{
        this.lightStack.push(p);
        }
        storeRec(incoming);



    }

    public void dispatchHeavyRec(Deque<Package> heavyStack, List<Package> dispatched){
        if (heavyStack == null || heavyStack.isEmpty()){
            return;
        }else{
        Package h = heavyStack.pop();
        System.out.println("Despachando: "+h);
        dispatched.add(h);
        dispatchLightRec(heavyStack, dispatched);
        }
        
    }

    public void dispatchLightRec(Deque<Package> lightStack, List<Package> dispatched){
        if (lightStack == null || lightStack.isEmpty()){
            return;
        }else{
             Package l = lightStack.pop();
            System.out.println("Despachando: "+l);
            dispatched.add(l);
            dispatchLightRec(lightStack, dispatched);
        }
        
    }

    
}