package Day_24_Arrays_2;

import java.util.Arrays;


public class Task {
    public static void main(String[] args) {



        int[] iArr2= {1,23,46,77,99};
        int[] iArr ={1,2,3,4,5,6,7};
        //System.out.println(Arrays.toString(reverseArry(iArr2)));
        //System.out.println(sumOfOdd(iArr));
        //String str2="kayisi, armut, üzüm, cilek, nar";
        //System.out.println(Arrays.toString(stringsToArray2(str2)));
        //String str3= "elma, armut, üzüm, çilek, nar";
       // System.out.println(Arrays.toString(stringsToArray3(str3)));
        //String str4= "merhaba java insanları bugün nasılsınız";
        //System.out.println(Arrays.toString(stringToArray4(str4)));
        //System.out.println(Arrays.toString(parametre(10)));
       // System.out.println(enBuyukEnKucuk(iArr));
        //System.out.println(Arrays.toString(diziDoldurma(iArr2)));
        System.out.println(Arrays.toString(diziDoldurma2(iArr2)));


    }

    //7 //İnt arry in en büyük elemanının döndüren bir method yazın


    //8 //Bir array oluşturun ve ilk ve son element leri swap(yer değiştirme) yapın


    //9 //Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.

    public static int[] reverseArry(int[] arr){

        int[] ints=new  int[arr.length];
        for (int i=0; i<arr.length; i++){
            ints[i]=arr[(arr.length-1)-i];               // bu çok önemli bir soru
        }
        return ints;
    }

    //10 //Bir methodla verilen array ın teksayı indexinde bulunan elemanların toplamını alın.

    public static int sumOfOdd(int[] arr){

        int sum =0;
        for (int i=1; i<arr.length; i+=2){
            sum+= arr[i];

        }
            return sum;
    }

    //---------------------------yeni sorular-------------

    //1 //«merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
    //element olacak şekilde bir array a dönüştüren bir method yazın.



    //2 //«kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
    //element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
    //varsa onun yerine çilek atayın.

    public static String[] stringsToArray2(String str) {

        String[] split = str.split(", ");

        for (int i = 0; i < split.length; i++) {
            if (split[i].length() <5) {
                split[i]="cilek";
        }

    }
        return split;
    }

//3 //«elma, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
//element olacak şekilde bir array a atın. İlk ve son idexi swaping yapın.

    public static String[] stringsToArray3(String str) {

        String[] split= str.split(", ");
        String temp = split[0];
        split[0]=split[split.length-1];
        split[split.length-1]=temp;
        return split;
    }

    //4 //«merhaba java insanları bugün nasılsınız» gibi bir cümlenin ikinci kelimesinin
    //harflerinden bir döndüren method yazın

    public static String[] stringToArray4(String str){

        String[] opitipiti= str.split(" ");
        return opitipiti[1].split("");

    }


    //5 //Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
    //biçimde bir array içine yerleştirsin. n = 5 Exm: [0,1,2,3,4]

    public static int[] parametre(int n){

        int[] num=new int[n];
        for (int i=0; i<n; i++){
            num[i]=i;
        }
        return num;
    }

    //6 //Karmaşık sayı dizisinin en büyük ve en küçük element lerinin aritmetik ortalamasını
    //veren bir method yazın

    public static int enBuyukEnKucuk(int[] sayiDizisi){
        Arrays.sort(sayiDizisi);
        return (sayiDizisi[0]+sayiDizisi[sayiDizisi.length-1]/2);
    }

    //7 //Bir sayı dizisinin en küçük elemanı ne ise sayı dizisini onunla dolduran bir
    //method yazın.

    public static int[] diziDoldurma(int[] arr){

        Arrays.sort(arr);
        Arrays.fill(arr,arr[0]);

        return arr;
    }

//8 //Bir sayı dizisinin en küçük elemanı ne ise sayı dizisini (en büyük değer hariç)
//onunla dolduran bir method yazın.

    public static int[] diziDoldurma2(int[] arr){

        Arrays.sort(arr);
        Arrays.fill(arr,0,arr.length-1,arr[0]);

        return arr;
    }














}







