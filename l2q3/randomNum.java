package l2q3;
import java.util.Random;
public class randomNum {
    public static void main(String[] args) {
        Random  r=new Random();
        int num1=r.nextInt(41) + 10;//10 - 50
        int num2=r.nextInt(41) + 10;//0 - 40 = 10 - 50
        int num3=r.nextInt(41) + 10;
        System.out.println("number 1: "+num1);
        System.out.println("number 2: "+num2);
        System.out.println("number 3: "+num3);
        int sum=num1+num2+num3;
        System.out.println("Sum of the numbers: "+sum);
        double average=sum/3.0;
        System.out.printf("Average of the numbers: %.2f",average);
    }
}
