package hypotenuse;

public class Hypotenuse {

	public static void main(String[] args) {
		double tringleHypotenuse = hypotenuse(6, 8); 
		System.out.println(tringleHypotenuse);
	}

	public static String convertoString(int n) {
		return Integer.toString(n);
	}

	public static double hypotenuse(double a, double b) {
		double hypotenusesquare = a * a + b * b;
		return sqrt(hypotenusesquare);
	}

	public static double sqrt(double n) {
		if (n < 0)
			return Double.NaN;
		if (n == 0)
			return 0;
		double err = 1e-15;
		double t = n;
		while (Math.abs(t - n / t) > err * t)
			t = (t + n / t) / 2;
		return t;
	}
}
