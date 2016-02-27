package base;

/***
 * 
 * @author samuelhete
 *
 */
public class MyInteger {
	private int iValue;

	public MyInteger(int MyInteger) {
		this.iValue = MyInteger;
	}

	public int get() {
		return iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		}
		return false;
	}

	public boolean isOdd() {
		if (iValue % 2 != 0) {
			return true;
		}
		return false;
	}

	public boolean isPrime() {
		// check if n is a multiple of 2
		if (iValue % 2 == 0)
			return false;
		/*
		 * if not, then just check the odds, it's faster this way especially
		 * with big ints
		 */
		for (int i = 3; i * i <= iValue; i += 2) {
			if (iValue % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(int val) {
		return (val % 2 == 0);
	}

	public static boolean isOdd(int val) {
		return (val % 2 != 0);
	}

	public static boolean isPrime(int val) {
		// check if n is a multiple of 2
		if (val % 2 == 0)
			return false;
		/*
		 * if not, then just check the odds, it's faster this way especially
		 * with big ints
		 */
		for (int i = 3; i * i <= val; i += 2) {
			if (val % i == 0)
				return false;
		}
		return true;
	}

	public boolean isEven(MyInteger val) {
		return val.isEven();
	}

	public boolean isOdd(MyInteger val) {
		return val.isOdd();

	}

	public boolean isPrime(MyInteger val) {
		return val.isOdd();

	}

	public boolean equals(int val) {
		return (iValue == val);

	}

	public boolean equals(MyInteger val) {
		return (iValue == val.iValue);
	}

}
