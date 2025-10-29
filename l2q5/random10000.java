package l2q5;
import java.util.Random;
public class random10000 {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt(10001);
        System.out.println("number: "+num);
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.print("Sum of the all digits: "+sum);
    }
}