package Assignments.mixed;

import java.util.Arrays;
import java.util.Scanner;

public class BosClass {
    public static void main(String[] args) {


        // stringdeki kelimelerden baş harfi a ve A olanı yazdır.

//        String str="Merhaba dostum bugün aksam nasılsın bakalım";
//        String[] newStr= str.split(" ");
//        if(newStr[0].substring(0,1).contains("a") || newStr[0].substring(0,1).contains("A")){
//            System.out.println(newStr[0]);
//        } else if(newStr[1].substring(0,1).contains("a") || newStr[1].substring(0,1).contains("A")){
//            System.out.println(newStr[1]);
//        } else if (newStr[2].substring(0,1).contains("a") || newStr[2].substring(0,1).contains("A")){
//            System.out.println(newStr[2]);
//        } else if (newStr[3].substring(0,1).contains("a") || newStr[3].substring(0,1).contains("A")){
//            System.out.println(newStr[3]);
//        } else if( newStr[4].substring(0,1).contains("a") || newStr[4].substring(0,1).contains("A")){
//            System.out.println(newStr[4]);
//        } else if(newStr[5].substring(0,1).contains("a") || newStr[5].substring(0,1).contains("A")){
//            System.out.println(newStr[5]);
//        }



// replit firsAndLastWith

//        Scanner scan = new Scanner(System.in);
//        String word = scan.nextLine();
//        int n = scan.nextInt();
//        int a=0;
//        String str="";
//        String str2="";
//        String str3="";
//
//        if (n==word.length()){
//            str=word.substring(0,n);
//            str2=word.substring(word.length()-n);
//            str3= str.concat(str2);
//            System.out.println(str3);
//        }else if (n>word.length()){
//            a=word.length();
//            str=word.substring(0,a);
//            str2=word.substring(word.length()-a);
//            str3= str.concat(str2);
//
//        }

        //-----------------------------------------------

//        Scanner sc = new Scanner(System.in); //buna dokunmayın
//
//        int hour;
//        int minute;
//        int second;
//        String amOrPm;
//
//        hour= sc.nextInt();
//        minute= sc.nextInt();
//        second= sc.nextInt();
//        amOrPm= sc.nextLine();
//
//
//        System.out.println(hour+":"+minute+":"+second+" "+amOrPm);

//---------------------------------------------------------------------



//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//
//        int[] Array =new int[size];
//        for(int i=0; i<size; i++){
//            Array[i]=sc.nextInt();
//
//        }
//
//        if (size==1){
//            int[] newArray =new int[1];
//            newArray[0]=Array[0];
//            System.out.println(Arrays.toString(newArray));
//        }else {
//            int[] newArray =new int[2];
//            newArray[0]=Array[0];
//            newArray[1]=Array[Array.length-1];
//            System.out.println(Arrays.toString(newArray));
//        }

//_____________________________________________________________________



        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for(int i =0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        if (size==1){
            int[] newArray =new int[1];
            newArray[0]=array[0];
            System.out.println(Arrays.toString(newArray));
        } else if (size==2){
            int[] newArray =new int[1];
            newArray[0]=array[0]+array[1];
            System.out.println(Arrays.toString(newArray));

        } else if (size >= 3) {
                for (int i=2; i<size; i++){
                    int[] newArray =new int[size-1];
                    newArray[0]=array[0]+array[1];
                    newArray[i-1]=array[i];
                   // System.out.println(Arrays.toString(newArray));
                }
        }






    }
}
