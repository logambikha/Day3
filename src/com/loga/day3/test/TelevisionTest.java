package com.loga.day3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.loga.day3.Television;

class TelevisionTest {
	Television tv;
	
	@BeforeEach
	void setUp() {
		tv = new Television(true,155,45);
	}

	@Test
	void testIncVolume() {
		assertEquals(46,tv.incVolume());
	}
	@Test
	void testDecVolume() {
		assertEquals(44,tv.decVolume());
	}
	@Test
	void testChannel() {
		assertEquals(154,tv.channel(154));
	}
	@Test
	void testStateOfTv() {
		assertEquals(false,tv.stateOfTv());
	}
	
	@AfterEach
	void tearDown() {
		tv=null;
	}

}
