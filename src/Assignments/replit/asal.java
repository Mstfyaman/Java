package Assignments.replit;

import java.util.*;

public class asal {
    public static void main(String[] args) {



//        Scanner scc=new Scanner(System.in);
//        int num1=scc.nextInt();
//        int num2=scc.nextInt();
//        System.out.println("Please insert two numbers between 0 to 1000.");

//        int sayac;
//        for(int i=num1; i<num2; i++){
//            sayac=0;
//            for( int j=2; j<i; j++){
//                if(i%j ==0){
//                    sayac++;
//                }
//                if (sayac==0){
//                    System.out.println(i);
//                }
//            }
//        }

            SayıArasındaAsalMetot.Asallar(80,600);

    }

    public class SayıArasındaAsalMetot {

        static void Asallar(int sayi1, int sayi2) {
            int sayac;
            for(int i = sayi1; i < sayi2; i++)
            {
                sayac = 0;
                for(int j = 2; j < i; j++)
                {
                    if(i % j == 0) {
                        sayac++;
                    }
                }
                if(sayac == 0) {
                    System.out.println("Asal sayi = " + i);
                }
            }
        }
    }



}

