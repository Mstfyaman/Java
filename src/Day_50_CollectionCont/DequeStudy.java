package Day_50_CollectionCont;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.*;

public class DequeStudy {
    public static void main(String[] args) {

        Deque<Integer> deq=new ArrayDeque<>();


        //push  degerler atar
        deq.push(200);
        deq.push(5);
        deq.push(7);
        deq.push(8);
        deq.push(20);
        deq.push(25);
        System.out.println("deq = " + deq);    //[25, 20, 8, 7, 5, 200]

        //offer
        deq.offerFirst(11);    // ilk başa ekler
        deq.offerLast(12);    // ensona  ekler
        System.out.println("deq = " + deq);         //[11, 25, 20, 8, 7, 5, 200, 12]

        //add
        deq.addFirst(15);     // buda ilkbaşa  ekleme yapar
        deq.addLast(30);    // buda ensona ekleme yapar
        System.out.println("deq = " + deq);    //[15, 11, 25, 20, 8, 7, 5, 200, 12, 30]

        //pop     ilkini siler
        deq.pop();
        System.out.println("deq = " + deq);     //[11, 25, 20, 8, 7, 5, 200, 12, 30]



        //deq.addLast(100);
        deq.addFirst(100);
        System.out.println("deq = " + deq);

        while (!deq.isEmpty()){
            System.out.println("deq.pop() = " + deq.pop());  // döngüyle hepsini tek tek attı.
            System.out.println("deq = " + deq);     //  deq = []
        }





    }
}
