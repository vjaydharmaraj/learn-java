import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        int n = str.length();
        String sub;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                sub = str.substring(i,i+j);
                System.out.print(sub +" ");
            }
        }
    }
}
