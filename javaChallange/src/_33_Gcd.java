import java.util.Scanner;

public class _33_Gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("WELLCOME TO GCD CALCULATOR\n");
        System.out.print("please enter your number : ");
        int num1 = input.nextInt();
        System.out.print("please enter your number : ");
        int num2 = input.nextInt();
        int finalgcd = gcd(num1,num2);
        System.out.println("the gcd is : "+finalgcd);
    }

    public static int gcd(int num1,int num2){
        int i=1;int j=0;
        int small = least(num1,num2);
        while (i<=small){
            if(num1%i ==0 && num2%i ==0){
              j=i;
            }
            i++;
        }
        return j;
    }

    public static int least(int num1,int num2){
        if(num1<num2) return num2;
        else return num1;
    }
}
