// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	// To get you started, here is the first line in the program:
	String name1 = args[0];
		 String b= args[1];
		 String c= args[2];
	 
		 double d= Double.parseDouble(args[3]);
		 double ans= d/3;
		 double ans1= Math.ceil(ans);
		 System.out.println("Dear "+c+", "+ b+ ", and "+name1+": pay "+ans1+ " Shekels each ");
	 
	   
	    
	}
}
