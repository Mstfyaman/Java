package Day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExampleİnterview {
    public static void main(String[] args) {

        Integer array[]={0,2,0,4,5};
       // List<Integer>list=new ArrayList<>(Arrays.asList(array));
       // System.out.println(moveAllZeroAddEnd(list));
       // System.out.println(moveAllZeroAddEnd2(list));

        String array2[]={"Mehmet","Ahmet","Harun","Enes","mehmet"};
        List<String>list2=new ArrayList<>(Arrays.asList(array2));
        System.out.println(removeNameListMethod(list2, "Mehmet"));


    }



    // interview question
    // list içerisindeki tüm sıfırları listin sonuna yazan methodu yazınız.
    // giris :0,2,3,5,0,4,5      cıkıs:  2,3,4,5,0,0


    public static List<Integer> moveAllZeroAddEnd(List<Integer> list){

        int originalSize= list.size();
        list.removeAll(Arrays.asList(0));
        int newSize=list.size();
        for (int i = 0; i <(originalSize-newSize); i++) {
            list.add(0);
        }
        return list;
    }


    public static List<Integer> moveAllZeroAddEnd2(List<Integer> list){     // 2. yol

        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(0)){
                list1.add(list.get(i));
            }
        }
        for (int i = 0; i <=list.size()-list1.size(); i++) {
            list1.add(0);
        }
    return list1;
    }

    //interview sorusu
    // Lİst içerisinde Mehmet olan tüm isimleri silin

        public static List<String> removeNameListMethod(List<String> list, String data){   //4. yol

        Iterator<String> iter= list.iterator();
        while (iter.hasNext()){

            if (iter.next().equalsIgnoreCase(data)){
                iter.remove();
            }
        }
    return list;
    }


    // ode1
//interview sorusu   List<String>
//list içerisindeki polindrom/tersten ve düzden okunuşları aynı olan) kelimeleri list içerisinden silen metodu yazınız
// ey, edip, adanada, pide, ye   çıktı =  ey, edip, pide, ye





    // odev-2
    // list içerisindeki polindrom kelimeler varsa list içerisinden her iki kelimeyi silen metodu yazınız
    // ey, edip, adanada, pide, ye         çıktı = boş



}






