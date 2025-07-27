import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
       // greeting();
        pattern();
    }

    // FIRST FUNCTION DECLAIR.

    public static void greeting() {
        System.out.print("wecome to coding world");
    }

    // second FUNCTION DECLAIR.

    public static void pattern() {
        int row = 0;
        while (row < 20) {
            System.out.print("*");
             int i=0;
             while(i<row){
                 System.out.print(" *");
                 i++;
            }
            System.out.println();
             row++;
        }
    }
}
