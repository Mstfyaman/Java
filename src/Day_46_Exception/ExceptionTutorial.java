package Day_46_Exception;

import java.util.Scanner;

public class ExceptionTutorial {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("program basladi");
        for (int i=0; i<5; i++){
            System.out.println("lutfen bir sayi giriniz");
            int x=scan.nextInt();
            System.out.println("bolen");
            int y=scan.nextInt();
            if (y!=0){
                System.out.println("sonuc :" + x / y);
            }
            else {
                System.out.println("bolum 0 olamaz");
            }
        }
        System.out.println("program bitti");
    }
}
