package Day_53_Map;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {


//        List<Integer> list=new ArrayList<>();     // listi hatırlayalım
//        list.add(5);
//        list.add(8);


        // Map<Key,Value> map=new HashMap<>();  böyle tanımlanır sol key dir sağ value

         Map<Integer, String> map= new HashMap<>();   // HashMap te yazarsak sıralama yapmaz
       // Map<Integer, String> map= new TreeMap<>();   // TreeMap de keylere göre doğal bir sıralama yapar küçükten büyüğe gibi
       // Map<Integer, String> map= new LinkedHashMap<>();   //  sıralamayı korur

        map.put(671,"Harun");
        map.put(895,"Mehmet");    // put metodu eklemeye yazar
        map.put(995,"ahmet");
//        map.forEach((k,v)-> System.out.println(k+" -->"+v));

       // System.out.println(map.get(671));   // burda key girmemizi istiyor. key'i girince bize value yi veriyor. (= harun)


        //-----------------------------------------------------------------------------


        Map<Integer,String> myMap=new HashMap<>();

        myMap.put(10,"Porche");
        myMap.put(20,"Ferrari");
        myMap.put(30,"Maserati");
        myMap.put(40,"Jaguar");
        myMap.put(50,"Mercedes");

       // System.out.println(myMap.get(40));     // 40 nolu key i çağırdık
       // System.out.println(myMap.size());     // boyutuna baktık
       // System.out.println(myMap.toString());    //içerisindeki verileri detaylıca gördük
       // myMap.remove(40);   // 40 nolu keyi sildik
       //  System.out.println(myMap);
       // System.out.println(myMap.containsKey(50));     // içerisinde 50 onu key var mı diye sorduk(true aldık)
       // System.out.println(myMap.containsValue("Kia"));   //kia varmı diye baktım olmadığından false aldık
       //   myMap.replace(40,"VolkWagen");    // 40 nolu keydeki jaguarı sildik ve volkswagen yazdık
       // System.out.println(myMap);

       // System.out.println(myMap.keySet());   // bu keylerin hepsini bir collection içersine atar ve keylerin hepsini görürüz
       //  System.out.println(myMap.values());  //  bu valuelerin hepsini bir collection içersiine atar ve keylerin hepsini görürüz

        // myMap.forEach((k,v)-> System.out.println(k+" -->"+v));   //  keylerle beraber valueleri yazdıdır


//        for (Integer num: myMap.keySet()) {   // foreach ile bir ınteger num değişkeni oluşturduk ve valueleri çağırdık
//            System.out.println(myMap.get(num));
//        }



        List< Map<Integer,String>> list=new ArrayList<>();   // list türünde map oluşturduk.
        list.add(myMap);   // myMap objemi buraya ekledim
        list.add(map);    // map objesini ekledik
      //  System.out.println(list.size());     // map ve myMap obje olduğundan listin eleman sayısı cevap 2 dir.
      //  System.out.println(list);  //[{50=Mercedes, 20=Ferrari, 40=Jaguar, 10=Porche, 30=Maserati}, {995=ahmet, 671=Harun, 895=Mehmet}]
                                                //burası 1. obje                                       // burası 2. obje
                                            // köşeli parantez arrayi temsil eder  // süslü parantez map i temsil eder

       // System.out.println(map.get(995));   // map in kendisinden 995 nolu key i çağırdık
       // System.out.println(list.get(1).get(995));  // list in elemanı olan 1. indexteki map ten 995 nolu keyi çağırdık



//        for (Map<Integer,String> sinif : list ) {        // burda liste ait objelerdeki bütün valueleri çağırdık
//            for (Integer key: sinif.keySet()) {
//                System.out.println(sinif.get(key));
//            }
//        }


//        for (int i=0; i<list.size(); i++){   // list in içindeki objeleri çağırıyor. sitring olarak
//
//            System.out.println(list.get(i));
//        }



































    }

}
