import java.util.Scanner;

public class GetInputFromUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.nextLine();

        System.out.println("Enter integer : ");
        int n = sc.nextInt();
        System.out.println("Enter Float : ");
        float a = sc.nextFloat();

        System.out.println(n+"integer");
        System.out.println(a+"float");
        System.out.println(s+"String");
    }
}
