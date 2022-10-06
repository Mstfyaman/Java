package Day_54_CollectionCont;

import java.util.*;

public class SortedSetStudy {
    public static void main(String[] args) {

        SortedSet<Integer> intSortedSet = new TreeSet<>();  // sortedset i referans göstererek treeset oluşturduk
       // Set<Integer> ıntSortedSet1 =new TreeSet<>();
      //  NavigableSet<Integer> IntSort =new TreeSet<>();

        intSortedSet.add(2);
        intSortedSet.add(2);
        intSortedSet.add(10);
        intSortedSet.add(10);
        intSortedSet.add(10);
        System.out.println("intSortedSet = " + intSortedSet);

        System.out.println("intSortedSet.first() = " + intSortedSet.first());   // ilk değer = 2
        System.out.println("intSortedSet.last() = " + intSortedSet.last()); // son değer = 10

        intSortedSet.addAll(Arrays.asList(25,35,45));
        System.out.println("intSortedSet = " + intSortedSet);  //  [2, 10, 25, 35, 45]

      //  System.out.println("intSortedSet.add(null) = " + intSortedSet.add(null));    // null değer almaz.


        //--------------------SubSet----------------

        System.out.println("intSortedSet.subSet(25,35) = " + intSortedSet.subSet(25, 46));  // [25, 35, 45]     girilen değerlerin arasındaki değerleri yazdırır.
        //  yani 25 ve 46 arasındaki kendisinde var olan değerleri yazdırdı.


        //-------------------headSet--------------


        System.out.println("intSortedSet.headSet(35) = " + intSortedSet.headSet(36));  //[2, 10, 25, 35]  girilen değere kadar olan değerleri yazdırır.
        // 36 girdik  ve 36 ya kadar olan değerleri yazdırdı. fala olan değerleri almadı.


        //------------------tailSet-------------------

        System.out.println("intSortedSet.tailSet(35) = " + intSortedSet.tailSet(35)); // [35, 45]   // 35 değerini girdik bize 35 ve ondan büyük olan değerleri verdi.


        SortedSet<Integer> myTailSet = intSortedSet.tailSet(25);  // myTailSet diye bir obje oluşturduk ve elemanlarını insortedset'tailleri yaptık.
        System.out.println("myTailSet = " + myTailSet); //myTailSet = [25, 35, 45]   bize girilen 25 degerinden falza olanları ve aynı değeri verdi.

        System.out.println("myTailSet.remove(35) = " + myTailSet.remove(35)); // true dondürür.  35 i attık.



    }
}
