package Day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        int array[]={1,2,3,4,5,6,7,8,9};
        Integer array1[]={1,2,3,4,5,6,7,8,9};
        Integer arr[]={1,2,3,4};
        List<Integer>list=new ArrayList<>(Arrays.asList(array1));
      //  System.out.println(removeListMethod(list,5));  // 5 leri siler
       // System.out.println(removeListMethod(list,4)); // 4 leri siler
       // System.out.println(removeListMethod2(list,5)); // 5 leri siler
       // System.out.println(removeListMethod2(list,4)); // 4 leri siler
       // System.out.println(removeListMethod3(list,4)); // 4 leri siler
      //  System.out.println(removeListMethod3(list,5)); // 5 leri siler
        System.out.println(removeListMethod4(list,5)); // 5 leri siler
        System.out.println(removeListMethod4(list,4)); // 4 leri siler
        System.out.println(removeListMethod4(list,3)); // 3 leri siler
        System.out.println(removeListMethod4(list,2)); // 2 leri siler

//        System.out.println(addListMethot(array));
//        List<Integer> list2=new ArrayList<>(addListMethot(array));  // buda alttaki addListMethot' un diger yolu
//        System.out.println(list2.get(0));
//        System.out.println(addListMethod2(arr));





    }

    // bir arrayi list'in içerisine alan ve list return eden bir metot yazınız.
    public static List<Integer> addListMethot(int[] arr){

        List<Integer> list= new ArrayList<>();  // polymorphism yaptık. listten obje oluşturamayız.
        for (int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        return list;
    }

  public static List<Integer>  addListMethod2(Integer[] arr){   //üstteki sorunun farklı çözüm yolu foreach kullanmadan.
        List<Integer> list=new ArrayList<>();
        list=Arrays.asList(arr);
        return list;
  }




    // içerisine bir list ve data kabul eden ve bu datayı tüm listeden silen sonucunda bir integer list
    //  döndüren metodu yazınız.

    public static List<Integer> removeListMethod(List<Integer> list,Integer data){    // 1. yol
        List<Integer> list2= new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if (!list.get(i).equals(data)){
                list2.add(list.get(i));
            }
        }
        return list2;
    }


    public static List<Integer> removeListMethod2(List<Integer> list,Integer data){   // 2.yol

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).equals(data)){
                list.remove(list.get(i));
            }
        }
        return list;
    }

    public static boolean removeListMethod3(List<Integer> list,Integer data){   // 3.yol

        return list.removeAll(Arrays.asList(new Integer[]{data}));
    }


    public static List<Integer> removeListMethod4(List<Integer> list, Integer data){   //4. yol
        Iterator<Integer> iter= list.iterator();
        while (iter.hasNext()){
            if (iter.next().equals(data)){
                iter.remove();
            }
        }
        return list;
    }







    }

