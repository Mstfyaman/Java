package Day_54_CollectionCont;

import java.util.*;

public class NavigableSetStudy {
    public static void main(String[] args) {


          NavigableSet<Integer> intSortedSet =new TreeSet<>();

        intSortedSet.add(20);
        intSortedSet.add(2);
        intSortedSet.add(2);
        intSortedSet.add(40);
        intSortedSet.add(10);
        intSortedSet.add(35);
        intSortedSet.add(50);
        intSortedSet.add(30);
        System.out.println("intSortedSet = " + intSortedSet);   // [2, 10, 20, 30, 35, 40, 50]

        //---------------lower--------------------

        System.out.println("intSortedSet.lower(35) = " + intSortedSet.lower(35));  // girilen sayının bir düşüğünü verir. yani bir en düşük değeri.

        //---------------higher-------------------

        System.out.println("intSortedSet.higher(50) = " + intSortedSet.higher(35));  // =40  girilen değerin elde olan bir büyük olanını veri.

        //---------------floor-------------------

        System.out.println("intSortedSet.floor(39) = " + intSortedSet.floor(36));  // girilen değerin bir altını döndürür. sayı aynısıysa aynısını verir.

        //--------------ceiling------------------

        System.out.println("intSortedSet.ceiling(34) = " + intSortedSet.ceiling(36)); // girilen değerin bir üstünü verir. sayı aynısıysa aynısını verir.


        //--------------pollFirst-----------------

        // intSortedSet.clear();
        System.out.println("intSortedSet = " + intSortedSet);  // []  şuan liste boş

        System.out.println("intSortedSet.pollFirst() = " + intSortedSet.pollFirst());   // ilk elemanı döndürür ve listeden atar. ilk eleman 2 idi
        System.out.println("intSortedSet = " + intSortedSet);  // [10, 20, 30, 35, 40, 50]    ilk eleman 2 yi döndürdü ve listeden attı.

        //-------------pollLast------------------

        System.out.println("intSortedSet.pollLast() = " + intSortedSet.pollLast());
        System.out.println("intSortedSet = " + intSortedSet);  // son eleman 50 idi.  50 yazdırdı ve attı. polllast    [10, 20, 30, 35, 40]

        //------------descendingSet-------------

        intSortedSet.addAll(Arrays.asList(30,60,70,80));
        System.out.println("intSortedSet = " + intSortedSet);   // [10, 20, 30, 35, 40, 60, 70, 80]
        System.out.println("intSortedSet.descendingSet() = " + intSortedSet.descendingSet()); // sıralamayı tersten yazdırır
        //[80, 70, 60, 40, 35, 30, 20, 10]

        //-----------subSet--------------------  // [10, 20, 30, 35, 40, 60, 70, 80]

        System.out.println("intSortedSet.subSet(30,true,70,false) = " + intSortedSet.subSet(30, true, 70, false));
                  //  girilen derğerin arasını yazdırır. 30 atrue dedik dahil eeti. 70 e false dedik dahil etmedi.


        //----------headSet-------------------

        System.out.println("intSortedSet.headSet(40) = " + intSortedSet.headSet(40,false));
        // 40 a kadar olan elementleri alır. istersek sonu false ve true ekleriz. yani girilen değeri dahil edip etmemek bizim elimizde.


        //---------tailSet-------------------

        System.out.println("intSortedSet.tailSet(40,false) = " + intSortedSet.tailSet(40, false)); // [60, 70, 80]
        // 40 hariç sonrasını istedik. istersek true ile 40 ıda dahil edebiliriz.  [40, 60, 70, 80]



        //---------iterarör-----------------

        Iterator<Integer> iterator = intSortedSet.iterator();     // döngü yapıyoruz.

        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next>39){
                iterator.remove();
            }
            System.out.println(intSortedSet);   //[10, 20, 30, 35]
        }


    }
}
