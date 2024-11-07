// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int a= Integer.parseInt(args[0]);//money
		double b= Double.parseDouble(args[1]);// intrest
		int c= Integer.parseInt(args[2]);// years
	
	  double ans1= Math.pow((1+(b/100)),c);
	  double ans2= a*ans1;


	  System.out.println("After "+ c+ " years, $"+ a+ " saved at "+ b+ "% will yield $" + (int)ans2 )javac FVCalc.java;



	}
}