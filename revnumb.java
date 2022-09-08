import java.util.Scanner;

public class revnumb {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem;
        int rev =0;
        while(n!=0)
        {
            rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        System.out.println("reverse number is : "+rev);

    }
}
