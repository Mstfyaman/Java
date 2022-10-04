package Day_46_Exception;

import java.util.Scanner;

public class ThrowClause {
    public static void main(String[] args) {

//        int x =0;
//        if(x==0){
//            throw new ArithmeticException("aritmetik exception hatası");
//        }
//        else {
//            System.out.println("program sonlandı");
//        }


// kullanıcıdan bir sayı alın ve bu sayının faktoriyelini alarak ekrana yazdırın




        try {
            System.out.println("try blogu calıstı");
            Scanner scan=new Scanner(System.in);
            int fack=scan.nextInt();
            int sonuc=1;
            for (int i=fack; i>0; i--){
                sonuc*=i;
            }
            System.out.println(fack + "faktoriyel =" + sonuc);

        }catch (Exception e){
            System.out.println("Exception yakalandı");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }







    }
}
