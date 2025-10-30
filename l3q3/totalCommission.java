package l3q3;
import java.util.Scanner;
public class totalCommission {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the sales volume: ");
        int salesVolume=s.nextInt();
        double percentage = 0;
        if(salesVolume<=100){
            percentage=0.05;
        }else if(salesVolume>100 && salesVolume<=500){
            percentage=0.075;
        }else if(salesVolume>500 && salesVolume<1000){
            percentage=0.1;
        }else if(salesVolume>1000){
            percentage=0.125;
        }else{
            System.out.print("Error");
        }
        double commission=salesVolume*percentage;
        System.out.printf("Commision: %.2f",commission);
    }
    
}
