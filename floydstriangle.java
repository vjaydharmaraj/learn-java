import java.util.Scanner;

public class floydstriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int n = sc.nextInt();
        int k=1;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
