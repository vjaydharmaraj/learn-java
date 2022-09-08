import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        System.out.println("Enter mark");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Passmark = 50;
        if(n>=Passmark)
        {
            if(n>=90)
            {
                System.out.println('A');
            }
            else if (n>=80)
            {
                System.out.println('B');
            }
            else if (n>=70)
            {
                System.out.println('C');
            }
            else
            {
                System.out.println('D');
            }

        }
        else {
            System.out.println("Fail");
        }
    }

}
