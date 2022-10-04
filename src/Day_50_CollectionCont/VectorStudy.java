package Day_50_CollectionCont;

import java.util.*;

public class VectorStudy {
    public static void main(String[] args) {

        Vector<String> vec=new Vector();
        vec.add("nn");
        System.out.println("vec.size() = " + vec.size());
        System.out.println("vec = " + vec);


        //addAll
        vec.addAll(Arrays.asList("aa","ab","ddd","al","aa","nn"));
        System.out.println("vec = " + vec);  //[nn, aa, ab, ddd, al, aa, nn]

        //addElement()   // normal add ' den  çok bir farklı yok buda tek bir değişken ekler
        vec.addElement("tc");
        System.out.println("vec = " + vec);  //[nn, aa, ab, ddd, al, aa, nn, tc]

        //capacity()
        System.out.println("vec.size() = " + vec.size());
        System.out.println("vec.capacity() = " + vec.capacity()); // kapasitesine bakar. 10' un altında değişken varsa 10-  10 dan fazlaysa 20-- 20den fazlaysa 40 verir gider.

        //clear     //hepsini temizler
            // vec.clear();
            System.out.println("vec = " + vec);

        //clone
        Object clone = vec.clone(); // ( vec.clone yazdık ve alt enter ile bir değişkene atadık)
        System.out.println("clone = " + clone);   //aynısını koplayar ve yeni bir clone oluşturur.   clone = [nn, aa, ab, ddd, al, aa, nn, tc]

        //contains
        System.out.println("vec.contains(nn) = " + vec.contains("nn"));    // nn içeriyor mu?

        //containsAll
        vec.containsAll(Arrays.asList("aa","tc"));    // coklu bu aa ve tc içeriyor mu diye

        //copyinto()
        String[] strings = new String[9]; // bir string array oluşturduk.   // array 8 değişkenli ama biz 9 yazdık onun yerine null yazar. collectionun indexinden düşük olmamalı
        vec.copyInto(strings); // burda vec in içindekileri strings e kopyaladık.
        System.out.println("Arrays.toString(strings) = " + Arrays.toString(strings));  //[nn, aa, ab, ddd, al, aa, nn, tc, null]

        //ensureCapacity();
        System.out.println("vec.capacity() = " + vec.capacity());
        vec.ensureCapacity(30);  // vec in kapasitesini 30 a çıkardı.
        System.out.println("vec.capacity() = " + vec.capacity());

        //trimToSize();
        vec.trimToSize();   // kendi içerisinde kaç tana değişken varsa onunla kapasiteyi sınırladı. güvenlik amacıyla
        System.out.println("vec.capacity() = " + vec.capacity());


        //set()          //2. index e ccc atadık
        vec.set(2,"ccc");
        System.out.println("vec = " + vec);

        //setElementAt()   //buda setin ters hali önce girilecek olan sonra indexi giriyoruz
        vec.setElementAt("cccc",2);
        System.out.println("vec = " + vec);


    }
}
