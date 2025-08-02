import java.util.Scanner;

public class _32_Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("WELLCOME TO LCM CALCULATOR\n");
        System.out.print("please enter your number : ");
        int num1 = input.nextInt();
        System.out.print("please enter your number : ");
        int num2 = input.nextInt();
        int fact=lcm(num1,num2);
        System.out.print("LCM is :"+fact);
    }

    public static int lcm(int num1,int num2){
       int i=1,j=0;int factor=0;
       while(i<=num2) {
           factor = i*num1;
           if(factor%num2==0){
               return factor;
           }
           i++;
       }
       return 0;
    }
}