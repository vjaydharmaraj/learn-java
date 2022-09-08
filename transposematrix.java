import java.util.Scanner;

public class transposematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] a = new int[m][n];
        System.out.println("Enter element to matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Inverse matrix");
        int[][] b = new int[n][m];
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[j][i] = a[i][j];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
