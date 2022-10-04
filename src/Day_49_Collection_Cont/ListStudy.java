package Day_49_Collection_Cont;

import java.util.*;

public class ListStudy {
    public static void main(String[] args) {

        List<Integer> list=new LinkedList<>(Arrays.asList(10,70,50,40,100)); // arrayin içini doldurduk, 4 adet nesnesi oldu
        System.out.println("list = " + list);

        //accessing item
        System.out.println(list.get(0));

        //adding items with index
        list.add(0,11);    //[11, 10, 70, 50, 40, 100]
        System.out.println(list);
        System.out.println("list.get(0) = " + list.get(0));

        //updating item
        list.set(0,10);   // [10, 10, 70, 50, 40, 100]  // burda 0. indexe 10 atadık.
        System.out.println("list = " + list);

        //getting index of item
        System.out.println("list.indexOf(10) = " + list.indexOf(10));  // 10 un indexini verir. ilk 10 u verir.
        System.out.println("list.indexOf(10) = " + list.indexOf(1000)); // listede 1000 yok ve -1 verir.

        //remove with index
        list.remove(0);   //0 ı attık
        System.out.println(list);

        //add all
        list.addAll(Arrays.asList(60,80));   // 60 ve 80 i ekledik
        System.out.println(list);     //[10, 70, 50, 40, 100, 60, 80]
        list.addAll(2, Arrays.asList(30,90));  // 2. indexten sonra 30 ve 90 ı ekledik.    // bu indexli addAll
        System.out.println(list);   // [10, 70, 30, 90, 50, 40, 100, 60, 80]

        //sort
        list.sort(null);   // listeyi küçükten büyüğe sıralar. // içerisine birşeyler yazmak gerekir nullu kabul eder.
        System.out.println(list);
        list.sort(Comparator.naturalOrder());  // normal sıralama yapmanın bir diğer yolu
        System.out.println(list);
        list.sort(Comparator.reverseOrder());  // [100, 90, 80, 70, 60, 50, 40, 30, 10]     tersten sıralama yapar
        System.out.println(list);

        //sublist (from-to şeklinde çalışır)
        System.out.println("subList(2,6) = " + list.subList(2, 6));    // istenilen indexlerin arasını verir. [80, 70, 60, 50]
        List<Integer> sunList3_8= list.subList(3,8);  // burda yeni bir nesne oluşturduk 70,60,50,40,30 ' dan oluşan.
        System.out.println("sunList3_8 = " + sunList3_8);
        sunList3_8.set(1,555);   //1. indexe 555 i atadık.
        System.out.println("sunList3_8 = " + sunList3_8);
        System.out.println("list = " + list);  //  [100, 90, 80, 70, 555, 50, 40, 30, 10]
        list.set(5,556);  //5. index e 556 atadık
        System.out.println("list = " + list);  //[100, 90, 80, 70, 555, 556, 40, 30, 10]
        System.out.println("sunList3_8 = " + sunList3_8);  //[70, 555, 556, 40, 30]


        // list iterator
        ListIterator<Integer> listIterator = list.listIterator();      //[100, 90, 80, 70, 555, 556, 40, 30, 10]
        System.out.println("listIterator.hasNext() = " + listIterator.hasNext());
       // System.out.println("listIterator.next() = " + listIterator.next());

        while (listIterator.hasNext()){
            Integer next = listIterator.next();  // ( listiterator.next   yaptık ve onu bir değişkene atadık(alt enter yaparak))
            System.out.println(next);
            if (next>40){
                listIterator.remove();
            }
        }
        System.out.println(list); //[40, 30, 10]
        System.out.println("listIterator.hasNext() = " + listIterator.hasNext());
        System.out.println("listIterator.hasPrevious() = " + listIterator.hasPrevious());
        System.out.println("listIterator.previous() = " + listIterator.previous());

        while (listIterator.hasPrevious()){
            Integer previous = listIterator.previous();
            if (previous<40){
              //  listIterator.remove();  //40
              //  listIterator.set(2022);
                listIterator.add(333);
            }
        }
        System.out.println(list);   //[40, 333, 30, 10]

    }
}
