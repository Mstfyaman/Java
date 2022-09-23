package Day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {

        //size(),add(),set(),isEmpty(),
        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Mehmet");
        names.add("Ayse");
        names.add("Zehra");

        System.out.println("names.size() = " + names.size());
        System.out.println("names.toString() = " + names.toString());
        System.out.println("names = " + names);

        names.set(2,"Fatma");            // 2. indekstekini fatma ile deiştirdik.
        System.out.println("names = " + names);

        names.add(2,"Ayse");       // ayşeyi tekrardan ekledik. eksilme olmadan +1 oldu
        System.out.println("names = " + names);
        System.out.println("names.size() = " + names.size());


        names.clear();
        System.out.println("names.isEmpty() = " + names.isEmpty());  // boş mu dolumu diyr bakar, şuan dolu olduğundan false verir
        System.out.println(names.size() == 0);  // boşmu diye sormanın bir diğer yolu


    }
}
