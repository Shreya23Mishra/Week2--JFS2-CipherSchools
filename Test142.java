public class Test142 {
     int getNextNo(int n) {
    	 try {
    	 if (n==5) {
    		 return n+1;
    	 }
    	 }
    	 finally {
    	 System.out.println("This is Important CODE");
    	 }
    	 return n-1;
     }
     
     public static void main(String[] args) {
    	 
    	 Test142 obj = new Test142();
    	 System.out.println(obj.getNextNo(5));
     }
}
