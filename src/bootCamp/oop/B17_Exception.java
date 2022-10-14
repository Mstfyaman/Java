package bootCamp.oop;

import java.io.FileWriter;

public class B17_Exception {
    private static String str;

    // checked and unchecked

    // checked exception --- during compile time / biz düzeltene kadar compile çalışmaz
    // unchecked exception ---during rubtime(çalışma süresi)

    public static void main(String[] args) {

        int[] arr = {5, 7, 9, 10};
     //   System.out.println(arr[50]); // runtime time exception -- unchecked exception

        //   FileWriter writer = new FileWriter(""); // checked exception  -- compile exception

        String str = null;


        try {
     //       System.out.println(str.length()); // null pointer exception
     //      System.out.println(arr[50]); // Array index out of bound exception
            Integer.parseInt("iki"); // numberformatexception
            int i = 55/0; // aritmeticexception
        } catch (Exception e) {
            e.printStackTrace();
        }
            finally {
            System.out.println(" ne olursa olsun yürürüm");
        }
    }


    // throw key only handle checked exception

    // final vs finally vs finalize
        // final keyword : you know
        // finaly  :  is ablock can be used with try catch block, always run
        // finalize : is a method collectors unreferenced object from garbage collection. using with unreferenced object











}
