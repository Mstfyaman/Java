package Day_55_MapInterface_Cont;

import java.util.*;

public class MapInterfaceStudy_2 {
    public static void main(String[] args) {

        Map<String,Integer> ageMap = new HashMap<>();

        ageMap.put("Mehmet",25);
        ageMap.put("Hatice",24);
        ageMap.put("Ayse",22);
        ageMap.put("Metin",50);
        ageMap.put("Osman",37);
        ageMap.put("Zeynep",24);
        ageMap.put("Veli",24);
        ageMap.put("Ahmet",45);


        // how to collect all keys of map
        // set<K>  keySet()
        //Returns a "set view" of the keys contains in the map

        Set<String> stringSet = ageMap.keySet();
       // System.out.println("stringSet = " + stringSet);  // [Ahmet, Veli, Ayse, Zeynep, Mehmet, Osman, Hatice, Metin]

        // how to remove a key which have specific value
        //how to ceonvert/prepare a new map from current map
        //ages should be under 25



        Iterator<String> iterator = stringSet.iterator(); // iteratör nesnesi oluşturduk, döngü yaparak 25 te nbüyük valueleri sileceğiz.
        // foreach metodu ile silme işlemi yapılmadığı için iteratör kullanıyoruz.
        while (iterator.hasNext()){
            String next = iterator.next();
            if (ageMap.get(next)>25){             // burda key üzerinden yaptık.
                iterator.remove();
            }
        }
        System.out.println("ageMap = " + ageMap);  // ageMap = {Veli=24, Ayse=22, Zeynep=24, Mehmet=25, Hatice=24}



        for (String eachKey : stringSet){  // burası ; stringSet problerini kendi türünde(String) eachKey ismi(ismi biz veririz) ile ayır der.
            System.out.println("eachKey = " + eachKey
            +" -->"+ageMap.get(eachKey));
        }


        //Collection
        //Returns a "Collection view" of the contained in the map

        Collection<Integer> values = ageMap.values();
        System.out.println("values = " + values);   // [24, 22, 24, 25, 24] ageMap e ait valueleri depolamış.


        Iterator<Integer> iterValues = values.iterator();

        while (iterValues.hasNext()){
            Integer next = iterValues.next();
            if (next<24){   // burda value değerleri elimizde olduğundan next i direkt yazdık
                iterValues.remove();
            }
        }
        System.out.println("values = " + values);
        System.out.println("ageMap = " + ageMap);  // {Veli=24, Zeynep=24, Mehmet=25, Hatice=24}  24 ün altındakileri attık.


        Iterator<Integer> iterValue2 = values.iterator();
        System.out.println("iterValue2.hasNext() = " + iterValue2.hasNext());



        System.out.println("---------------------------------------------");


        Set< Map.Entry<String,Integer> > entries = ageMap.entrySet();

        for (Map.Entry<String,Integer> eachEntry : entries){  // tipi aldık bağa yazdık, sonra bir isim verdik, açacağımız bohçayıda :' den sonraya yazdık
            System.out.println("eachEntry.getKey() = " + eachEntry.getKey()+" --->"+eachEntry.getValue());   // Veli --->24 , Zeynep --->24  gibi değerler geldi.

            if (eachEntry.getValue()>24){
                eachEntry.setValue(100);  // for'un içinde silme işlemi yapılamadığından setValue ile değişikliğe gittik. silme iteratörde oluyor.

            }
        }
        System.out.println("ageMap = " + ageMap);  // {Veli=24, Zeynep=24, Mehmet=100, Hatice=24}

        System.out.println("-------------------------------------------");

        NavigableMap<Integer,String>  navMap= new TreeMap<>();
        navMap.put(25,"Mehmet");
       // navMap.put(24,"Hatice");
        navMap.put(22,"Ayse");
        navMap.put(37,"Osman");
       // navMap.put(24,"Zeynep");
        navMap.put(24,"Veli");
        navMap.put(45,"Ahmet");

        System.out.println("navMap = " + navMap);  // {22=Ayse, 24=Veli, 25=Mehmet, 37=Osman, 45=Ahmet, 224=Hatice}   keyleri aynı olanları almaz
        System.out.println("navMap.descendingMap() = " + navMap.descendingMap()); // {45=Ahmet, 37=Osman, 25=Mehmet, 24=Veli, 22=Ayse}  sıralama yapar. büyükten küçüğe


    }
}
