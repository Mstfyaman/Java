package Day_13_DoWhile_bracking_labels;

import java.util.Random;
import java.util.Scanner;

public class Branching_Statements {
    public static void main(String[] args){

        /*for ( int i=0; i<5; i++){
            System.out.println(i+ " ilk dongu");
            for ( int j=0; j<5; j++){
                if (j==2){
                    break;
                }
                System.out.println(i+ "ikinci dongu ");
            }

        }     */

        Scanner scan=new Scanner(System.in);
        Random random=new Random();


//        int i=random.nextInt(50);
//        System.out.println(i);
//        System.out.println(" tuttugum sayiyi bil bakalim 5 hakkin var ");
//        int j=1;
//        do {
//            System.out.print(j+ " Tahmin : ");
//            int tahmin=scan.nextInt();
//            if (tahmin==i){
//                System.out.println(" Tebrikler sayiyi buldun");             // ramdom + do kullanımı
//                break;
//            } else if (tahmin>i) {
//                System.out.println(" asagi");
//
//            }
//            else {
//                System.out.println(" yukari");
//            }
//            j++;
//        }while (j<6);


        //------------------------------------------------------

//        while (true){
//            System.out.println(" ne yapmak istiyorsunuz");
//            System.out.println("1-Toplama\n2-cikarma\n3-carpma\n4-bolme\n5-cikis");
//            System.out.print(" Seciminiz: ");
//            int i=scan.nextInt();
//            if (i==1){
//                while (true) {
//
//                System.out.print(" Toplama İslemi cikis icin toplam 0 olmali : ");
//                System.out.print(" 1. sayi ");
//                int a=scan.nextInt();
//                System.out.print(" 2. sayi ");
//                int b=scan.nextInt();
//                System.out.println(" toplam= "+a+b);
//                if (a+b==0){
//                    break;                                        // burası çorba oldu :(
//                }
//                   if (i==5){
//                       break;
//                   }
//                }
//            }
//        }


        // ------------------------------------------------------------------------------


   /* for ( int i=0; i<10; i++){
        if (i>5 && i<8){
            continue;                  // 0 1 2 3 4 5 -- 8 9 yazdırır
        }
        System.out.println(i);
    }  */

        //--------------------------------------------

        for (int i=0; i<5; i++){
            System.out.println(" ilk dongu ");
            for (int j=0; j<5; j++){
                System.out.println(" merhaba");
                if (j==2){
                    continue;
                }
                System.out.println(" dunya");
            }
        }

















































    }
}
