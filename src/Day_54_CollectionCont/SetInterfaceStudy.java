package Day_54_CollectionCont;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterfaceStudy {

    public static void main(String[] args) {

      //unique item/ no dublicate


        Set<Long> longSet=new HashSet<>();
        longSet.add(7l);
        longSet.add(7l);
        longSet.add(7l); //  burda long süründe deger girdiğimiz için 7'nin sounda l yi berlitcez.  float yazsaydık f yide.
        longSet.add(7l);
        longSet.add(70l);
        longSet.add(70l);
        System.out.println("longSet = " + longSet);  // longSet = [70, 7]   ilk 7 ve ilk 70 i aldı.  set tekrarları sevmez.

        for (long each: longSet ) {
            System.out.println("--->"+each);   //   --->70  --->7
        }


        longSet.addAll(Arrays.asList(2l,3l,4l,4l,4l));   // longSet = [2, 3, 4, 70, 7]    7 ve 70 daha onceden vardı. yenice 2 ve 3 ü ekledi.
        System.out.println("longSet = " + longSet);

        System.out.println("longSet.add(null) = " + longSet.add(null));     // bir tane null ekledik.   2. null tekrar olduğu için almadı.
        System.out.println("longSet.add(null) = " + longSet.add(null));
        System.out.println("longSet = " + longSet);  // longSet = [null, 2, 3, 4, 70, 7]


        if (!longSet.add(70l)){        // 70 içerde varsa at dedik.  70 atıldı
            longSet.remove(70l);
        }
        System.out.println("longSet = " + longSet);  // [null, 2, 3, 4, 7]


    }

}
