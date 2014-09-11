package com.tkh.kata;

import java.text.MessageFormat;

public class RomanNumeralsKata {
	private static final String ROMAN_DIGIT_SYMBOLS[] = {"IVX", "XLC", "CDM", "M  "};
	private static final String ROMAN_DIGIT_PATTERNS[] = {"", "{0}", "{0}{0}", "{0}{0}{0}", "{0}{1}", "{1}", "{1}{0}", "{1}{0}{0}", "{1}{0}{0}{0}", "{0}{2}"};

	public static int extractDigit(int number, int digit) {
		return number / (int)Math.pow(10, digit - 1) % 10;
	}

	public static String convertDigit(int arabic, int digit) {
		char[] symbols = ROMAN_DIGIT_SYMBOLS[digit - 1].toCharArray();
		String pattern = ROMAN_DIGIT_PATTERNS[extractDigit(arabic, digit)];
		return MessageFormat.format(pattern, symbols[0], symbols[1], symbols[2]);
	}

	public static String convert(int arabic) {
		return convertDigit(arabic, 4) + convertDigit(arabic, 3) + convertDigit(arabic, 2) + convertDigit(arabic, 1);
	}
}