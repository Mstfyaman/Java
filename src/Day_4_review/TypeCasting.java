package Day_4_review;

public class TypeCasting {
    public static void main(String[] args){

       // Type Casting
       // Widening

        int myAge=8;
        double myDouble= myAge;
        System.out.println(myDouble);

        int version=2;
        double ver=version;
        System.out.println(ver);

        long uzun= 3;
        ver= uzun;
        System.out.println(ver);

        float kayan= uzun;
        System.out.println(kayan);

        System.out.println("--------------------------------");

         // Narrowing

        double d= 9.78;
        int i=(int)d;
        System.out.println(i);

        // 2.3  4.1  5 sayılarını uygun type lara atayın sayıların toplamını tam satı olarak yazdırın


        int aa=5;
        double bb=4.1;
        float cc=2.3f;

        int ab=(int)bb;
        int abc=(int)cc;

        System.out.println(aa+ab+abc);

        // 2.3   4.4  5.3. 5

        int num=5;
        double num1=4.4;
        double num5=5.3;
        float num2=2.3f;

        int num3=(int)(num1);
        int num4=(int)(num2);
        int num6=(int)(num5);

        System.out.println(num+num3+num4+num6);


        System.out.println("-----------------------------------------------");









    }
}
