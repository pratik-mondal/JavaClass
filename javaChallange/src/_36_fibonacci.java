import java.util.Scanner;

public class _36_fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter  the number : ");
        int num = input.nextInt();
        series(num);
        }
       public static void series(int num){
        if(num<=0) return;
          System.out.print(0+" ");
           System.out.print(1+" ");
        int first =0, second =1;
        while(first+second<=num){
            int third = first + second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }
       }
    }

