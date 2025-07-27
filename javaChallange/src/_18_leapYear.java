import java.util.Scanner;

public class _18_leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the year : ");
        int year = input.nextInt();
        if(year%400 == 0 ||year%4 == 0 && year%100 !=0){
            System.out.print("this year is leap year");
        }
        else{
            System.out.print("this year is not leap year");
        }
    }
}
