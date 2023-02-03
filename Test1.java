import java.util.Scanner;

public class Test1 {
	 int n1,n2,result;
	    
	    Scanner sc = new Scanner(System.in);
	     void Calculate(){
	         try{
	             System.out.println("Enter 1st num");
	             n1 = sc.nextInt();
	             System.out.println("Enter 2st num");
	             n2 = sc.nextInt();
	             result = n1/n2;
	         }
	         catch(Exception e){
	        	 System.out.println("Ouch Exception Detected! "+e.getMessage());
	  
	         }
	        System.out.println("The division is:"+result);
	     }
	     public static void main(String[] args){
	         Test1 obj = new Test1();
	         obj.Calculate();
	     }

}
