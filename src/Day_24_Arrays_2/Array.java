package Day_24_Arrays_2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {


//        int[] iArry = new int[5];
//
//        iArry[0]=10;
//        iArry[1]=20;
//        iArry[2]=30;
//        iArry[3]=40;
//        iArry[4]=50;
//
//        for (int i : iArry){
//            System.out.println(i);                           // 1. for örneği
//        }
//
//        for (int i=0; i<iArry.length; i++){                 // 2. for örneği
//            System.out.println(iArry[i]);
//        }
//
//
//        String[] sArry= new String[3];
//        sArry[0]="Muhammed";
//        sArry[1]="Alparslan";
//        sArry[2]="Beytullah";
//
//        System.out.println(sArry[0].length());
//
//
//        System.out.println(Arrays.toString(iArry));        // arrayın içindekiler topluca yazdırma
//        System.out.println(Arrays.toString(sArry));
//
//----------------------------ORNEKLER---------------------

        int[] iArr2= {1,23,46,77,99};
        int[] iArr ={1,2,3,4,5,6,7};
        // System.out.println(asdad(iArr));
        // System.out.println(besVarmi(iArr));
        //System.out.println(ikiArray(iArr));
        //System.out.println(Arrays.toString(arraydöndürme(iArr, iArr2)));
        //System.out.println(enBuyuk(iArr2));
        System.out.println(Arrays.toString(swapİlkVeSonEleman(iArr2)));
        //System.out.println(elamanlarınToplama(iArr));
        //System.out.println(Arrays.toString(birleşikİkiArray(iArr, iArr2)));


    }

    // 1 //Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün
    public static boolean asdad(int[] iArr){

        return iArr.length>5;
    }

    //2 // Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin

    public static boolean besVarmi(int [] iArr){

        int param =5;
        for (int i=0; i<iArr.length; i++){
            if (iArr[i]==param){
                return true;
            }
        }
        return false;
    }

    //3 //Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.

    public static boolean ikiArray(int[] iArr){

        int[] iArr2= {1,23,46,77,99};
        if (iArr[0]==iArr2[0]){
            return true;
        }
        return false;
    }

    //4 //2 array kabul eden bir method yazın ve arraylerin
        // llk elemanları ile yeni bir array döndürsün.

    public static int[] arraydöndürme(int iArr[],int iArr2[] ){

        int[] newArray =new int[2];
        newArray[0]=iArr[0];
        newArray[1]=iArr2[0];

        return newArray;
    }

    //5 //Int array in elemanlarının toplamını veren bir method yazın

    public static int elamanlarınToplama(int iArr[]){

        int toplam=0;
        for (int i=0; i<iArr.length; i++){
           toplam+=iArr[i];
        }
        return toplam;
    }

//6 //Verilen 2 arrayi birleştirip array döndüren bir method yazın.

    public static int[] birleşikİkiArray(int iArr[],int iArr2[]){

        int[] newArray =new int[iArr.length+iArr2.length];

        for (int i=0; i<newArray.length; i++){
            if (i<iArr.length){
                newArray[i]=iArr[i];
            }else {
                newArray[i]=iArr2[i-iArr.length];
            }
        }
        return newArray;
    }


    //7 //İnt arry in en büyük elemanının döndüren bir method yazın

    public static int enBuyuk(int[] arr){
        int max=0;
        for (int i=0; i<arr.length; i++ ){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }



    //8 //Bir array oluşturun ve ilk ve son element leri swap(yer değiştirme) yapın

    public static int[] swapİlkVeSonEleman(int[] arr){
        int temp= arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        return arr;
    }



    //9 //Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.

    public static int[] reverseArry(int[] arr){

        int[] ints=new  int[arr.length];
        for (int i=0; i<arr.length; i++){
            ints[i]=arr[(arr.length-1)-i];
        }
        return ints;
    }




}
