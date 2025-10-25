public class ArrayQueue <T> implements IQueue<Object>{

    private Object[] data;
    private int rear; //Indice de insercion
    private int front;
    private int size;
    private static final int INITIAL_CAPACITY=10;//Constante para el tamaño inicial del arreglo

    public ArrayQueue(){
        this.data=new Object[INITIAL_CAPACITY];
        this.rear=0;
        this.front=0;
        this.size=0;
    }

    @Override
    public void offer(Object element){
        //Verifica la capacidad del array()
        expandCapacity();
        data[rear]=element;//pone el elemento en el indice asignado (rear)
        rear=(rear+1)% data.length;//recalcula rear, pero evita que se desvorde
        size++;
    }

    @Override
    public Object poll(){
        if(isEmpty()){
            System.out.println("La Queue esta vacia");
            return null;
        }
        T result= (T) data[front];
        data[front]=null;
        front=(front+1) % data.length;
        size--;
        return result;
    }

    @Override
    public Object peek(){
        if(isEmpty()){
            System.out.println("La Queue esta vacia");
            return null;
        }
        return data[front];

    }


    private void expandCapacity(){
        Object[] newArr= new Object[data.length*2];

        for(int i = 0; i<size; i++){
            newArr[i]=data[(front+i)%data.length];//vaciado de la info comenzando de 
        }
        //Reiniciamos los valores del arreglo para poderlo seguir usando
        front=0;//pone el frente en la primera posicion
        data=newArr;//Asigna el nuevo arreglo al tributo data
        rear=size;//indice de la siguiente insercion
    }

    @Override
        public void print() {
        StringBuilder sb= new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
        sb.append(data[ (front+i) % data.length ]);
        if(i<size-1) sb.append("->");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSize'");
    }

    
}
