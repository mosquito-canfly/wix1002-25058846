package l3q5;
import java.util.Scanner;
public class cramersRule {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a: ");
        double a=s.nextDouble();
        System.out.print("Enter b: ");
        double b=s.nextDouble();
        System.out.print("Enter c: ");
        double c=s.nextDouble();
        System.out.print("Enter d: ");
        double d=s.nextDouble();
        System.out.print("Enter e: ");
        double e=s.nextDouble();
        System.out.print("Enter f: ");
        double f=s.nextDouble();
        double x=(e*d-b*f)/(a*d-b*c);
        double y=(a*f-e*c)/(a*d-b*c);
        if(a*d-b*c==0){
            System.out.println("The equation has no solution");
        }else{
            System.out.println("x = "+x);
            System.out.print("y = "+y);
        }
    }
    
}
