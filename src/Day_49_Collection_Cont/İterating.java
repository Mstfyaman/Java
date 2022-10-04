package Day_49_Collection_Cont;

import java.util.*;

public class İterating {   // iteration anlamı tekrarlama

    public static void main(String[] args) {

        Collection<Integer> cll =new ArrayList<>(Arrays.asList(3,5,7,10,20));  // arrayin içini doldurduk.
        System.out.println("cll = " + cll);

//        for (Integer each : cll){  //foreach methodu bu
//            System.out.println(each);
//            if (each>5){
//                cll.remove(each);   //fereach indexleri gezerek değişiklik yapmamıza izin vermez
//
//            }  we can not use remove update
//        }

//------------------------------------------------------------

        Iterator<Integer> myIter= cll.iterator();

//        //next
        
//        System.out.println("myIter.next() = " + myIter.next());  // sıradaki indexi gösterir  0. den başlıyor heralde
//
//        //remove
//        myIter.remove();   // [5, 7, 10, 20]   1.indexteki 3 ü attı
//        myIter.remove();  // burası hata verir. removeden önce next yapıp sonraki methodu göstermek gerekir.
//        System.out.println("myIter.next() = " + myIter.next());  // burda sonraki methodu gösterdik
//        myIter.remove(); // burda gösterilen methodu sildi.
//        System.out.println("cll = " + cll);


        //-----------------------------------------
        //   cll = [3, 5, 7, 10, 20]
        System.out.println("myIter.hasNext() = " + myIter.hasNext());   // sırada indexte eleman var mı?  ( var =3 )

//        while (myIter.hasNext()){
//            Integer next = myIter.next();
//            System.out.println("next = " + next);
//            if (next>5){   // 5 ten büyük olanları atıyoruz if döngüsüyle
//                myIter.remove();
//            }
//        }
//        System.out.println("cll = " + cll);
//        System.out.println("myIter.hasNext() = " + myIter.hasNext());







    }
}
