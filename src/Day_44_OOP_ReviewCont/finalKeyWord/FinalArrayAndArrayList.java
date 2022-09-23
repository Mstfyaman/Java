package Day_44_OOP_ReviewCont.finalKeyWord;

import Day_30_ArrayList.ArrayList_;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalArrayAndArrayList {
    public static void main(String[] args) {


        final String[] BATCH2= {"Talip","Alparslan"};
        BATCH2[0]="ibrahim";
        System.out.println(Arrays.toString(BATCH2));

         // batch2 = new String[]{"Ali","Mehmet"}; // array final olduğundan referansı değiştirilemez

        System.out.println("-------------------------");


      final   ArrayList<String> NAME= new ArrayList<>();
        NAME.add("ihsan");
        NAME.add("Enes");

       // NAME = new ArrayList<>();   // final olduğu için yeni bir array atayamayız( referansı değiştirilemez)


    }


}
