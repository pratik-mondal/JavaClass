public class Unary {
    public static void main(String[] args) {
        int x =5;
        int y =-x;
        int z =-y;
        System.out.println(z);
        int a = 8 ;
        a++; // a=a+1 and a+=1 are same.
        System.out.println(a);
        ++a;
        System.out.println(a);
        System.out.println("watching increment");
        int p=6;
        System.out.println(++p); // same for subtract
        System.out.println(p);
        System.out.println(p++);
        System.out.println(p);
    }
}
