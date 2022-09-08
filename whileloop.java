import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        System.out.println("Enter Integer : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n!=0)
        {
            System.out.println("You Enetered : "+n );
            n=n-1;
        }
        System.out.println("Out of loop");
    }
}
