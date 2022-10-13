package Assignments.mixed;

import java.util.*;

import static Day_45_OOP_ReviewCont2._interface.A.i;

public class SamsungInterviewQuestion {
    public static void main(String[] args) {

String str="samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA',20916," +
        "samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4',91995," +
        "samsung, 'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970," +
        "samsung,'Samsung DC97-17022B Assy Detergent',32959,samsung,'Samsung DC66-00470A DAMPER SHOCK',29981," +
        "samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150',52000," +
        "samsung,'Samsung DC97-16991A Assembly Filter',13000";



        String[] splitStr = str.split("samsung,'");

        Map <String,String> mapSamsung = new TreeMap<>();  // treemap otomalik küçükten büyüğe sıralama yapar.

        for (int i=1; i< splitStr.length; i++){
            String splitstr2[]=splitStr[i].split("',");

            mapSamsung.put(splitstr2[1],splitstr2[0]);
        }

        mapSamsung.forEach((K,V) -> System.out.println("samsung,'" + V + "'," + K));












     //  samsungListeOlustur(str);  // samsung sorusu method konsol.











//----------------------------------------------------------------------


//        String[] samsungSplit = str.split("samsung");
//        System.out.println(Arrays.toString(samsungSplit));
//       System.out.println("samsungSplit.length = " + samsungSplit.length);
//
//
//       String samsungSplit2="";
//        for (int j = 0; j < samsungSplit.length; j++) {
//            samsungSplit2+=samsungSplit[i];
//        }
//
//        String[] samsungArr2 = samsungSplit2.split("',");
//
//        System.out.println("Arrays.toString(samsungArr2) = " + Arrays.toString(samsungArr2));
//        System.out.println("samsungArr2.length() = " + samsungArr2.length);
//
//
////        for (String s1:stringList ) {
////            System.out.println("s1 = " + s1);
////        }
//
//    Map <String,Integer> newMap = new TreeMap<>();



// ---------------------------------------------------------------------------------------------------------


//        String metere="samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2,\n" +
//                " WA48J7700AW/AA',20916," +
//                "samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV,\n" +
//                " WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4',91995," +
//                "samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M',\n" +
//                " 22970,&samsung,'Samsung DC97-17022B Assy Detergent',32959," +
//                "samsung,'Samsung DC66-00470A DAMPER SHOCK',29981,&samsung,\n" +
//                " 'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150',52000," +
//                "samsung,'Samsung DC97-16991A Assembly Filter',13000\n ";
//
//
//        metere.split("samsung");
//        String a= metere;
//        a.split("',");
//        System.out.println("a = " + a);
//
//
////        String[] sprayt = metere.split("samsung");
////        String[] sprayt2 = metere.split("',");
////        System.out.println("Arrays.toString(sprayt2) = " + Arrays.toString(sprayt2));


    }


    public static void samsungListeOlustur(String str) {         // samsung sorusu method içerisinde çalışıyor.
        Map<String, String> mapStr = new TreeMap<>();

        String arrStr[] = str.split("samsung,'");

        for (int i = 1; i < arrStr.length; i++) {

            String arr2[] = arrStr[i].split("',");
            mapStr.put(arr2[1], arr2[0]);
        }

        mapStr.forEach((k, v) -> System.out.println("samsung,'" + v + "'," + k));


    }
}
