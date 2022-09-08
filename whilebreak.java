import java.util.Scanner;

public class whilebreak {

    public static void main(String[] args) {
        System.out.println("Enter number : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(true)
        {
            if(n==0)
            {
                break;
            }
            System.out.println(n);
            n=n-1;
        }
    }
}
