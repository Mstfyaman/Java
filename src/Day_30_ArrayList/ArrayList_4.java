package Day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList_4 {

    //  addAll(), removeAll()

    public static void main(String[] args) {

        ArrayList<String> position = new ArrayList<>();

        position.add("QA");
        position.add("DEVELOPER");
        position.add("UXDISEGNER");
        position.add("DEVEPS ENGINEER");
        position.add("SCRUM MASTER");

        ArrayList<String> tools = new ArrayList<>();

        tools.add("SELENIUM");
        tools.add("JAVA");
        tools.add("FIGMA");
        tools.add("AZURE");
        tools.add("JIRA");


        position.addAll(tools);              // position'a tools'un hepsini dahil ettik
        System.out.println("position = " + position);

        tools.addAll(position);       // tools'a posionun' un hepsini dahil ettik
        System.out.println("tools = " + tools);

//        ArrayList<String> other = new ArrayList<>();         //tools içinde
//        other.add("PRODUCT OWNER");
//        System.out.println("tools.removeAll(other) = " + tools.removeAll(other));


        tools.removeAll(position);
        System.out.println("tools = " + tools);













    }
}
