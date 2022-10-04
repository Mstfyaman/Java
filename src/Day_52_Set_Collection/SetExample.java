package Day_52_Set_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

       /* Set<Integer> set=new HashSet<>();      // sıraya dikkat etmez karışık verir.  aynı değer tekrar girilmez
        set.add(5);
        set.add(35);
        set.add(45);
        set.add(26);
        set.add(5);    // bu yenilenen değer olduğunda kabul etmez ve tekrar yazmaz
        set.add(26);   // bu yenilenen değer olduğunda kabul etmez ve tekrar yazmaz
        System.out.println(set);

        */

        /*
        Set<String> set1=new HashSet<>();
        set1.add("ahmet");
        set1.add("mehmet");
        set1.add("35");
        set1.add("ahmet");
        set1.add("mehmet");  // bu yenilenen değer olduğunda kabul etmez ve tekrar yazmaz
        System.out.println(set1);

         */

        String strArray=" mavi gomlekli urunu aldim ve size gonderdim gibi hatirliyorum";

        Set<String> hashSet= new HashSet<>(Arrays.asList(strArray));
        Set<String> treeSet= new TreeSet<>(Arrays.asList(strArray));

        System.out.println(hashSet);
        System.out.println(treeSet);


    }
}
