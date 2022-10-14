package bootCamp.oop;

public class B18_Garbage {

    public static void main(String[] args) {

        // two ways

        // 1-reassign a object

        String str= "Car";  // str ye truck assign ettiğimizde  car garbage oldu.****
        str ="truck";


       // 2- assign null

       String str2 = "cat";   // str2 ye null assign ettiğimizden  cat garbage oldu.
       str2 = null;


       // how/when to send an object to garbage collection
       // if an object being without referance it will garbage collection.







    }





}
