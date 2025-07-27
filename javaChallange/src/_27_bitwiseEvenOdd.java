import java.util.Scanner;

public class _27_bitwiseEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number : ");
        int num = input.nextInt();
        int cal = num & 1;
        if(cal==0)
          System.out.print("the number " +num+" is even");
        else{
            System.out.print("the number " +num+" is odd");
        }

    }
}
