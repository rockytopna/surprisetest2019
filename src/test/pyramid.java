package test;

public class pyramid {
    // Implement a large Pyramid of stars in the screen with java.
    //
    //                    *
    //                   * *
    //                  * * *
    //                 * * * *
    //                * * * * *
    //               * * * * * *

    //Start Here


    public static void main(String[] args) {

        System.out.println(" Pyramid of Star Using Java");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}




