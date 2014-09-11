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
	public void convert3ToRoman() {
		assertEquals("III", RomanNumeralsKata.convert(3));
	}

	@Test
	public void convert5ToRoman() {
		assertEquals("V", RomanNumeralsKata.convert(5));
	}

	@Test
	public void convert8ToRoman() {
		assertEquals("VIII", RomanNumeralsKata.convert(8));
	}

	@Test
	public void convert4ToRoman() {
		assertEquals("IV", RomanNumeralsKata.convert(4));
	}

	@Test
	public void convert10ToRoman() {
		assertEquals("X", RomanNumeralsKata.convert(10));
	}

	@Test
	public void convert9ToRoman() {
		assertEquals("IX", RomanNumeralsKata.convert(9));
	}

	@Test
	public void convert11ToRoman() {
		assertEquals("XI", RomanNumeralsKata.convert(11));
	}

	@Test
	public void convert13ToRoman() {
		assertEquals("XIII", RomanNumeralsKata.convert(13));
	}

	@Test
	public void convert18ToRoman() {
		assertEquals("XVIII", RomanNumeralsKata.convert(18));
	}

	@Test
	public void convert20ToRoman() {
		assertEquals("XX", RomanNumeralsKata.convert(20));
	}

	@Test
	public void convert37ToRoman() {
		assertEquals("XXXVII", RomanNumeralsKata.convert(37));
	}

	@Test
	public void convert42ToRoman() {
		assertEquals("XLII", RomanNumeralsKata.convert(42));
	}

	@Test
	public void convert142ToRoman() {
		assertEquals("CXLII", RomanNumeralsKata.convert(142));
	}

	@Test
	public void convert582ToRoman() {
		assertEquals("DLXXXII", RomanNumeralsKata.convert(582));
	}

	@Test
	public void convert2193ToRoman() {
		assertEquals("MMCXCIII", RomanNumeralsKata.convert(2193));
	}
}
