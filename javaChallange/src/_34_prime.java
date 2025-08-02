import java.util.Scanner;

public class _34_prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("WELLCOME TO YOUR PRIME NUMBER CHHECK CALCULATOR\n");
        System.out.print("please enter your number : ");
        int num = input.nextInt();
         prime(num);
    }
    public static int prime(int num){
        int i=1;
        int count =0;
        while(i<=num ){
           if(num%i==0)
               count++;
           i++;
        }
        if(count<=2){
            System.out.println("the " +num+ " number is prime.");
        }
        else {
            System.out.println("the " +num+ " number is not prime.");
        }
        return 0;
    }
}
