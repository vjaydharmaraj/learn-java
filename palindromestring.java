import java.util.*;

public class palindromestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int len = str.length();
        String rev = "";

        for(int i=len-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }

        System.out.println("rev = "+rev);
        System.out.println("str = "+str);


        if(str.equals(rev))
        {
            System.out.println("Its a palindrome");
        }
        else {
            System.out.println("Its not a palindrome");
        }
    }
}
