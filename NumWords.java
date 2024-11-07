// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	int a = Integer.parseInt(args[0]);

	int units= a%10;
	int tens= ((a/10)%10);
	int hun= ((a/100)%10);

	System.out.println ( hun + " hundreds, " + tens + " tens, and "+ units+ " ones.");
	}
}
