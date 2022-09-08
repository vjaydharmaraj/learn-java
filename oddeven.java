import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0)
        {
            System.out.println("It is Even number");
        }
        else {
            System.out.println("It is Odd number");
        }
    }
}
