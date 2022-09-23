package Day_14_Methods;

import java.util.*;

public class MethodsDay {
   public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);



        //aritmetik();
        //buyuksayi();
        //okka();
        //short s=5;
        // message4((int)5.5);
        //message5("persembe",11);
        //yas(1994);
        // üslü(2,3);
        // matematiksel(5,6);
        // hesapmakinesi(7,8,"*");

        //sum(5,4);
        //System.out.println(sum(5, 4));


    }

    public static void aritmetik(){

        Scanner scan=new Scanner(System.in);
        System.out.println(" Lutfen 3 sayi degeri giriniz : ");         // aritmetik ortalama yazdirma
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        System.out.println(" aritmetik ortalama =" +(a+b+c)/3);
    }

    public  static void buyuksayi(){
        Scanner scan=new Scanner(System.in);

    System.out.println(" Lutfen 3 sayi degeri giriniz : ");
    int x=scan.nextInt();
    int y=scan.nextInt();
    if (x>y){
        System.out.println(" buyuk olan sayi x dir");
                                                                                 // büyük sayi yazdirma
    } else if (y>x) {
        System.out.println(" buyuk olan sayi y dir");

    }else {
        System.out.println(" sayilar birbirine esittir");
    }

    }

     public static void okka(){
        Scanner scan=new Scanner(System.in);

        System.out.println(" Lutfen kilo degerini giriniz : ");                 // kg yi okka yazdirma
        double kilo=scan.nextDouble();
        double okka=kilo/1.282;
        System.out.println(kilo+" nun okka degeri " +okka);


    }

    public static void message4(int num){
        System.out.println(num+ " burada ");                 // numaralı yazdırma
        System.out.println(num + 3);

    }

    public static void message5(String str, int i){
        System.out.println(" Ayin "+i+" i "+str+" dir. ");
    }

    public static void yas(int dyil){                            // 2 farklı variable li
        Scanner scan=new Scanner(System.in);

    int yil=2022-dyil;
        System.out.println(" yasiniz =" +yil);              // yas hesaplama

    }

    public static void üslü(int a,int b){
        double pow= Math.pow(a,b);                   // üslü sayi
        System.out.println(pow);
    }

    public static void matematiksel(int a, int b){
        System.out.println(a+" + "+b+ "=" + (a+b));

    }
    public static void hesapmakinesi(int q, int w, String e){

        if (e.equals("*")){
            System.out.println(q*w);
        } else if (e.equals("+")) {
            System.out.println(q+w);
        } else if (e.equals("-")) {                 // hesap makinası
            System.out.println(q-w);
        } else if (e.equals("/")) {
            System.out.println(q/w);
        }else
            System.out.println(" baska sefere bro !!!");

    }

    public static int sum(int a, int b){
        return a+b;                              // bu tip mainleri yukarıdaki sum'da oynama yapabiliyoruz yukarı bak
                                                // int gibi biir değişkenede atayabiliriz
    }
        }