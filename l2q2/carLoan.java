package l2q2;
import java.util.Scanner;
public class carLoan {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the price of the car: ");
        double P=s.nextDouble();
        System.out.print("Enter the down payment: ");
        double D=s.nextDouble();
        System.out.print("Enter the interest rate in %: ");
        double R=s.nextDouble();
        System.out.print("Enter the loan duration in year: ");
        int Y=s.nextInt();
        double M=(P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("Monthly payment: %.2f",M);
    }
}
