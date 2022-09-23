package Day_26_Arrays_Lab;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample_1 {
    public static void main(String[] args) {

        int[] sayi=new int[5];
        int sayi2[]={1,2,3,4,5,6,78,44,33};
        int sayi3[]={33,2,22,4,55,43,78,44,33};
        int[] ilkArray={5,4,3,2,1,};
        int[] ikinciArray={1,2,3,4,5,6,7,8,9};

        //System.out.println(tümününToplamı(sayi2));
        //System.out.println(ciftSayilar(sayi2));
       // System.out.println(enBuyukEnKucuk(sayi2));
        //System.out.println(enKucuguİndekslereAtama(sayi2));
        //System.out.println(Arrays.toString(araArray(5, 11)));
       // System.out.println(Arrays.toString(work5(ikinciArray)));
        //System.out.println(Arrays.toString(arrayBirlestir(sayi2, sayi3)));
        //System.out.println(arrayControl(ilkArray, ikinciArray));
        //System.out.println(Arrays.toString(tersArray(ikinciArray)));
        //System.out.println(Arrays.toString(rasgeleOn(15)));
        //System.out.println(Arrays.toString(rasgeleArrayUretElliSeksen(500)));
        //System.out.println(UretYuzyirmiControl(5000));


    }

    //1 // Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız..
    public static int tümününToplamı(int[] arr){
        int plus=0;
        for (int i=0; i<arr.length; i++){
            plus+=arr[i];

        }
        return plus;
    }

    //2 //Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.

    public static int ciftSayilar(int[] arr){

        int cift=0;
        for (int sayi:arr){
            if (sayi%2==0){
                cift+=sayi;
            }
        }
        return cift;
    }

    //3 //Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.

    public static int ucSayisiToplami(int[] arr){

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (i==3){
                //count+=arr;                         // bu kodu tekrar yap
            }
        }
        return count;
    }

    //4 //Array’in içerisindeki en büyük ve en küçük sayılar arasındaki farkı bulan metodu yazınız. (Arrays.sort
    //kullanılmayacak  //Arrays.sort kullanılmayacak

    public static int enBuyukEnKucuk(int[] arr){

    int result[]=new int[arr.length];
    int max=arr[0];
    int min=arr[0];

        for (int sayi:arr) {
            if (sayi>max){
                max=sayi;
            } else if (sayi<min) {
                min=sayi;
            }
        }return max-min;
    }

    //5 //Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.(Arrays.sort ve
    //Arrays.fill kullanılmayacak

    public static int[] work5(int[] sayi2) {

        int[] arry = new int[sayi2.length];

        for (int i = 0; i < sayi2.length; i++) {
            arry[i] = sayi2[i];
        }
        Arrays.sort(arry);
        int min = arry[0];
        for (int i = 0; i < sayi2.length; i++) {
            arry[i] = min;
        }
        return arry;
    }

    public static void arrayYazdir(String[] arr){         //diger yol
        for (String str:arr) {
            System.out.print(str+" ");
        }
    }

    public static void arrayYazdir(char[] arr){             //diger yol
        for (char ch:arr) {
            System.out.print(ch+" ");
        }
    }


    //6 //2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.

    public static int[] araArray(int a, int b){

        int max= Math.max(a,b);

        if (max==a){
            int[] yeniArray=new int[(a-b+1)];
            for (int i=0; i<yeniArray.length; i++){
                yeniArray[i]=b+i;
            }
            return yeniArray;
        }
        else {
            int[] yeniArray=new int[(b-a+1)];
            for (int i=0; i<yeniArray.length; i++){
                yeniArray[i]=a+i;
            }
            return yeniArray;
        }
        }

    //7 // 2 adet array kabul eden ve sonucunda bu 2 array’in verileri ile birlikte tek bir array
    //oluşturan metodu yazınız

    public static int[] arrayBirlestir(int[] a, int[] b){
        int[] result=new  int[a.length+b.length];

        for (int i=0,j=0; i<result.length; i++){
            if (i<a.length){
                result[i]=a[i];
            }
          if ( i>a.length-1){
              result[i]=b[j];
              j++;
          }

        }
        return result;
    }

    //8 //2 array kabul eden, ilk array in içerindeki tüm sayılar ikinci arrayin içinde yer alıyorsa true
    //yer almıyorsa false yazdıran metodu yazınız

    public static boolean arrayControl(int[] a,int[] b){

       firsloop: for (int i=0; i < a.length; i++){
       secontloop: for (int j = 0; j < b.length; j++) {
                if (a[i]==b[j]){
                   continue firsloop;
                }
                continue secontloop;
            }
            return false;
        }
          return true;
    }

    //9 //Array’in içerisindeki sayıları ters çevirerek yeni bir array oluşturan metodu yazınız

    public static int[] tersArray(int[] arr){
        int[] yeniArray=new int[arr.length];
        for (int i=yeniArray.length-1, j=0;    j<yeniArray.length; i--, j++){
            yeniArray[j]=arr[i];
        }
        return yeniArray;
    }

    //10 //Boyutu 10 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 0-100 arasında
    //rasgele sayılar atayın ve ekrana bu verileri yazdıran metodu yazınız

    public static int[] rasgeleOn(int boyut){
        Random random=new Random();
        int[] yeniArray=new int[boyut];
        for (int i=0; i<boyut; i++){
            yeniArray[i]=random.nextInt(100);
        }
        return yeniArray;
    }

    //11 // Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 50-80
    //arasında rasgele sayılar atayın.

    public static int[] rasgeleArrayUretElliSeksen(int boyut){
        Random random=new Random();
        int[] yeniArray=new int[boyut];
        for (int i=0; i<boyut; i++){
            yeniArray[i]=random.nextInt(30)+50;   // random sınıfı ara sayı koyma !!!!!!
        }
        return yeniArray;
    }

    //12 // Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
    //arasında rasgele sayılar atayın. Oluşturduğunuz Array in içerinde kaç adet 125 sayısı vardır?

    public static int uretYuzyirmiControl(int boyut){
        Random random=new Random();
        int[] yeniArray=new int[boyut];
        int count=0;
        for (int i=0; i<boyut; i++){
            yeniArray[i]=random.nextInt(20)+120;
            if (yeniArray[i]==125){
                count++;
            }
        }
        return count;
    }












}
