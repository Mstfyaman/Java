package Day_52_Set_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {

        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2=new HashSet<>(Arrays.asList(4,5,6,7,8));


        //Union  ( birleşim )
       // set1.addAll(set2);      // setler tekrar eden elemanları almadığından çift olanları attı
       // set1.forEach(p-> System.out.print(p+" "));   // 1 2 3 4 5 6 7 8


        // intersection ( kesişim )
       // set1.retainAll(set2);
       // set1.forEach(p-> System.out.print(p+" "));   // kesişimleri 4 ve 5

        //difference item ( fark )
      // set1.removeAll(set2);  // set1' in set2 den farkı
       // set1.forEach(p-> System.out.print(p+" "));   // 1 2 3

       // set2.removeAll(set1);  // set2 nin set1 den farkları
     //   set2.forEach(p-> System.out.print(p+" "));    //  6 7 8


    }
}
