// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	int input= Integer.parseInt(args[0]);
	int a= (int)(Math.random()*input)+1;
	int b= (int)(Math.random()*input)+1;
	int c= (int)(Math.random()*input)+1;

	int max1= Math.max(a, b);
	int max2= Math.max(max1,c);  // the max number ans 1

	int min1= Math.min(a, b);
	int min2=Math.min(min1, c); // the min number ans 2

	int mid= (a+b+c)- (max2+min2);

	System.out.println(a+","+b+","+c);

	System.out.println(min2+","+mid+","+max2);


	
	


	}

}
