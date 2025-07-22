import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" enter your name :");
        String name = input.nextLine();
        System.out.println("good morning " +name);
        System.out.print(name+",also tell your age :");
        int age = input.nextInt();
        System.out.println("my age is "+age);
    }
}
