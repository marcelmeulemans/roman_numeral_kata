package com.tkh.kata;

public class RomanNumeralsKata {

	public static String convert(int arabic) {

		if (arabic < 10) {	
			if (arabic == 9)
				return "IX";	
			if (arabic == 8)
				return "VIII";	
			if (arabic == 7)
				return "VII";	
			if (arabic == 6)
				return "VI";	
			if (arabic == 5)
				return "V";	
			if (arabic == 4)
				return "IV";				
			if (arabic==3) 
				return "III";
			if (arabic==2) 
				return "II"; 
			if (arabic==1)
				return "I";		 


		}
		else if(arabic < 20)
		{
			return "X"+convert(arabic % 10);
		}
		else if(arabic < 30)
		{
			return "XX"+convert(arabic % 10);
		}
		else if(arabic < 40)
		{
			return "XXX"+convert(arabic % 10);
		}
		return "";
	}

}
 