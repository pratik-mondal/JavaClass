import java.util.Scanner;

public class _31_sumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("WELLCOME TO SUM OF DIGIT CALCULATOR\n");
        System.out.print("please enter your number : ");                    // MAIN PART
        int num = input.nextInt();
        int cal = sumdigit(num);
        System.out.print(num+" this number sum = "+cal);
    }

    public static int sumdigit(int num){
        int i=1,sum=0;
        while(i<=num){                                                     // LOGIC PART
          sum += num%10;
          num = num/10;
        }
        return sum;
    }
}
