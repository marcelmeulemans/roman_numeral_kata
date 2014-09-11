package com.tkh.kata.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.tkh.kata.RomanNumeralsKata;

public class RomanNumeralsKataTest {
	@Test
	public void convert1ToRoman() {
		assertEquals("I", RomanNumeralsKata.convert(1));
	}
	@Test
	public void convert2ToRoman() {
		assertEquals("II", RomanNumeralsKata.convert(2));
	}
	@Test
	public void convert5ToRoman() {
		assertEquals("V", RomanNumeralsKata.convert(5));
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
	public void convert15ToRoman() {
		assertEquals("XV", RomanNumeralsKata.convert(15));
	}
	@Test
	public void convert3ToRoman() {
		assertEquals("III", RomanNumeralsKata.convert(3));
	}
	@Test
	public void convert4ToRoman() {
		assertEquals("IV", RomanNumeralsKata.convert(4));
	}
}
