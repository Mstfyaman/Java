package bootCamp;

import java.util.Arrays;

public class B5_Arrays {
    public static void main(String[] args) {

    // we can hold/store multiple same type value in single variable
    // fized size
    // we can reach an elemnt by using index number

    int[] nums=new int [8];
        //System.out.println(Arrays.toString(nums));  // [0, 0, 0, 0, 0, 0, 0, 0]
        nums[0]=2;
       // System.out.println(Arrays.toString(nums));  // [2, 0, 0, 0, 0, 0, 0, 0]
    nums[1]=5;
    nums[2]=7;
    nums[3]=10;
    nums[4]=21;
    nums[5]=13;
    nums[6]=9;
    nums[7]=25;
        //System.out.println(Arrays.toString(nums));  // [2, 5, 7, 10, 21, 13, 9, 25]

        int[] nums2 = {2,4,6,1,79,11,4};   // bir diğer array türü
       // System.out.println(nums2.length); // 7

        int[] nums3 = nums3 = new  int[] {4,54,2,7,90,3};  // bir diğer array türü
       // System.out.println(nums3.length);  // 6



        // nums2 yi tersten yazdırın
      int[] reverse = new int[nums2.length]; // 7 indexli

        for (int i = reverse.length-1, j=0; i >=0 ; i--, j++) {
            reverse[j]=nums2[i];
        }
       // System.out.println(Arrays.toString(reverse));    // {2,4,6,1,79,11,4};





 //----------------------------------

        int[][] numbers = new int[2][];

        numbers[0]= new  int[3];
        numbers[1]= new  int[4];

        numbers[0][0]=10;
        numbers[0][1]=20;
        numbers[0][2]=30;

        numbers[1][0]=60;
        numbers[1][1]=70;
        numbers[1][2]=80;
        numbers[1][3]=90;

        System.out.println(Arrays.deepToString(numbers));

        for (int i=0; i< numbers.length; i++){
            System.out.println();
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
        }


        // ----------------------------

        nums[0]=2;
        nums[1]=5;
        nums[2]=7;
        nums[3]=10;
        nums[4]=21;
        nums[5]=13;
        nums[6]=9;
        nums[7]=25;


        int[] ints = Arrays.copyOfRange(nums, 2, nums.length);
        System.out.println(Arrays.toString(ints));


    }
}
