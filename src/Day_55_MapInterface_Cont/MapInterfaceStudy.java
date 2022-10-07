package Day_55_MapInterface_Cont;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceStudy {
    public static void main(String[] args) {

        Map<String,Integer> ageMap=new HashMap<>();
        // Map<K,V>  yapı budur.  key ve value

        // -----Put-----  eleman ekleme

        ageMap.put("Mehmet",25);
        ageMap.put("Ahmet",24);
        ageMap.put("Ayse",22);

        // -----size----- boyut sorma

        System.out.println("ageMap.size() = " + ageMap.size());
        
        // -----get(k)----- key ile çağırma

        System.out.println("ageMap.get(\"Mehmet\") = " + ageMap.get("Mehmet"));

        int ageOfMehmet = ageMap.get("Mehmet");   // get bize valueyi döndürüyor. şuan bizim valuemiz Integer.
        // biz bunu o yözden int bir değer attık. ve unboxing yaptık. yani ( İnteger --> int oldu)

        // -----containsKey---- ...key var mı?   //true

        System.out.println("ageMap.containsKey(\"Mehmet\") = " + ageMap.containsKey("Mehmet"));

        // -----remove-----  girilen keyi atma.

        System.out.println("ageMap.remove(\"Mehmet\") = " + ageMap.remove("Mehmet"));
        System.out.println("ageMap = " + ageMap);  // {Ahmet=24, Ayse=22}

        // ----putAll-----

        Map<String,Integer> ageMap2 = new HashMap<>();   // yeni bir map oluşturduk

        ageMap2.put("Metin",null);
        ageMap2.put("Osman",37);
        ageMap2.put("Hakan",24);
        ageMap2.put("Ahmet",24);
        ageMap2.put("Ahmet",25);

        ageMap.putAll(ageMap2);   // eski map imize yeni mapimizi yazdık

        System.out.println("ageMap = " + ageMap);  //{Ahmet=25, Ayse=22, Osman=37, Hakan=24, Metin=null}

        // -----clear-----

        ageMap2.clear();
        System.out.println("ageMap2 = " + ageMap2); //  {}  bu boş oldu.
        System.out.println("ageMap = " + ageMap); // ageMap2 i boşalmamız ageMap i etkilemiyor. çünkü bunlar ayrı birer nesneler.
        // {Ahmet=25, Ayse=22, Osman=37, Hakan=24, Metin=null}


        // -----putİfAbsent-----   eger ... yoksa ata dedik.

        System.out.println("ageMap.putIfAbsent(\"Osman\",38) = " + ageMap.putIfAbsent("Osman", 38));
        // eger osman yoksa oraya osmanı ata ve yaşı olarak 38 i koy dedik ancak osmanın yaşı tanımlı olduğundan olan yaşı bize verdi. // = 37


        // -----replace-----   key gireriz ve value yi değiştiririz. ayrıca bize eski yaşıda yazdırır.

        System.out.println("ageMap.replace(\"Ayse\",24) = " + ageMap.replace("Ayse", 24));
        System.out.println("ageMap = " + ageMap);   // {Ahmet=25, Ayse=24, Osman=37, Hakan=24, Metin=null}

        ageMap.replace("Ayse",24,25); // burda once yaşını girdik. yaşı doğru olduğu için true verdi ve yaşı değiştirdi 25 yaptı.
        System.out.println("ageMap = " + ageMap);   //{Ahmet=25, Ayse=25, Osman=37, Hakan=24, Metin=null}

        ageMap.replace("Ayse",21,30);  // burda ayşenin yaşını 25 ken 21 i olarak yanlış girdik ve metot false verdiği için 30 olarak değiştirmedi.
        System.out.println("ageMap = " + ageMap);  // {Ahmet=25, Ayse=25, Osman=37, Hakan=24, Metin=null}




    }
}
