package Day_47_Exception_Cont;

import Day_45_OOP_ReviewCont2._interface.A;

import java.util.Arrays;
import java.util.Scanner;

public class ExampleTryCatch {
    public static void main(String[] args) {

        // integer değişken kabul eden bir method yazın, kullanıcan tek bir giriş sağlayın
        // kullanıcı integer dışında bir değer girerse hata mesajı "lütfen tekrar dene" verin
        // kullanıcı doğru girişi yapana kadar kullanıcıdan veri almaya devam edin



//        boolean devam=true;
//
//        while (devam){
//            try {
//                Scanner scan=new Scanner(System.in);
//                System.out.println("sayi");
//                int x=scan.nextInt();
//
//            }catch (Exception e){
//                System.out.println(" lutfen tekrar deneyiniz");
//                continue;
//            }
//            devam=false;
//        }



        // kullanıcıdan 2 sayı alın 1. sayıyı 2. sayıya bölün kalanı(mod) ekrana yazdırın
        //2 adet catch bloğu kullanın



//        int x=45;
//        int y=0;
//
//        try {
//            if (y==0){
//                System.out.println("lutfen 0 haricinde bir deger giriniz");
//            }
//            int z= x%y;
//            System.out.println("x'in y'ye bolumunden kalan =" + z);
//
//        }catch (ArithmeticException e){
//            System.out.println("ArrayİndexOutOfBoundsException excption yakalandi");
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println("Exception yakalandi");
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("finally blogu calisti");
//        }


        // personel islerini tutan bir array tanımlayın ve içerisine 5 adet integer türünde id gönderin (arr[]={})
        // bu id lerini içerisinde 0 var ise illageArgumentException hatası döndürün
        // bunu bir checkArrayId methodunun içinde yazın


//        int arr[]={111,125,126,0};
//        try {
//            System.out.println(checkArrayId(arr));
//        }catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//            System.out.println("Uygun olmayan personel ID tespit edildi");
//        }
//        System.out.println("programa devam edildiliyor");
//


        // array içerinde en büyük sayının index numarasını getiren metodu yazınız
        // en büyük sayıdan iki veya dha fazla var ise bir exception throw edin



        int arr[]={100,120,500,500};
        try {
            System.out.println(enBuyuk(arr));

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("En buyuk Sayidan 2 adet vardir");
        }
        System.out.println("programa devam ediliyor");





   }

//    public static boolean checkArrayId(int[] arr){
//
//
//        for (int i=0; i<arr.length; i++){
//            if (arr[i]==0){
//                throw new IllegalArgumentException ("Personel Id 0 olamaz");
//            }
//
//        }
//        return true;
//    }


    public static int enBuyuk(int[] array) throws Exception {      // yandaki throw exception a dikkat

        int[] arr=array;
        int indexNumber=0;

        Arrays.sort(arr);
        int x=arr[arr.length-1];
        if (arr[arr.length-2]==x){
                throw new Exception("en büyük sayıdan 2 adet vardır");
        }
        for (int i=0; i<arr.length; i++){
            if (array[i]==x){
                indexNumber=1;
            }

        }
        return indexNumber;
    }













}
