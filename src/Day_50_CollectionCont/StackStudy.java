package Day_50_CollectionCont;


import java.util.Arrays;
import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {

        //LİFO  ( last in first out)
        //push()-
        Stack<Integer> stc=new Stack<>();
        stc.addAll(Arrays.asList(2,4,6,7,8));
        System.out.println("stc = " + stc);

        stc.push(1);  // 1 i ekliyoruz ve ensona atar
        System.out.println("stc = " + stc); // lifo [2, 4, 6, 7, 8, 1]
        stc.push(11); // 11 i ekliyoruz ve ensona atar
        System.out.println("stc = " + stc);

        //pop()
        System.out.println("stc.pop() = " + stc.pop());  // ensondakini atar
        System.out.println("stc = " + stc);

        //peek()
        System.out.println("stc.peek() = " + stc.peek());  // ensondaki değeri yazdırır.
        System.out.println("stc = " + stc); //stc = [2, 4, 6, 7, 8, 1]

        //search
        System.out.println("stc.search(8) = " + stc.search(8));
        


    }
}
