package Day_29_Wrapper;

public class WrapperClass {
    public static void main(String[] args) {

        Byte B = new Byte((byte) 127);
        Byte B2 = new Byte("127");

        System.out.println(" B = "+ B);
        System.out.println(" B2 = "+ B2);


        Short S= new Short((short) 1000);
        Short S2= new Short(" 1000");

        Integer i= new Integer(10000);
        Integer i2= new Integer("10000");

        Long L= new Long(10000000);
        Long L2= new Long("10000000");

        Float F= new Float(1.2);
        Float F2= new Float("1,2");

        Double D= new Double(3.14);
        Double D2= new Double("3.14");

        Character C= new Character('a');


        //Autoboxing      ing nin Integer e donüştürülmesine dedir.  long,double,float dahil.

        int i3= 10;
        Integer x= i3;  //autoboxed

        Integer x1= new Integer(5);
        int i1 = x1;  // unboxed


        Double db=new Double(10.);
        double dbl = db;  //unboxed

        double dbl1 = new Double(3.14); //unboxed

    //  valueOf

        Integer integer = java.lang.Integer.valueOf("10");
        System.out.println("Integer =" + integer);
        Integer integer1 = Integer.valueOf(10);
        System.out.println(integer + integer1);


        Boolean Bl = Boolean.valueOf("true");
        Boolean Bl1 = Boolean.valueOf(true);
        Character ch= Character.valueOf('a');
        System.out.println("B1 = "+Bl);
        System.out.println("Bl1 = "+Bl1);
        System.out.println("ch = "+ch);



        Integer integer2=Integer.valueOf("");


        // pars

        int y = Integer.parseInt("100");
        System.out.println("y = "+y);
        int y1 = Integer.parseInt("-100");      //bunları kabul eder
        int y2 = Integer.parseInt("+100");
        Double dble= Double.parseDouble("100");
        Boolean bl= Boolean.parseBoolean("true");

        System.out.println("y1 = "+y1);
        System.out.println("y2 = "+y2);
        System.out.println("dble = "+dble);
        System.out.println("bl = "+bl);


        int y3 = Integer.parseInt("100b");
        int y4 = Integer.parseInt("100-");      //bunları kabul etmez
        int y5 = Integer.parseInt("n100-");
        int y6 = Integer.parseInt(" ");
        System.out.println("y3 = "+y3);
        System.out.println("y4 = "+y4);
        System.out.println("y5 = "+y5);
        System.out.println("y6 = "+y6);






    }
}
