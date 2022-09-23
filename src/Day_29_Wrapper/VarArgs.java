package Day_29_Wrapper;

public class VarArgs {
    public static void main(String[] args) {   //variable arguments

        sum(5,10);
        sum(5,10,15);
        sum(5,10,20,25,30);
        sum(5,10,15,20,25,30,100,102);

        concat("ja","va");
        concat("ja","va"," ","insanlari");
        concat1("JAVA","PYTHON","BHP");

        System.out.println(concat1("JAVA","PYTHON","BHP"));



    }

    public static void sum(int... sayilar){
        int sum=0;
        for (int i:sayilar){
            sum+=i;
        }
        System.out.println("girilen "+sayilar.length+" sayinin toplami "+sum);
    }
    public static void concat(String... strs){
        String empty= "";
        for (String s : strs){
            empty+=s;
        }
        System.out.println(empty);
    }
    public static String concat1(String... strs){
        String empty= "";
        for (int i=0; i<strs.length; i++){
            empty+=strs[i].charAt(0);
        }
        return empty;
    }





}
