package Day_34_Static.staticMethods;

import java.util.Random;

public class Geometric {

    static int primeter;
    static int counterSides;


    public static void setprimeter(int...sides){
        for (int i:sides){
          primeter+=i;
          counterSides++;
        }

        System.out.println("geometrik seklin cevresi= "+primeter);
        System.out.println("geometrik seklin kenar sayisi= "+counterSides);
    }

}


class main2{  //kendi oluşturduğumuz mainimiz
    public static void main(String[] args) {
        //Geometric.setprimeter(2,3);
       // Geometric.setprimeter(2,3,5);
        Geometric.setprimeter(generateSide(),generateSide(),generateSide(),generateSide());

    }
    public static int generateSide(){
        Random rm=new Random();
        return rm.nextInt(18);
    }
}
