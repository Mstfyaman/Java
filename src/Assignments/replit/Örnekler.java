package Assignments.replit;

public class Örnekler {
    public static void main(String[] args) {

        // System.out.println("****");
        // System.out.println("*  *");
        // System.out.println("*  *");
        // System.out.println("****");

//    for (int i=0; i<4; i++){
//        System.out.print("*");
//    }
//        System.out.println();
//    for (int j=0; j<2; j++){
//        System.out.print("*");
//        for (int k=0; k<2; k++ ){
//            System.out.print(" ");
//        }
//        System.out.println("*");
//    }
//    for (int m=0; m<4; m++){
//        System.out.print("*");
//    }



        for (int i = 1; i <=13; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int m = i; m < 8; m++) {
                System.out.print(m + " ");
            }
            System.out.println();
            if (i==7){
                for (int k = 0; k < 6; k++) {
                    for (int n = 0; n < 5-k; n++) {
                        System.out.print(" ");
                    }
                    for (int h =6-k ; h <8 ; h++) {
                        System.out.print(h + " ");
                    }
                    System.out.println("");
                }
            }
        }










    }
}
