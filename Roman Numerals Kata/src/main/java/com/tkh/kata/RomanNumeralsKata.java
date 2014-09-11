package com.tkh.kata;

public class RomanNumeralsKata {

	public static String convert(int arabic) {
		if (arabic < 10) {
			if (arabic == 1)
				return "I";
			if (arabic == 2)
				return "II";
			if (arabic == 3)
				return "III";
			if (arabic == 4)
				return "IV";
			if (arabic == 5)
				return "V";
			if (arabic == 6)
				return "VI";
			if (arabic == 7)
				return "VII";
			if (arabic == 8)
				return "VIII";
			if (arabic == 9)
				return "IX";

		}

		else if (arabic < 20)
			return "X" + convert(arabic % 10);
		else if (arabic < 30)
			return "XX" + convert(arabic % 10);
		else if (arabic < 40)
			return "XXX" + convert(arabic % 10);
		else if (arabic < 50)
			return "XL" + convert(arabic % 10);
		else if (arabic < 60)
			return "L" + convert(arabic % 10);
		else if (arabic < 70)
			return "LX" + convert(arabic % 10);
		else if (arabic < 80)
			return "LXX" + convert(arabic % 10);
		else if (arabic < 90)
			return "LXXX" + convert(arabic % 10);	
		
		
		return "";

	}
}
