package Day_51_ListAndSet;

import java.sql.ClientInfoStatus;
import java.util.*;

public class ListHomeWork_1 {

    public static void main(String[] args) {
   // String a="harun";
      //  System.out.println(reversePalindrom(a));  // palindrom metodunu ters ettik. kelimeleri terse çeviriyor

        List<String> list=new ArrayList<>(Arrays.asList("adanada","ankarada","efe","metin"));
        List<String> list1=new ArrayList<>(Arrays.asList("ey","edip","pide","ye","adanada"));
        //System.out.println(removePalindromList(list));     // 1. yol
       // System.out.println(removePalindromList2(list));        //  2. yol
        System.out.println(allPailndromClearLİst(list1));


    }



    // odev1
//interview sorusu   List<String>
//list içerisindeki palindrom/tersten ve düzden okunuşları aynı olan) kelimeleri list içerisinden silen metodu yazınız
// ey, edip, adanada, pide, ye   çıktı =  ey, edip, pide, ye



//    public static List<String> removePalindromList(List<String> list){          // 1. yol
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals(reversePalindrom(list.get(i)))){
//                list.remove(list.get(i));
//            }
//        }
//        return list;
//    }


    public static List<String> removePalindromList2(List<String> list){         // 2. yol

        Iterator<String> iter= list.listIterator();
        while (iter.hasNext()){
            String str=iter.next();

            if (str.equals(reversePalindrom(str))){
                iter.remove();
            }
        }
        return list;
    }



    public static String reversePalindrom(String str){    // palindrom metodu, kelimeleri tersten yazar.

        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }




    // odev-2
    // list içerisindeki polindrom kelimeler varsa list içerisinden her iki kelimeyi silen metodu yazınız
    // ey, edip, adanada, pide, ye         çıktı = boş



    public static List<String> allPailndromClearLİst(List<String> list){

        int count=0;
        int i,j;
       // List<String> mewList=new ArrayList<>();

        for ( i = 0; i < list.size(); i++) {
    String reverseStr=reversePalindrom(list.get(i));
            for ( j = 0; j < list.size(); j++) {
                if (list.get(i).equals(reverseStr)){
                    count++;

                }
            }
            if (count>=1){
                list.remove(list.get(i));
                list.remove(list.get(j));
            }
        }
        return list;
    }


























}
