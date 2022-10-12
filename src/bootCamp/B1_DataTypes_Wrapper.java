package bootCamp;

import static Day_45_OOP_ReviewCont2._interface.A.j;

public class B1_DataTypes_Wrapper {
    public static void main(String[] args) {

    // primitive
        // byte < short < int < long
        // float and double  ---> floating point number
        // char   ---> string character represent
        // boolean ---> true or false represent

// Casting / -primitive
        // implicit casting -- automatically--smaller to karger type
        int a= 100;
        double dl= a; // implicit casting // kapalı   küçükten büyüğe
      //  System.out.println("dl =" +dl);

   // explicit casting --- coder must do larger to smaller type
        double d=100;
        int i= (int) d; // explicit casting / açık  büyükten küçüğe / coder bunu kendisi elle yapar



    // -----------------------**********---Wrapper Class---***********-------------------------------

        // Why do you need wrapper class for primitive type?
        // Because; For example;
        // Arrays work with both types primitive and nonprimitive
        // Collection/Map can not work primitive type
        // For that we need wraper class to utilize flexblility of Collection/Map
        // Colleciton ve Map yapılarından istifade edebilmek için
        // primitive tiplerin wrapper class larına ihtiyaç duyarız
        // every primitive types has a wrapper class

        //  int ---> Integer
        // double ---> Double
        // char ---> Character
        // ...

        double db= 10.0;
        Double db1= db; // auto boxing
       // System.out.println(db1 + db);

        Integer num= 10;
        int n= num;

//        System.out.println(num == n);
//        System.out.println(10 == 10);
//        System.out.println("num.equals(n) = " + num.equals(n));
//        System.out.println("num.equals(10) = " + num.equals(10));


        int x =10;
        int y =20;
       // System.out.println("Integer.max(x,y) = " + Integer.max(x, y));


//        Scanner sc=new Scanner(System.in);
//
//        int num1= sc.nextInt();
//        int num2= sc.nextInt();
//                                              // iki değer arasındaki sayıları yazdırma.
//        Integer.max(num1,num2);
//
//        for (int j= Integer.min(num1,num2); j<=Integer.max(num1,num2); j++){
//            System.out.println(j + " ");
//        }


//   **parseInt()** - Convert a string consist of dijit to primitive

       Integer z = Integer.parseInt("10");

        int t= Integer.parseInt("5");         // string i int yapar
       // System.out.println("i1 =" + t);





    //  **valueOf() - Convert "string consist of dijit é to wrapper class object

        Integer integer= Integer.valueOf("5");        // string i int yapar

        Integer i1= Integer.valueOf("5")+z;
    //    System.out.println("i1 = " + i1);


     //   System.out.println("Character.isDigit('5') = " + Character.isDigit('5'));   // girilen değer bir sayı mıdır. ? true
     //   System.out.println("Character.isDigit('5') = " + Character.isDigit('a'));  // false

      //  System.out.println("Character.isLetter('a') = " + Character.isLetter('a')); // girilen değer bir hark midir ? true
      //  System.out.println("Character.isLetter('a') = " + Character.isLetter('8')); // false

        //System.out.println("Character.isLetterOrDigit('a')+\"\"+Character.isLetterOrDigit('4') = "
              //  + Character.isLetterOrDigit('a') + "" + Character.isLetterOrDigit('4'));   // aynı anda iki değer sorgulama  hem sayı hem harf


      //  System.out.println("Character.isAlphabetic('*') = " + Character.isAlphabetic('*'));  // alfabede bu var mı diye sorduk false


//        String dateEncrypted = "//*|1=*&&/%+%+%_M__!2½{½#7#A$$?_Y___!!!I!2//&&+%S%&%&½½½$$###]]}}}½$½$½2";
//        String dateDecrypt="";
//        for (int j=0; j< dateEncrypted.length(); j++);{
//
//            if (Character.isLetterOrDigit(dateEncrypted.charAt(j))){
//                dateDecrypt+=dateEncrypted.charAt(j);
//            }
//        }
//        System.out.println("dateDecrypt = " + dateDecrypt); //


    }
}
