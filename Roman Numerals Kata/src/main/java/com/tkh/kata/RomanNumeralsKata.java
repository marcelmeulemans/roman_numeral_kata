package com.tkh.kata;

public class RomanNumeralsKata {

	public static final String ONE_SYMBOL = "I";
	public static final String FIVE_SYMBOL = "V";
	public static final String TEN_SYMBOL = "X";
	public static final String FIFTY_SYMBOL = "L";
	public static final String HUNDRED_SYMBOL = "C";
	public static final String FIVE_HUNDRED_SYMBOL = "D";
	public static final String THOUSAND_SYMBOL = "M";

	public static String convertDigit(int arabic, String oneSymbol, String fiveSymbol, String tenSymbol) {
		switch (arabic) {
			case 1:  return oneSymbol;
			case 2:  return oneSymbol + oneSymbol;
			case 3:  return oneSymbol + oneSymbol + oneSymbol;
			case 4:  return oneSymbol + fiveSymbol;
			case 5:  return fiveSymbol;
			case 6:  return fiveSymbol + oneSymbol;
			case 7:  return fiveSymbol + oneSymbol + oneSymbol;
			case 8:  return fiveSymbol + oneSymbol + oneSymbol + oneSymbol;
			case 9:  return oneSymbol + tenSymbol;
			case 10: return tenSymbol;
			default: return "";
		}
	}

	public static String convert(int arabic) {
		String result = "";

		int firstDigit = arabic % 10;
		int secondDigit = arabic / 10 % 10;
		int thirdDigit = arabic / 100 % 10;
		int fourthDigit = arabic / 1000;

		result += convertDigit(fourthDigit, THOUSAND_SYMBOL, "", ""); 
		result += convertDigit(thirdDigit, HUNDRED_SYMBOL, FIVE_HUNDRED_SYMBOL, THOUSAND_SYMBOL);
		result += convertDigit(secondDigit, TEN_SYMBOL, FIFTY_SYMBOL, HUNDRED_SYMBOL);
		result += convertDigit(firstDigit, ONE_SYMBOL, FIVE_SYMBOL, TEN_SYMBOL);

		return result;
	}
}
