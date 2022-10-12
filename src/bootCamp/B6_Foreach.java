package bootCamp;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class B6_Foreach {
    public static void main(String[] args) {

        // foreach                                       // foreach kullanarak yazdırma
        // iterator is fixed
        // there must be data structure
        //for(data type: data structor){}



        int[] nums=new int [8];

        nums[0]=2;
        nums[1]=5;
        nums[2]=7;
        nums[3]=10;
        nums[4]=21;
        nums[5]=13;
        nums[6]=9;
        nums[7]=25;

        for (int each: nums ) {
          //  System.out.print(each+" ");    // 2 5 7 10 21 13 9 25
        }


        SortedSet<Integer> sorted = new TreeSet<>(Arrays.asList(3,6,67,23,11,34,2,7,9,5));
        System.out.println(sorted);


        for (Integer each : sorted){
            System.out.println("each = " + each);
        }








    }
}
