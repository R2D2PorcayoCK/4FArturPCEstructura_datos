public class ArrayStack<T> implements IStack<T> {

    private Object[] data;
    private int top;

    public ArrayStack() {
        this(10);
    }

    public ArrayStack(int capacidadInicial) {
        this.data = new Object[capacidadInicial];
        this.top = 0;
    }

    @Override
    public void push(T element) {
        if (top == data.length) {
            System.out.println("La pila está llena");
            return;
        }
        data[top++] = element;
    }

    @Override
    public T pop() {
        if (isempty()) {
            System.out.println("La pila está vacía");
            return null;
        }
        T value = (T) data[--top];
        data[top] = null;
        return value;
    }

    
    @Override
    public T peek() {
        if (isempty()) {
            System.out.println("La pila está vacía");
            return null;
        }
        return (T) data[top - 1];
    }

    @Override
    public void clear() {
        for (int i = 0; i < top; i++) {
            data[i] = null;
        }
        top = 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isempty() {
        return top == 0;
    }

    @Override
    public void print() {
        System.out.print("[");
        for (int i = top - 1; i >= 0; i--) {
            System.out.print(data[i]);
            if (i != 0) System.out.print(" => ");
        }
        System.out.println("]");
    }

    public boolean isPalindrome(String text) {
        String letras = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                letras += Character.toLowerCase(c);
            }
        }

       
        ArrayStack<Character> pila = new ArrayStack<>(letras.length());

        for (int i = 0; i < letras.length(); i++) {
            pila.push(letras.charAt(i));
        }

       
        for (int i = 0; i < letras.length(); i++) {
            if (letras.charAt(i) != pila.pop()) {
                return false;
            }
        }

        return true;
    }
}
