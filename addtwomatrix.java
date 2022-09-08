import java.sql.SQLOutput;
import java.util.Scanner;

public class addtwomatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column of the matrix : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        int[][] sum = new int[m][n];
        System.out.println("Enter First matrix elements : ");
        for (int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
               arr1 [i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second matrix elements : ");

        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                arr2 [i][j]  = sc.nextInt();
            }
        }
        System.out.println("Sum of the Two matrix  is : ");
        for(int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                sum [i][j] = arr1[i][j] * arr2[i][j];
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(sum[i][j] +" ");
            }
            System.out.println();
        }
    }
}
