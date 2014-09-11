package com.tkh.kata.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.tkh.kata.RomanNumeralsKata;

public class RomanNumeralsKataTest {
	@Test
	public void convert1to9ToRoman() {
		assertEquals("I", RomanNumeralsKata.convert(1));
		assertEquals("II", RomanNumeralsKata.convert(2));
		assertEquals("III", RomanNumeralsKata.convert(3));
		assertEquals("IV", RomanNumeralsKata.convert(4));
		assertEquals("V", RomanNumeralsKata.convert(5));
		assertEquals("VI", RomanNumeralsKata.convert(6));
		assertEquals("VII", RomanNumeralsKata.convert(7));
		assertEquals("VIII", RomanNumeralsKata.convert(8));
		assertEquals("IX", RomanNumeralsKata.convert(9));
	}
	@Test
	public void convert11ToRoman() {
		assertEquals("XI", RomanNumeralsKata.convert(11));
	}	
	@Test
	public void convert12ToRoman() {
		assertEquals("XII", RomanNumeralsKata.convert(12));
	}	
	@Test
	public void convert13ToRoman() {
		assertEquals("XIII", RomanNumeralsKata.convert(13));
	}
	@Test
	public void convert20ToRoman() {
		assertEquals("XX", RomanNumeralsKata.convert(20));
	}	
	@Test
	public void convert21ToRoman() {
		assertEquals("XXI", RomanNumeralsKata.convert(21));
	}
	@Test
	public void convert22ToRoman() {
		assertEquals("XXII", RomanNumeralsKata.convert(22));
	}
	@Test
	public void convert31ToRoman() {
		assertEquals("XXXI", RomanNumeralsKata.convert(31));
	}	
	@Test
	public void convert41ToRoman() {
		assertEquals("XLI", RomanNumeralsKata.convert(41));
	}	
	@Test
	public void convert42ToRoman() {
		assertEquals("XLII", RomanNumeralsKata.convert(42));
	}	
	@Test
	public void convert52ToRoman() {
		assertEquals("LII", RomanNumeralsKata.convert(52));
	}	
	@Test
	public void convert62ToRoman() {
		assertEquals("LXII", RomanNumeralsKata.convert(62));
	}	
	@Test
	public void convert72ToRoman() {
		assertEquals("LXXII", RomanNumeralsKata.convert(72));
	}	
	@Test
	public void convert15ToRoman() {
		assertEquals("XV", RomanNumeralsKata.convert(15));
	}

}
