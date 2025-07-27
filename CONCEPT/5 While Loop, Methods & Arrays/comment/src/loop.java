import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1;                      //initialization
       /* while (num<=1){                  //condition
            System.out.print(num+"\n");   //updating the work
            num+=1;
        }*/
//        int num1 = 500;
//        while (num1>=200){
//            System.out.print("\n"+num1);
//            num1-=1;
//        }
        System.out.print("enter the process number of loop :");
        int num2 = input.nextInt();
        while(num<=num2){
            System.out.print("\nnummber : "+num);
            num+=1;
        }
    }
}
