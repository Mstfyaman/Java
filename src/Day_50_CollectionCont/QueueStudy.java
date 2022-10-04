package Day_50_CollectionCont;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {

        Queue<Integer> numQue=new LinkedList<>();

        //offer     eleman ekler. add' den farkı bellek kapasitesi sorunu olursa offeri kullanıcaz.
        numQue.offer(1);
        numQue.offer(2);
        numQue.offer(4);
        numQue.offer(7);
        numQue.offer(8);
        numQue.offer(9);
        System.out.println("numQue = " + numQue);  //[1, 2, 4, 7, 8, 9]


        numQue.remove();   // ilk gireni çıkartır  yani 1 i attık
        System.out.println("numQue = " + numQue);
        // FİFO--> [2, 4, 7, 8, 9]

        //peek()    sıradaki elemanı gösterir
        System.out.println("numQue.peek() = " + numQue.peek());

        //element()    // sıradaki elemanı gösterir. eleman yoksa exception atar. peekten farkı exceptiondur
        System.out.println("numQue.element() = " + numQue.element());

        //poll    // herşeyi siler

        while (!numQue.isEmpty()){
            System.out.println("numQue.poll() = " + numQue.poll());   //herşeyi siler
          //  System.out.println(numQue.element());  // boş olduğu için exception atacak
            System.out.println(numQue.peek());   // boş ama exception atmayacak


        }
        System.out.println("numQue = " + numQue);  // numQue = []
        System.out.println("numQue.poll() = " + numQue.poll());    // null
       // System.out.println("numQue.remove() = " + numQue.remove()); // poll dan farkı exception atar.


    }
}
