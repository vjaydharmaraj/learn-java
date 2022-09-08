import java.util.Scanner;

public class Comparestring {
    public static void main(String[] args) {
        System.out.println("Enter the first string : ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("Enter the Second string : ");
        String s2 = sc.nextLine();

        if(s1.compareTo(s2)>0)
        {
            System.out.println(s1+ " first string is greatest");
        }
        else if (s1.compareTo(s2)<0)
        {
            System.out.println(s2+" Second string is greatest");
        }
        else
        {
            System.out.println("Both strings are equal");
        }
    }
}
