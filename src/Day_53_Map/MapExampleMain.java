package Day_53_Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExampleMain {
    public static void main(String[] args) {

        Map<Integer,Ogrenci> okul=new TreeMap<>();

        Ogrenci ogr1 =new Ogrenci("mehmet","yilmaz",53);
        Ogrenci ogr2 =new Ogrenci("ahmet","sen",89);
        Ogrenci ogr3 =new Ogrenci("enes","celik",76);
        Ogrenci ogr4 =new Ogrenci("adem","aslan",20);

        okul.put(278,ogr4);        //ogr4 objesini value olarak buraya ekledik
        okul.put(34,ogr3);            //  ''
        okul.put(25,ogr2);          //  ''
        okul.put(899,ogr1);        //  ''
        okul.put(145,new Ogrenci("harun","yildirim",10));  //  burda yeni ogrenci objesi oluşturduk.

        System.out.println(okul.get(25).getSurName());   // okul numarası 25 olan ogrecinin soy adını çağırdık



        List<Ogrenci> list =new ArrayList<>();
        list.add(ogr1);
        list.add(ogr2);
        list.add(ogr3);
        list.add(ogr4);
        System.out.println(list.get(0).getAverageNote());  // burda listin objesi olan index 0 daki ogr1 deki ogrencinin ortalama notunu aldık

        okul.get(899).setAverageNote(94.8);       // burda ogr1 in avaraj notunu değiştirdik.   //private olduğu için setle değiştrdik.
        System.out.println(okul.get(899).getAverageNote());  // avaraj notunu yazdırdık


    }
}
