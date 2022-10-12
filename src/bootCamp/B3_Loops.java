package bootCamp;

import java.util.Scanner;

public class B3_Loops {
    public static void main(String[] args) {

        // For()

        // iteration number is fixed
        // trach( iz , yol) index

        //for (initialization; condion; increment(iterator)){}   kalıp böyle


        // While()

        // iteration is not fixed
        // do not track if index
        // while(condition){}   kalıp

        // Do While()

        // one time execute even condition is false
        // do{}  while{condition}  kalıp


        //  soru = stringin son kelimesini tersten yazdır.
        String message = "Welcome to bootcamp";
        String reverse = "";
        // 1- tersten döndüreyim
        // 2-ilk boşlukta kodum kesilmeli

        int i = message.length() - 1;

        for (i = i; i >= 0; i--) {
            if (message.charAt(i) == ' ')
                break;   //  charat(i)  eşitse boşluğa çık dedik. çünkü diğer kelimeye geçmesini istemiyoruz.
            if (message.charAt(i) != ' ') {
                reverse += message.charAt(i);
            }
        }
        //  System.out.println("reverse = " + reverse);


        //---- while ile yapılışı

        message = "Welcome to bootcamp";
        i = message.length() - 1;
        reverse = "";       // reversemizi boşaltmış olduk.

        while (message.charAt(i) != ' ') {
            reverse += message.charAt(i);
            i--;
        }
        //  System.out.println("reverse = " + reverse);



        // ------ do while ile  yapılış  farklı soru

        String color = "red";
        int count = 0;

        do {
            count++;
          //  System.out.println(count + " --->do it");
        } while (color.equals("red") && count < 10);       // burda condition tutarsa 10 kez tutmazsa 1 kez yazdırır.



        // break and continue

            // kullanıcıdan bir sayı aralığı alalım
            // 1-   7 ye tam bölünen sayıya kadar azalan şekilde yazdıralım
            // 2-   7 ye tam bölünenleri yazdıran artan sekilde yazdırın.

        Scanner sc=new Scanner(System.in);
      //  System.out.println("Sayi araligini giriniz");
        int i1=sc.nextInt();
        int i2=sc.nextInt();

        // 1
        for (int j = Integer.max(i1,i2); j >= Integer.min(i1,i2) ; j--) {    // sorunun 1. kısmı için burası
            if (j%7==0)break;
         //   System.out.println("j = " + j);
        }
       // System.out.println();
        // 2
        for (int t= Integer.min(i1,i2); t<=Integer.max(i1,i2); t++){         // sorunun 2. kısmı için burası
                if (t%7!=0)continue;
          //  System.out.print(t + " ");
        }




      // Label works with break and continue

        // verilen aralıktaki prime numberleri bulunuz

        // 1- prime number sadecec 1 ve kendisine bölünen
        // 2- hersayı 1 e bölünebilir loop 2 den başlamalı
        // 3- iç içe 2 loop olmalı dıştaki sayı aralığını tektek gezmeli
        // 4- içteki loop dıştakinden gelen her sayiyi 2 dahil son sayıya kadar tüm sayılara bölmeli
        // 5- tam bir bölüm olup olmadığını denetlemeli


        // 7 8 9 10 11 12 13 14  girilen sayılar diyelim

       label : for (int j = Math.min(i1,i2); j <=Math.max(i1,i2) ; j++) {
            for (int k = 2 ; k < j; k++) {
                if (j%k==0){
                    continue label;
                }
            }
           System.out.println("j = " + j+" ");
       }
























    }
}
