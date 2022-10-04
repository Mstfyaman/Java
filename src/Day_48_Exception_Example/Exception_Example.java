package Day_48_Exception_Example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exception_Example {

    public static void main(String[] args) {

    int[] array={1,5,4,7,8,9,2,15,48,5,1,2};
        System.out.println("max number: " + maxIndexNumberForArray(array));
        System.out.println("index: " + maxIndexNumberForArray(array));


        // array içerinde en büyük sayının index numarasını getiren metodu yazınız
        // en büyük sayıdan iki veya dha fazla var ise bir exception throw edin

        System.out.println(MaxNumberArray(array));


    }

    public static int MaxNumberArray(int[] arr){
        int max=arr[0];  // burdaki arrayin içine 3-4-5 vs. atayabilirdik ancak atanan sayıdan az bir array olursa hata verir.
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
            return  max;
    }


    public static int maxIndexNumberForArray(int[] arr){

        int index=0;
    int maxNumber=MaxNumberArray(arr);
    for (int i=0; i<arr.length; i++){
        if (arr[i]==maxNumber){
            index= i;
        }
    }
    return index;
    }







}
