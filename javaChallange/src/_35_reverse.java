import java.util.Scanner;

public class _35_reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number : ");
        int num = input.nextInt();
       int d=rev(num);
        System.out.println(num+" reverse nummber is "+d);
    }

    public static int rev(int num) {
        int newnum= 0;
        while(0<num){
            int digit = num % 10;
            newnum = newnum*10+digit;
            num/=10;
        }
        return newnum;
    }

}
