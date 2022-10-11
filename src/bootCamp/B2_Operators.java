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


        // The assigment operators
        // The equality and relational operators
        // The conditional/logical operators



    }
}
