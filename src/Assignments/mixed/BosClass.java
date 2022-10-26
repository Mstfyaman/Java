package Assignments.mixed;

import java.util.Arrays;
import java.util.Scanner;

public class BosClass {
    public static void main(String[] args) {

       // System.out.println(uzunKelime());
        // System.out.println(sesliHarf());

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



//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int[] array = new int[size];
//        for(int i =0; i < size; i++) {
//            array[i] = scan.nextInt();
//        }
//
//        if (size==1){
//            int[] newArray =new int[1];
//            newArray[0]=array[0];
//            System.out.println(Arrays.toString(newArray));
//        } else if (size==2){
//            int[] newArray =new int[1];
//            newArray[0]=array[0]+array[1];
//            System.out.println(Arrays.toString(newArray));
//
//        } else if (size >= 3) {
//                for (int i=2; i<size; i++){
//                    int[] newArray =new int[size-1];
//                    newArray[0]=array[0]+array[1];
//                    newArray[i-1]=array[i];
//                   // System.out.println(Arrays.toString(newArray));
//                }
//        }

//--------------------------------------------------------------------

//        Scanner scan = new Scanner(System.in);
//        String word = scan.nextLine();
//        int n = scan.nextInt();
//        int a=0;
//
//        //kod buraya
//        String str="";
//        String str2="";
//        String str3="";
//        if (n<=word.length()){
//            str=word.substring(0,n);
//            str2=word.substring(word.length()-n);
//            str3= str.concat(str2);
//            System.out.println(str3);
//        }else if (n>word.length()) {
//            str=word.substring(0,word.length());
//            str2=word.substring(word.length()-word.length());
//            str3= str.concat(str2);
//            System.out.println(str3);
//
////        }else if(word.length()==1){
////            for (int i = 0; i == n; i++){
////                System.out.print(word);
////            }
//
//        }

 //---------------------------------------------------------------------


//String str= "aabccccseeeeeefffcc";  // aabccccseeeeeefff
//String result="";
//String control;
//
//       while (!str.isEmpty()){
//           control=str.substring(0,1);
//           str=str.replaceFirst(control,"");
//
//           if (str!="") {
//               if (str.substring(0, 1).equals(control)) {
//                   result += control;
//                   str = str.replaceAll(control, "");
//               } else {
//                   str = str.replaceAll(control, "");
//               }
//           }
//           }
//          if (result==""){
//              System.out.println("benzer harf olan bir kelime degildir");
//          }else {
//              System.out.println(result);
//          }

 //---------------------------------------------------------------------


//        Scanner sc=new Scanner(System.in);
//
//
//        double fiyat1;
//        double fiyat2;
//        double fiyat3;
//        double toplamFiyat;
//        sc.nextLine();
//        String kitap1;
//        String kitap2;
//        String kitap3;
//
//        System.out.println("kitap1 in ismini ve fiyatını girin.");
//        kitap1=sc.nextLine();
//        sc.nextLine();
//        fiyat1=sc.nextDouble();
//
//        System.out.println("kitap2 in ismini ve fiyatını girin.");
//        kitap2=sc.nextLine();
//        sc.nextLine();
//        fiyat2=sc.nextDouble();
//
//        System.out.println("kitap3 in ismini ve fiyatını girin.");
//        kitap3=sc.nextLine();
//        sc.nextLine();
//        fiyat3=sc.nextDouble();
//
//        System.out.println("Kitap1 fiyat:"+fiyat1+", Kitamp2 fiyatı"+fiyat2+", Kitap3 fiyatı:"+fiyat3);
//
//        toplamFiyat=fiyat1+fiyat2+fiyat3;
//        System.out.println("Toplam Fiyat:"+toplamFiyat);


        //-------------------------------------------------------------------





















   //--------------------------------------------------------------------


 // Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise
        //true değil ise false döndüren metot yazınız.
        //Kabak true
        //Nalan true
        //Ara true
        //talat true
        //Kasaba false
        //ahmet false


       // System.out.println(terstenKelime("aa"));
      //  System.out.println(benzersizHarf("karkas rotasi"));


    }

//    public static boolean terstenKelime(String str){
//     //    kalem   efe  aba
//String reverseStr="";
//        str=str.toLowerCase();
//        for (int i = str.length()-1; i>=0; i--) {
//            reverseStr+=str.charAt(i);
//        }
//        if (str.equals(reverseStr)){
//            return true;
//        }
//
//        return false;
//    }


//------------------------------------------------------------------

// Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
//küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
//ikazı versin.
//Merhaba M
//Araba r
//Karkas rotası o

//    public static String benzersizHarf(String str){   // araba
//      String result="";
//      String control;
//         str=str.toLowerCase();
//        str= str.replace(" ","");   // boşlğu atmak için 1. yol.
//
//     loop1:    while (!str.isEmpty()){
//
//             control=str.substring(0,1);
////             if (control.equals(" ")){    // boşluğu atmak için 2. yol.
////                 str=str.replace(" ", "");
////                 continue loop1;
////             }
//             str=str.replaceFirst(control,"");
//             if (str.contains(control)){
//                 str=str.replaceAll(control,"");
//             }else {
//                 result+=control;
//             }
//         }
//        if (result.equals("")){
//            return "benzersiz harf yoktur";
////        } else if (result.substring(0,1).equals(" ")) {  // boşluğu atmak için 3. yol
////            return result.substring(1,2);
//        }
//
//        return result.substring(0,1);
//    }


   //----------------------------------------

//public static String uzunKelime(){
//
//        String str ="Selenium provides support for the automation of web browsers.";
//
//       str= str.replace(".","");
//        String[] strArr=str.split(" ");
//
//        String result="";
//        int uzunluk=strArr[0].length();
//
//
//    for (int i = 1; i < strArr.length; i++) {
//        if (uzunluk< strArr[i].length()){
//            uzunluk=strArr[i].length();
//            result=strArr[i];
//        }
//    }
//
//     return result;
//}

    //---------------------------------------------------

//    public static String sesliHarf(){
//        String str ="hillolalalulü";
//
//        String holder= "";
//        for (int i =0; i <str.length() ; i++){       // kelime içerindeki sesli harfleri yazdırma
//            switch (str.charAt(i)){
//                case 'a','e','i','ü','o','ı','ö','u':
//                    holder+=str.charAt(i);
//            }
//        }
//
//        if (str.contains("a")){
//            str=str.replace("a",holder.substring(0,1));
//        }
//        if (str.contains("e")){
//            str=str.replace("e",holder.substring(0,1));
//        }
//        if (str.contains("ı")){
//            str=str.replace("ı",holder.substring(0,1));
//        }
//        if (str.contains("i")){
//            str=str.replace("i",holder.substring(0,1));
//        }
//        if (str.contains("o")){
//            str=str.replace("o",holder.substring(0,1));
//        }
//        if (str.contains("ö")){
//            str=str.replace("ö",holder.substring(0,1));
//        }
//        if (str.contains("u")){
//            str=str.replace("u",holder.substring(0,1));
//        }
//        if (str.contains("ü")){
//            str=str.replace("ü",holder.substring(0,1));
//        }
//
//
//        return str;
//    }


    //-------------------------------------------------------
















    }
