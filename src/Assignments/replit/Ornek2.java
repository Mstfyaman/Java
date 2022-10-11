package Assignments.replit;

import Day_24_Arrays_2.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ornek2 {

    public static void main(String[] args) {

        String str = "efe ata onu oppo birakma";
        String str2= "";

        for (int i = str.length()-1; i >=0 ; i--) {
            str2+= str.charAt(i);
        }

        String[] s = str.split(" ");
        String[] s2 = str2.split(" ");

        List <String> list=new ArrayList<>(Arrays.asList(str));
        List <String> list2=new ArrayList<>(Arrays.asList(str2));

        for (int i = 0; i <list.size() ;) {
            if (list.get(i).equals(list2.get(i))){
                list.remove(list.get(i));
                continue;
            }
            i++;
        }
        System.out.println(list);


        // System.out.println("list.removeAll(list2) = " + list.removeAll(list2));

        // System.out.println(removeReverse2(str));


    }

//    public static List<String> removeReverse2(String str) {
//        String reverse = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverse += str.charAt(i);
//        }
//
//
//        String[] strArray = str.split(" ");
//        String[] strArrayReverse = reverse.split(" ");
//
//        List<String> strList = new ArrayList<>(Arrays.asList(strArray));
//        List<String> strListReverse = new ArrayList<>(Arrays.asList(strArrayReverse));
//
//        strList.removeAll(strListReverse);
//
//        return  strList;
//    }


}
