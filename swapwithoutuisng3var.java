import java.util.Scanner;

public class swapwithoutuisng3var {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Before Swapping ");
        System.out.println(a);
        System.out.println(b);

        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("After Swapping ");
        System.out.println(a);
        System.out.println(b);
    }
}
