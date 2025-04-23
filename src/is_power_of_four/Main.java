package is_power_of_four;

public class Main {
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(64));
		System.out.println(4.0 % 10);
		//System.out.println(Math.sqrt(64));
		//System.out.println(64 / 4.0);
		// System.out.println(isPalindrome(121));
	}

	public static boolean isPowerOfFour(int n) {
		if (n <= 0) {
			return false;
		}
		if (n == 1 || n == 4) {
			return true;
		}
		if (n/4 <= 2) {
			return false;
		}
		double x = (double)(Math.log(n)/Math.log(4.0));
		if (x%1 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
