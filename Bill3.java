// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	// To get you started, here is the first line in the program:
	String name1 = args[0];
		 String b= args[1];
		 String c= args[2];
	 
		 double d= Double.parseDouble(args[3]);
		 int ans= d/3;
		 System.out.println("Dear "+c+", git "+ b+ ", and "+name1+": pay "+ans+ " Shekels each ");
	 
	   
	    
	}
}
