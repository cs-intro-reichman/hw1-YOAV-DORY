// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currenvalue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]) / 100;
		int years = Integer.parseInt(args[2]);
		double futurevalue = currenvalue * (Math.pow((1 + rate), years));
		System.out.println("After " + years + " years, $" + currenvalue + " saved at " + Math.floor(rate*100) + "% will yeild $" + (int) Math.floor(futurevalue));
	}
}