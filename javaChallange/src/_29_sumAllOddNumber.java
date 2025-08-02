import java.util.Scanner;

public class _29_sumAllOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("WELLCOME SUM ALL ODD NUMBER CALCULATOR \n");            // MAIN PART
        System.out.print("please enter your n term of all odd number : ");
        int num = input.nextInt();
        int sum= sumodd(num);
        System.out.println("total odd number of sum = "+sum);
    }

    public static int sumodd(int num){
        int i=1;int sum=0;                                                       // LOGIC PART
        while (i<=num){
                sum+=i;
                i+=2;
        }
        return sum;
    }

}
