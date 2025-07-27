import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("WELLCOME TO DISCOUNT COUNTER\n");
        System.out.print("please enter your age : ");
        int age = input.nextInt();
        System.out.println("are you a female ? (true/false)\n Ans : ");
        boolean female = input.nextBoolean();
        if(age<5){
            System.out.print("yout got 75 % discount");
        }
        else if (age > 60 && !female){
            System.out.print("you got 25% discount");
        }
        else if (female) {
            System.out.print("you got 60% discount");
        }
        else {
            System.out.print("you are not get a discount");
        }
    }
}
