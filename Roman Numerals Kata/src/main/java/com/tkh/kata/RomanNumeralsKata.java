package com.tkh.kata;

public class RomanNumeralsKata {

	public static String convert(int arabic) {

		if (arabic < 10) {
			if (arabic == 5)
				return "V";	
			if (arabic == 4)
				return "IV";				
			if (arabic==3) 
				return "III";
			if (arabic==2) 
				return "II"; 
			else
				return "I";		
		}


		String result = "X";
		if(arabic==11) result += "I";
		else if(arabic==12) result += "II";
		else if(arabic==15) result += "V";
		else 
		return result;
		return result;
	}

}
 