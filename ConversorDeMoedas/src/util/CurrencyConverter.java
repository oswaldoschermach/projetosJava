package util;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double converter(double moeda, double quantidade) {
		return moeda * quantidade * (1.0 + IOF);
	}
}
