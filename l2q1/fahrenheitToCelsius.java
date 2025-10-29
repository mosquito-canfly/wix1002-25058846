package l2q1;
import java.util.Scanner;

public class fahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter temperature in degree Fahrenheit: ");
        double fahrenheit=s.nextDouble();
        double celcius=(fahrenheit-32)/1.8;
        System.out.printf("Temperature in degree Celcius: %.2f",celcius);
    }
}
