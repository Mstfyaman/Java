package Day_48_Collection;

import java.util.Stack;

public class Stack_Example {
    public static void main(String[] args) {

        Stack<Object> stack=new Stack<>();  // object olarak tanımladık dikkat !!!
        stack.add(true);
        stack.add(5);
        stack.add("Merhaba");
        stack.add('C');
        stack.add(8.8);
        System.out.println(stack.size());
        System.out.println(stack.pop());   // en sondakini attı  son olan c oldu
        System.out.println(stack.size());
        System.out.println(stack.pop());  // en sondakini attı en son merhaba oldu
        System.out.println(stack.size());
        System.out.println(stack.peek());  // sonuncuyu getirir
        System.out.println(stack.push("dunya"));  // bunu ekler ve ekrana yazdırır.
        System.out.println(stack.size());

    }
}
