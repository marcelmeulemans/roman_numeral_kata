package com.tkh.kata.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.tkh.kata.RomanNumeralsKata;

public class RomanNumeralsKataTest {
	@Test
	public void convertIntToRoman() {
		assertEquals(RomanNumeralsKata.convert(1), "I");
	}
}
