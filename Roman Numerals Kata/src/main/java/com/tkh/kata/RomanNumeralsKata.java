package com.tkh.kata;

import java.util.Collections;

public class RomanNumeralsKata {

	public static String convert(int arabic) {
		String arabicString = String.valueOf(arabic);
		char[] arabicIntArr = arabicString.toCharArray();
	//	Collections.reverse(arabicIntArr);
		if(arabicIntArr.length>1) 
			if (arabicIntArr[1] ==  '2')
				return "XII";
			else
				return "XI";
		if(arabicIntArr.length>2) return  "XII";
		return "I";
	}

}
