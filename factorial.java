import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }

        System.out.println("Factorial of  is :" + fac);
    }
}
