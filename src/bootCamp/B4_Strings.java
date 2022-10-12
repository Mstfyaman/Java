package bootCamp;

public class B4_Strings {
    public static void main(String[] args) {

        // String is sequence(dizi) of char value

        // String immutable (değişmez)

        String str = "Big";
        str.concat("Man");
        //if it is nor reassign to str. str always return original value
        System.out.println("str = " + str);

        str=str.concat("Man");
        //concat and reassign ---> we cread a new string and pointed to new string
        System.out.println("str = " + str);


        //------------

        // we can create string by two way
        // String literal
            String literal = "KRAFT";    // litera lstringler düz atama

        // By new keyWord
            String byNew = new String("BootCamp");

        // String builder and String buffer muable/değişken

        StringBuilder strBld = new StringBuilder("Boot"); // is not immutable( değişmez)
            // concat() yerine append() metodu var
            strBld.append("Camp");
        System.out.println("strBld = " + strBld);  // BootCamp

        // method of String class
        // charAt()--lenght()--concat()--equals()--substring()--replace()--



    }
}
