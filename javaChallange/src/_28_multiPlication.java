import java.util.Scanner;

public class _28_multiPlication {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("WELLCOME TO MULTIPLLICATION CALCULATOR");
        System.out.print("please enter your multiplication number : ");
        int num = input.nextInt();
        multiplication(num);
    }

    public static void  multiplication(int num){
        int i= 1;int cal;
       while(i<=10) {
          cal= i*num;
           System.out.println(i+" x "+num+" = "+cal);
           i++;
       }
    }
}
