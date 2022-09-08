import java.util.Scanner;

public class CelsiustoFahrenheit {


    public static void main(String[] args) {
        System.out.println("Enter temparature in Celsius : ");
        Scanner sc = new Scanner(System.in);
         float temp = sc.nextFloat();

         float fahrenheit = ((temp *9/5)+32);

        System.out.println(fahrenheit+" is the fahrenheit");

    }



}
