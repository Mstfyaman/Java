package Day_27_Array_Lab_Cont;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Array_Example_2 {
    public static void main(String[] args) {

        int sayi1[]={13,15,14,22,85,77};
        int sayi2[]={13,14,15,22,85,77};
        int sayi3[]={1,2,2,8,9,15};
        int sayi4[]={1,2,3,2};
        int sayi5[]={5,7,1,9};
        int sayi6[]={6,5,8,6,8,5,8};
        String alinti1="araba ile yola çıktık fakat araba arıza yaptı ";
        String alinti="Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek\n" +
                "    //dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp\n" +
                "    //sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının\n" +
                "    //üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu";

        //System.out.println(enBüyükİkinciSayi(sayi1));
        //System.out.println(ardArdaUc(sayi2));
        //System.out.println(Arrays.toString(yalnizSayilar(sayi3)));
        //System.out.println(enCokSayi(sayi4));
        //System.out.println(dublicateControl(sayi3));
        // System.out.println(filVeFare(alinti,"o"));
        //System.out.println(verileKelime(alinti1));
        //System.out.println(Arrays.toString(enKucukSayiVeSifirAta(sayi5)));
        System.out.println(Arrays.toString(degerAtamaKontrol(sayi6,5,8,1)));






    }

    //13 // Array içerisindeki en büyük 2. sayıyı bulun.
    //(Array.sort kullanılmayacak

    public static int enBüyükİkinciSayi(int[] arr){
        int a=arr[0];
        int b=arr[0];
        for (int sayi: arr) {
            if (sayi>a) a=sayi;
        }
        for (int sayi:arr) {
            if (sayi>b && sayi!=a)
                b=sayi;
        }
      return b;
    }

    //14
    // Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.
    //[2,3,3,4,5,6,5,6,3] → true    [1,2,3] → true

    public static boolean ardArdaUc(int[] arr ){

        if (arr.length<3){return false;}
        for (int i=0; i<arr.length-2; i++){
            if (arr[i]==arr[i+1]-1 && arr[i]==arr[i+2]-2){
                return true;
            }
        }
        return false;
    }

    //15 //Array’in içerindeki eşi olmayan yalnız sayıları bulan ve bunları ekrana yazdıran metodu
    //yazınız. (sağında veya solunda aynı sayı yoksa yalnızdır.)

    public static String[] yalnizSayilar(int[] arr){

        String yalnizSayilar="";
        if (arr.length==1){
            yalnizSayilar+=arr[0]+" ";
            return yalnizSayilar.split(" ");
        }
        if (arr[0]!=arr[1]) yalnizSayilar+=arr[0]+" ";

        for (int i=1; i<arr.length-1; i++){
            if (arr[i]!=arr[i-1]&&arr[i]!=arr[i+1])
                yalnizSayilar+=arr[i]+" ";
        }
        if (arr[arr.length-1]!=arr[arr.length-2])
            yalnizSayilar+=arr[arr.length-1]+" ";
        return yalnizSayilar.split(" ");
    }

    //16  // Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız. (eşitlik durumda herhangi
    //birini alabilir,1 den fazla bulunmuyorsa -1 döndürecek)

    public static int enCokSayi(int[] arr){
        int enCok=arr[0];
        int count=0;
        int adet=0;

        for (int i=0; i<arr.length; i++){
            count=0;

            for (int j=0; j<arr.length; i++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>adet){
                enCok=arr[i];
                adet=count;
            }
        }
        return enCok;
    }

    //17 //Array’in içerindeki dublicate sayı varsa true yoksa false döndüren metodu yazınız.
            //[1,2,8,1] true         [25,89,78,98] false

    public static boolean dublicateControl(int[] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if (i!=j && arr[i]==arr[j]){
                    return true;
                }
            }
        }
return false;
    }

    //18 //Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek
    //dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp
    //sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının
    //üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.» kelimesinde kaç adet o
    //harfi vardır. (Büyük ve küçük ihmal edilecek)

    public static int filVeFare(String str, String harf){

        str=str.toLowerCase();
        String[] arr=str.split("");
        int count=0;
        for (String harf_1:arr){
            if (harf_1.equals(harf)){
                count++;
            }
        }
        return count;
    }

    //19 //Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu
    //yazınız.

    public static boolean verileKelime(String str){

        String[] strArray=str.toLowerCase().split(" ");

        for (int i=0; i<strArray.length; i++){
            for (int j=0; j<strArray.length; j++){
                if (i!=j && strArray[i].equals(strArray[j])){
                    return true;
                }
            }
        }
        return false;
    }

    //20 //Array’in içerisindeki en küçük sayıyı bulan ve array in ilk indeksine bu sayıyı atayan diğer
    //indekslere 0 atayan metodu yazınız.   [5,7,1,9] [1,0,0,0]

    public static int[] enKucukSayiVeSifirAta(int[] arr){
        int enKucukSayi=arr[0];
        for (int sayi:arr){
            if (sayi<enKucukSayi){

            }
        }
        int[] yeniArray=new int[arr.length];
        arr[0]=enKucukSayi;
        for (int i=1; i<yeniArray.length; i++){
            yeniArray[i]=0;
        }
        return yeniArray;
    }

    //21 //Array’in içerisindeki sayılardan 5 den sonra 8 geliyorsa 8 yerine 1 atayan metodu yazınız
            //[6,5,8,6,8,5,8] →[6,5,1,6,8,5,1]

    public static int[] degerAtamaKontrol(int[] arr, int ilkDeger, int kontrolDegeri, int atanacakSayi){

        int[] yeniArray=new int[arr.length];
        yeniArray[0]=arr[0];

        for (int i=0; i<yeniArray.length-1; i++){
            if (arr[i]==ilkDeger && arr[i+1]==kontrolDegeri){
                yeniArray[i+1]=atanacakSayi;
            }
            else {
                yeniArray[i+1]=arr[i+1];
            }
        }
        return yeniArray;
    }


//-----------------------------









}
