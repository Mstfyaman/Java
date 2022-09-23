package Day_30_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList_6 {

    //

    public static void main(String[] args) {

        ArrayList<String> fruitInBasket = new ArrayList<>();
     //   fruitInBasket.add("elma");
        fruitInBasket.add("armut");
        fruitInBasket.add("kayisi");
        fruitInBasket.add("uzum");
     //   fruitInBasket.add("erik");


        ArrayList<String> fruitInPlate = new ArrayList<>();
        fruitInPlate.add("armut");
        fruitInPlate.add("kayisi");
        fruitInPlate.add("uzum");

       // fruitInBasket.removeAll(fruitInPlate);
        System.out.println("fruitInBasket = " + fruitInBasket);


        System.out.println("fruitInPlate.equals(fruitInBasket) = " + fruitInPlate.equals(fruitInBasket));
        // biribirlerine eşit mi?  ( 'equals' : içerik aynı mı diye bakar )
        System.out.println(fruitInPlate == fruitInBasket);
        // burda da biribirlerine eşit mi?    ( '==' : bunların aynı arraylist olup olmadığına bakar )


        ArrayList<Integer> listOfNums =new ArrayList<>();

        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(200);

        printListNumbers(listOfNums);
        System.out.println("\nsum(listOfNums) = " + sum(listOfNums));

        ArrayList<Integer> myList = getList(20);
        System.out.println("myList = " + myList);

        random(20);
        System.out.println("random(20) = " + random(20));


        ArrayList<String >  stringNums =new ArrayList<>();
        stringNums.add("10");
        stringNums.add("100");
        stringNums.add("101");
        stringNums.add("1000");
        System.out.println("toIntList(stringNums) = " + toIntList(stringNums));

    }

    public static void printListNumbers(ArrayList<Integer> nums){
        for (Integer i:nums) {
            System.out.print(i+" ");
        }

    }

    public static int sum(ArrayList<Integer> nums){
        int sum=0;
        for (Integer i:nums) {
            sum+=i;
        }
        return sum;

    }

    public static ArrayList<Integer> getList(int i){

        ArrayList<Integer> list =new ArrayList<>();
        for (int j = 0; j < i; j++) {
            list.add(j);
        }
        return list;
    }


    public static ArrayList<Integer> random(int param){

        Random rm= new Random();
        ArrayList<Integer> rmList = new ArrayList<>();
        for (int i = 0; i < param; i++) {
            rmList.add(rm.nextInt(param)+1);
        }
        return rmList;
    }

    public static ArrayList<Integer> toIntList(ArrayList<String> str){
        ArrayList<Integer> intList =new ArrayList<>();

        for (String s :str) {
            intList.add(Integer.valueOf(s));
        }
        return intList;

    }







}
