package l2q6;
import java.util.Scanner;
public class heatWater {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        int water=s.nextInt();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialTemp=s.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTemp=s.nextDouble();
        double initialCelcius=(initialTemp-32)/1.8;
        double finalCelcius=(finalTemp-32)/1.8;
        double M=water/1000.0;
        double Q=M*(finalCelcius-initialCelcius)*4184;
        System.out.printf("the energy needed is %1.6e",Q);
    }
}
