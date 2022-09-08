import java.util.Scanner;

public class swapusing3var {
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter b: ");
        int m = sc.nextInt();

        System.out.println("Before swapping a and b : ");
        System.out.println(n);
        System.out.println(m);
        int temp;

        temp = m;
        m = n;
        n = temp;

        System.out.println("After swapping a and b : ");
        System.out.println(n);
        System.out.println(m);
    }
}
