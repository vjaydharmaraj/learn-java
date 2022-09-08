import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int count =0;
        if (n<2)
        {
            count++;
        }

        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                count++;
            }

        }

        if(count>0)
        {
            System.out.println("it is not prime number");

        }
        else {
            System.out.println("it is prime number");
        }




    }
}
