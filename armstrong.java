import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int digit =0;
        int a = n;
        int temp = n;
        int rem;
        int sum=0;
        while(n!=0)
        {
            digit++;
            n=n/10;
        }

        while(temp!=0)
        {
           rem = temp%10;
           sum += (Math.pow(rem,digit));
           temp/=10;
        }

        if(sum == a)
        {
            System.out.println("Its a armstrong number");
        }
        else {
            System.out.println("Its not armstrong number");
        }
    }
}
