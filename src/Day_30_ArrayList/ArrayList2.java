package Day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<Integer> nums =new ArrayList<>();

        nums.add(10);
        nums.add(100);
        nums.add(101);
        nums.add(190);
        nums.add(5);
        nums.add(55);

       System.out.println("nums = " + nums);

//        while (nums.size()>1){               //sürekli 1. indexi atar ve sadece 0. index kalır. boşaltır
//            nums.remove(1);
//        }
//
//        System.out.println("nums = " + nums);




        nums.remove(1);   // böylece 1. indeksi çıkartıp attık
        System.out.println("nums = " + nums);

        nums.remove(1);  // yeni 1. indekside atmış olduk
        System.out.println("nums = " + nums);

        nums.add(60);
        nums.add(200);
        System.out.println("nums = " + nums);
        System.out.println("nums.size() = " + nums.size());


        int num = 5;
        Integer NUM = 5;
        nums.remove(num);
        nums.remove(NUM);
        System.out.println("nums = " + nums);
        System.out.println("NUM = " + NUM);

//        nums.remove(new Integer(10));
//        System.out.println("nums = " + nums);

        nums.remove(Integer.valueOf(55));
        System.out.println("nums = " + nums);

        nums.remove(Integer.parseInt("1"));    //1. inddeksi atar ( sanırsam galiba)

        nums.clear();
        System.out.println("nums = " + nums);


    }
}
