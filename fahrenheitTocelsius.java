import java.util.Scanner;

public class fahrenheitTocelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         float temp;

        float celsius;

        System.out.println("Enter Temparature in fahrenheit : ");

        temp = sc.nextFloat();

        celsius = ((temp-32)*5/9);

        System.out.println(celsius+" is celsius.");


    }
}
