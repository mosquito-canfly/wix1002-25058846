package l2q4;
import java.util.Scanner;
public class seconds {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds=s.nextInt();
        int hour=seconds/(60*60);
        int minute=(seconds%3600)/60;
        int second=(seconds%3600)%60;
        System.out.print(seconds+" seconds is "+hour+" hours, "+minute+" minutes and "+second+" seconds");
    }
}
