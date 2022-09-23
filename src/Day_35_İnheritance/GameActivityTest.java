package Day_35_İnheritance;

import java.util.Scanner;

public class GameActivityTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" kac tane hedefle karsılastın");
        int dusman =sc.nextInt();
        System.out.println(" kac tane hedefi vurdun");
        int isabet=sc.nextInt();

        Challenge challenge = new Challenge(dusman,isabet);

        System.out.println(challenge.getRank());


    }
}
