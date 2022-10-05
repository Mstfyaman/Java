package Day_53_Map;

import java.util.*;
import java.util.TreeMap;

public class ManavMain {
    public static void main(String[] args) {

        Map<String,Manav> manav=new TreeMap<>();

        manav.put("02Elma05",new Manav("elma",25.99));
        manav.put("Ayva0204",new Manav("ayva",36.99));

        manav.get("Ayva0204").setFiyat(75.99);  // private  olduğu için setle değiştiriyoruz.
        manav.get("Ayva0204").fiyatArtır(5);
     //   System.out.println(manav.get("Ayva0204").getFiyat());



        for (String key: manav.keySet() ) {    // bütün keyleri yazdırmak istersek
            System.out.println(manav.get(key).getFiyat());
        }

        ///--------------------------------


        double toplamFiyat=0;

        for (String key: manav.keySet() ) {    //toplam fiyatları yazdırmak istersek
            toplamFiyat+=manav.get(key).getFiyat();
        }
        System.out.println(Math.round(toplamFiyat));

      //--------------------------------



      Map<String,Integer> map=new HashMap<>();
            map.put("elma",25);
            map.put("armut",35);
          int result=  map.get("armut")+15;         // böyle işlemlerde yapabiliyormuşuz.
        System.out.println(result);





        //-----------------------------------------

        int result2=0;
        for (String key: map.keySet()){   // keylerin toplamını aldık.  25+35 = 60 verecek
            result2+=map.get(key);
        }
        System.out.println(result2);

        //------------------

        map.forEach((k,v)-> System.out.println(v));  // burda keyleri yazdırdık.   25-35











    }
}
