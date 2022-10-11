package Assignments.replit;

public class KumSaati {  public static void main(String[] args) {



    for (int i = 1; i <= 13; i++) {
        for (int j = 1; j < i; j++) {
            System.out.print(" ");
        }
        for (int j = i; j < 8; j++) {
            System.out.print(j+ " ");
        }
        System.out.println();

        if(i==7) {

            for (int j = 1; j < 7; j++) {
                for (int r = 1; r < 7-j; r++) {
                    System.out.print(" ");
                }
                for (int k = 7-j; k < 8; k++) {
                    System.out.print(k + " ");
                }System.out.println();
            }

        }
    }


// ---------------------------------------------------------------

    for (int i = 1; i < 8; i++) {
        for (int k = 0; k <i ; k++) {
            System.out.print(" ");
        }
        for (int j = i; j < 8; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
    for (int m = 1; m <8 ; m++) {
        for (int t = 0; t < 7-m; t++) {
            System.out.print(" ");
        }
        System.out.print(" ");
        for (int l = 8-m; l <8 ; l++) {
            System.out.print(l+" ");

        }

        System.out.println();
    }








  }
}
