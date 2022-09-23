package Day_44_OOP_ReviewCont.hiding;

public class TestSuperAndSub {
    public static void main(String[] args) {

        Sub sub=new Sub();
        System.out.println("before increment " +sub.i);
        sub.increment();
        System.out.println("after increment " + sub.i);

        System.out.println("-------------------");

        Super str=new Super();
        System.out.println("before increment " +str.i);
        str.increment();
        System.out.println("after increment " + str.i);


    }
}
