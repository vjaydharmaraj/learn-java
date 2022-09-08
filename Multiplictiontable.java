import java.util.Scanner;

public class Multiplictiontable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What tables u want :");
        int n = sc.nextInt();
        System.out.println("How many times : ");
        int t = sc.nextInt();
        int ans;
        for(int i=1;i<=t;i++)
        {
            ans = i * n;

            System.out.println(i+"*"+n +"="+ans);
        }

    }
}
