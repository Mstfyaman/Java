package Assignments.class_object;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        //--------------------konu anlatım ---- SPLİT----------

//        String str= "Merhaba java insanlari";
//        String[] arry= str.split(" ");
//
//        arry[1]=" yurdum";
//
//
//        System.out.println(arry[0]);
//        System.out.println(arry[1]);
//        System.out.println(Arrays.toString(arry));
//
//
//        String[] arry2 = str.split("a");
//        System.out.println(arry2.length);
//
//        System.out.println(Arrays.toString(arry2));

        //--------------------konu anlatım ---- COPYOFRANGE----------


        int[] arrys= {1,2,3,4,5,6,7,8,9};

         int[] ints =Arrays.copyOfRange(arrys, 2, 6);

        System.out.println(Arrays.toString(ints));
        System.out.println(arrys.length);   // eskisi duruyor eksilme yok


        //--------------------konu anlatım ---- SORT----------

//        int[] arrys2= {9,7,4,5,8,7,1,11};
//
//        Arrays.sort(arrys2);
//        System.out.println(Arrays.toString(arrys2));          // degerleri küçükten büyüğe sıralar
//

        //--------------------konu anlatım ---- FİLL----------

        int[] arrys3= {9,7,4,5,8,7,1,11};

        Arrays.fill(arrys3,10);                          // hepsine 10 atar
        System.out.println(Arrays.toString(arrys3));

        Arrays.fill(arrys3,2,5,5);    // 2. indexten 5. indexe kadar 5 atar
        System.out.println(Arrays.toString(arrys3));


    }
}
