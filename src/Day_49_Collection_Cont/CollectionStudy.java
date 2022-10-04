package Day_49_Collection_Cont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionStudy {
    public static void main(String[] args) {

        ArrayList<Integer> list1 =new ArrayList<>();

        List<Integer> list2=new ArrayList<>(); //polymorphic way (cunku referans(interface) list- class arraylist )

        Collection<Integer> col=new ArrayList<>(); // interface Collection  class Arraylist

        //adding element/object/item
        col.add(5);
        col.add(15);
        col.add(25);
        col.add(20);
        col.add(50);
        System.out.println(col);


        //getting size
        System.out.println("col size: "+col.size());

        //remove items  8objectin kendisini remove yapar)
        col.remove(15);   // 15 i attık
        System.out.println("col = " + col);   //col = [5, 25, 20, 50]
        col.remove(40);  // olmayan bir nesneyi atmak istersek false verir
        col.add(5); col.add(80);   // [5, 25, 20, 50, 5, 80]    ekleme yaptık
        System.out.println("col = " + col);
        col.remove(5); // 5 i atacak    [25, 20, 50, 5, 80] baştaki 5 i attı.
        System.out.println("col = " + col);

        //contains item
        System.out.println("col.contains(50) = " + col.contains(50));  // 50 içerir mi? ( içerdiği için true)
        System.out.println("col.contains(1000) = " + col.contains(1000));  // 1000 nesneler içinde olmadığından false verir.


        // checking empty or not
        System.out.println("col.isEmpty() = " + col.isEmpty()); // boş mu diye soruyoruz.  dolu olduğundan false verir.

        // removeAll
      //  col.removeAll(col);  // tamamen boşaltır.
      //  col.removeAll(Arrays.asList(50,5));       (Arrays.asList= yeni değerler girmede kullanılır.)
        System.out.println("col = " + col);
        System.out.println("col.isEmpty() = " + col.isEmpty());  // tamamen boş olduğu için true verir.


        //addding all
        col.addAll(Arrays.asList(60,70,90));  //(Arrays.asList= yeni değerler girmede kullanılır.)
        System.out.println("col = " + col);   // burda yeni nesneler ekledik.  col = [60, 70, 90]


        //contains all
        System.out.println(col.containsAll(Arrays.asList(25, 20)));  // 25 ve 20 varmı ?(true var)  iki verininde doğru olması gerekir.

        //retain all    [25, 20, 50, 5, 80, 60, 70, 90]
       // col.removeAll(Arrays.asList(25,20));  // sadece 25 ve 20 yi tutar gerisini atar.  // yanlış deger girersek boş döndürür.
        System.out.println("col = " + col);


       // turning to array   [25, 20, 50, 5, 80, 60, 70, 90]
       Integer[] toArray= col.toArray(new Integer[11]);  // arrayin boyutunu olurundan fazla girersek bunu verir : [25, 20, 50, 5, 80, 60, 70, 90, null, null, null]
        System.out.println("array : "+Arrays.toString(toArray));


    }

}
