import java.util.Scanner;

public class addtwonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter the number 2 :  ");
        int b = sc.nextInt();

        int c = a +b;

        System.out.println("Sum is "+c);
    }
}
