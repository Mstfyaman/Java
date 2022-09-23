package Day_23_Arrays;

import java.util.*;

public class ArraysExample {
    public static void main(String[] args) {

//        int [] i=new int[5];
//        i[0]=2;
//        i[1]=4;
//        i[2]=6;
//        i[3]=8;
//        i[4]=10;
//        System.out.println(i[0]);
//        System.out.println(i[1]);
//        System.out.println(i[2]);
//        System.out.println(i[3]);
//        System.out.println(i[4]);

        //for (int k = 0; k < i.length; k++) {
          //  System.out.println(i[k]);
            
        //}

//        for (int k = 0; k < i.length; k++) {
//          System.out.println(i[k]*i[k]);
//
//        }

//-----------------------------------------------

//        String[] gunler=new String[7];
//        gunler[0]="Pazartesi";
//        gunler[1]="Sali";
//        gunler[2]="Carsamba";
//        gunler[3]="Persembe";
//        gunler[4]="Cuma";
//        gunler[5]="Cumartesi";
//        gunler[6]="Pazar";
        //System.out.println("Bugun gunlerden "+gunler[2]);


        // haftanın üçüncü gününün çarşamba olup olmadığını kntol edin.
// çarşamba ise buügn günlerden çarşambadır yazın.eger değilse
// bugün günlerden çarşamba değildir yazın
//        if (gunler[2].equals("Carsamba")){
//            System.out.println(" Bugun gunlerden "+gunler[2]);
//        }
//        else {
//            System.out.println(" Bugun gunlerden Carsamba degildir");
//        }



        // haftanın günleri içerisinde cuma varmısıdr?
        // varsa true yoksa false

//        for (int i = 0; i < gunler.length; i++) {
//            if (gunler[i].equalsIgnoreCase("Cuma")){
//                System.out.println(true);
//                break;
//            }else {
//               // if (i==6)
//                System.out.println(false);
//            }
//
//        }

        //---------------------ARRAY YAZIM TÜRLERİ-----------------------------------

//        int[] array=new int[5];    // 1. tür
//        int array2[]=new int[5];   // 2. tür
//
//        int[]  array3;             // 3. tür
//        array3=new  int[5];
//
//        int[] array4= {1,2,3,4,5,6,7,8};   // 4. tür
//                    // 0 1 2 3 4 ...


        //String str[]={"pazartesi","sali","carsamba","persembe","cuma","cumartesi","pazar"};

//-----------------------------------------------

        //5 boyutlu bir array oluşturun ve içerisine 5 adet isim atayın içerinde kendi isminizin olup
        //olmadığını kontrol edin. Var ise isminiz grup içerisinde vardır yazdırsın yok ise isminiz
        //grup içerinde yoktur yazdırsın


//        String str[]={"Hayrettin","Neyettin","Gayrettin","Seyrettin","Yaman"};
//
//
//        for (int i = 0; i < str.length; i++) {
//            if (str[i].equalsIgnoreCase("yaman")){
//                System.out.println(" isminiz grup icerisinde vardir");
//                break;
//            }else {
//                if (i==5)                                     // 1. cozum
//                System.out.println(false);
//            }
//
//
//            String isim=" yaman ";
//            int count=0;
//            for (int j = 0; j < str.length; j++) {
//                if (str[j].equalsIgnoreCase(isim)){
//                    count++;                                      //2. cozum
//                }
//            }
//if (count>0){
//    System.out.println(" isminiz grup iceresinde vardir");
//}else  {
//    System.out.println("isminiz grup iceresinde yoktur");
//}

//----------------------------------------------

        //20 boyutunda bir dizi oluşturun ve her bir index’ine random 0 ile 100 arasın bir değer
        //atayın. Sonrasında 17 index numarasındaki veriyi ekrana yazdırın


//        int[] sayi=new int[20];
//        Random ramdom=new Random();
//
//        for (int i = 0; i < 20; i++) {
//            sayi[i]=ramdom.nextInt(100);
//            System.out.println((i)+" sayi :"+sayi[i]);
//        }
//        System.out.println("17. indexteki sayimiz "+sayi[17]);
//
//
//        // içerideki çift/tek sayilar kac adettir
//
//        int tek=0;
//        int cift=0;
//        for (int i=0; i<sayi.length; i++){
//            if (sayi[i]%2==0){
//                cift++;
//            }
//            else {
//                tek++;
//            }
//        }
//        System.out.println(" Tek sayilar "+tek);
//        System.out.println(" Cift sayilar "+cift);

//---------------------------------------------------------------








    }
}

