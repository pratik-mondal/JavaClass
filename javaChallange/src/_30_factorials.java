import java.util.Scanner;

public class _30_factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("WELLCOME FACTORIALS CALCULATOR \n");            // MAIN PART
        System.out.print("please enter your factorial number : ");
        int num = input.nextInt();
        int fact = factorial(num);
        System.out.print(num+" factorial is "+fact);
    }

    public static int factorial(int num){
        int i=1;int j=1;
        while(i<=num){                                                    // LOGIC PART
         j*=i;
         i++;
        }
        return j;
    }
}
