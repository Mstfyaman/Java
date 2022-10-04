package Day_48_Exception_Example;

public class Throws_Example {
    public static void main(String[] args) throws KraftException {
throw new KraftException("Exception atildi");

       // b_Metodu();
        // a_Metodu();

    }


    public static void a_Metodu(){
        b_Metodu();
    }


    public static void b_Metodu(){  // burda handle ettik
        try {
            c_Metodu();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public static void c_Metodu() throws InterruptedException {  //declare etmiş olduk
        d_Metodu();

    }

    public static void d_Metodu() throws InterruptedException {  // declare etmiş olduk
        Thread.sleep(300);
    }




}
