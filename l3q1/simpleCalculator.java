package l3q1;
import java.util.Scanner;
public class simpleCalculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter two interger number: ");
        int num1=s.nextInt();
        int num2=s.nextInt();
        System.out.print("Enter the operand: ");
        char operator=s.next().charAt(0);
        int ans=0;
        switch(operator){
            case'+':
                ans=num1+num2;
                break;
            case'-':
                ans=num1-num2;
                break;
            case'*':
                ans=num1*num2;
            case'/':
                if(num2==0){
                    System.out.println("Error");
                }else{
                    ans=num1/num2;
                }
                break;
            case'%':
                ans=num1%num2;
                break;
            default:
                System.out.println("Error");
        }
        System.out.print(num1+" "+operator+" "+num2+" = "+ans);
    }
}
