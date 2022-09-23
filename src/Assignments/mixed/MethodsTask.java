package Assignments.mixed;

import java.util.Scanner;

public class MethodsTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        startProcess();



    }

    /*Konsoldan kullanıcıdan 2 sayı almanızı sağlayan bir
    metodu çağırın. İkinci sayı 3 ün katı olan bir sayı değilse,
    başka bir metodtan geçirin ve 3. katı olacak şekilde size
    döndürsün. Sonra bu sayıları kabul eden başka bir
    metotla da sayıları toplayın.*/

    public static void startProcess(){
        Scanner scan=new Scanner(System.in);
        System.out.println(" 2 sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        if (sayi2%3!=0){
            sum(sayi1,makeMultipleOfThree(sayi2));

    }else {
            sum(sayi1,sayi2);
        }
    }
public static int makeMultipleOfThree(int a){
        int multiple3;
        if (a%3>1){
            multiple3=a+1;
        }else {
            multiple3=a-a%3;
        }
        return multiple3;
}
public static void sum(int a, int b){
    System.out.println(a+b);
}

}
