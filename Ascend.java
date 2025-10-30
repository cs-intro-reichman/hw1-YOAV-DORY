// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);

		double r = Math.random();
		double t = Math.random();
		double s = Math.random();

		int a = (int) (r * num);
		int b = (int) (t * num);
		int c = (int) (s * num);

		int min = Math.min(Math.min(a,b),c);
		int max = Math.max(Math.max(a,b),c);
		int Ascend = a + b + c - min - max;
		System.out.println(min +" "+ Ascend + " " + max);
	}
}
