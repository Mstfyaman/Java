package Day_48_Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("ahmet");
        arrayList.add("mehmet");
        arrayList.add("ayse");
        arrayList.add("ahmet");

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.remove(3));
        System.out.println(arrayList.size());
        arrayList.clear();
        System.out.println(arrayList.size());


    }
}
