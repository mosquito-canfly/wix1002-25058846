package l3q6;
import java.util.Scanner;
public class circleCoordinate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius=s.nextDouble();
        System.out.print("Enter the coordinate point(x): ");
        double x=s.nextDouble();
        System.out.print("Enter the coordinate point(y): ");
        double y=s.nextDouble();
        if(x<radius && y<radius){
            System.out.print("The point is inside the circle.");
        }else if(x>radius || y>radius){
            System.out.print("The point is outside the circle.");
        }else{
            System.out.print("The point is on the circle.");
        }
    }
}
