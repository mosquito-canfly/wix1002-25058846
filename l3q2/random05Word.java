package l3q2;
import java.util.Random;
public class random05Word {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt(6);
        String word = "";
        switch(num){
            case 0:
                word="zero";
                break;
            case 1:
                word="one";
                break;
            case 2:
                word="two";
                break;
            case 3:
                word="three";
                break;
            case 4:
                word="four";
                break;
            case 5:
                word="five";
                break;
            default:
                System.out.print("Error");
        }
        System.out.print(num+" is "+word+".");
    }
}
