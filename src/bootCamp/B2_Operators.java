package bootCamp;

public class B2_Operators {
    public static void main(String[] args) {

        // Arithmetic operators  // *  / + -
        int i= 5+3/2+1-1;
        System.out.println("i = " + i);  // 6
        i= 5+3*2+2-1;
       // System.out.println("i = " + i); // yeni değerler atadık ve cevap 12 oldu
        i = 5+(int)3.1+2-1;   // casting de yazdık.
        System.out.println("i = " + i);  // 9 oldu.

        System.out.println("----------------------------------------------");

        i= (int) (3.4+6.6);  // burda önce kendi içinizde toplanıın biz sonra sizi casting yapacağız dedik ve en az veri kaybı bu şekilde oluyor. sonuç =10
        i= (int)3.4+(int)6.6;  // burda önce casting yaptık sonra yazdırdık ve veri kaybı çok olsu sonuç = 9

        i= (int)(4.5+(double)(5/2));  // 6
        i= (int)(4.5+(double)5/2);  // 7




        // Unary operators  // + - ++ -- !
        int value =0;
        value++;      // bu işleme postfix increment denir.  cevap =1
        System.out.println("value = " + value);
        ++value;
        System.out.println("value = " + value);




        // The assigment operators  // = ( eşittir)
        int t = 10;
        int j = 20;

        j= j+t;
        j+=t;  // bir üsttekiyle aynı


        // The equality and relational operators  // == equal to   != not equal  <  <=  >  >=
            // all of above represent boolean condition   // true or false ifade eder

        double d= 10;
        if (d==10){} // true
        if (d>=10){} // true
        if (d<=10){} // true
        if (d!=10){} // false
        if (d>10){} // false
        if (d<10){} // false



        // The conditional/logical operators //    || | & && ^
           // &  her iki tarafıda control eder ilki true ama diğeri false ise false, true true ise true verir.
           // &&  her iki tarafı kontrol etmez tek taraf false ise false verir. ikise true olmalı
           // ^  her iki taraf ta aynıysa false döndürür. taraflar farklıysa true döndürür
           // ||  taraflardan en az birinin true olması gerekir ve öyleyse true döndürür
           // |










    }
}
