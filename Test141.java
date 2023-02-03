import java.util.InputMismatchException;
import java.util.Scanner;
public class Test141{
    int n1,n2,result;
    
    Scanner sc = new Scanner(System.in);
     void Calc(){
         try{
             System.out.println("Enter 1st num");
             n1 = sc.nextInt();
             System.out.println("Enter 2st num");
             n2 = sc.nextInt();
             result = n1/n2;
         }
         catch(InputMismatchException ime){
             System.out.println("IME detected");
         }
         catch (ArithmeticException ae){
             System.out.println("AE detected");
         }
         catch(Exception e){
             System.out.println("Ouch exception caught"+e.getMessage());
             e.printStackTrace();
         }
         System.out.println(result);
     }
     public static void main(String[] args){
         Test141 obj = new Test141();
         obj.Calc();
     }
}