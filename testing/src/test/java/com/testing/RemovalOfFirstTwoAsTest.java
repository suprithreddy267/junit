package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
class RemovalOfFirstTwoAsTest {
	/*
	 * TO-DO LIST FOR REFERENCE
	 * 1.2 chars:AA=>""        ==>Success
	 * 2.4 chars:ABCD=>BCD     ==>Success
	 *           AACD=>CD      ==>Success
	 *           BACD=>BCD     ==>Success
	 *           BBAA=>BBAA    ==>Success
	 * 3.empty string:""=>""   ==>Success
	 * 4.3 chars:AAA=>A        ==>Success
	 * 5.1 char:A=>""          ==>Success
	 * 6.n chars:ABACDEFA=>BACDEFA  ==>Success
	 * 7.5 chars:AABAA=>BAA    ==>Success
	 */
	
	
	RemovalOfFirstTwoAs removeFirst2A;
	@BeforeEach
	void createObject()
	{
		removeFirst2A=new RemovalOfFirstTwoAs();
	}
	@Test
	void test2Chars() {
		assertEquals("",removeFirst2A.remove("AA"));
	}
	@Test
	void test4Chars() {
		assertEquals("BCD",removeFirst2A.remove("ABCD"));
		assertEquals("CD",removeFirst2A.remove("AACD"));
		assertEquals("BCD",removeFirst2A.remove("BACD"));
		assertEquals("BBAA",removeFirst2A.remove("BBAA"));
	}
	@Test
	void testEmptyChars() {
		assertEquals("",removeFirst2A.remove(""));
	}
	@Test
	void test3Chars() {
		assertEquals("A",removeFirst2A.remove("AAA"));
	}
	@Test
	void test1Char() {
		assertEquals("",removeFirst2A.remove("A"));
	}
	@Test
	void testnChars() {
		assertEquals("BACDEFA",removeFirst2A.remove("ABACDEFA"));
	}
	@Test
	void test5Chars() {
		assertEquals("BAA",removeFirst2A.remove("AABAA"));
	}

}
