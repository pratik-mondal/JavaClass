import java.util.Scanner;

public class _15_negativePositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = input.nextInt();
        if(num<0){
            System.out.print("the nummber is negative");
        }
        else if (num>0){
            System.out.print("the nummber is positive");
        }
        else{
            System.out.print("zero is neither postive or negative");
        }
    }
}
