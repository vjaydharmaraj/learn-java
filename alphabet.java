import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        System.out.println("Enter Alphabet : ");

        Scanner sc = new Scanner(System.in);

        char s = sc.next().charAt(0);

        for(int i=s;i<='z';i++)
        {
            System.out.print(s++);
        }
    }
}
