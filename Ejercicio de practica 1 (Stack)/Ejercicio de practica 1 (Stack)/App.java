public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayStack<String> stack = new ArrayStack<>();

        System.out.println(stack.isPalindrome("oso"));
        System.out.println(stack.isPalindrome("reconocer"));
        System.out.println(stack.isPalindrome("palabra"));
        System.out.println(stack.isPalindrome("amo la pacifica paloma"));
    }
}
