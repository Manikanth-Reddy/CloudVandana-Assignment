

import java.util.Scanner;

public class RomanToIntegerConverter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Roman Numeral :");
		String romanNumeral = s.next(); 
		int r = romanToInt(romanNumeral);
		System.out.println("Integer equivalent: " + r);
	}

	public static int romanToInt(String s) {
		int result = 0;
		int previousvale = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			char roman = s.charAt(i);
			int currentValue = getRomanValue(roman);

			if (currentValue < previousvale) {
				result -= currentValue;
			} else {
				result += currentValue;
			}

			previousvale = currentValue;
		}

		return result;
	}

	private static int getRomanValue(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;

		}

	}
}
