package com.ss.cj_day_four_asgmt_four;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineTest {

	@Test
	void testgetSlope() {
		Line l1 = new Line(1, 1, 5, 5);
		assertEquals(l1.getSlope(), 1);
		assertNotEquals(l1.getSlope(), 4);
	}
	
	@Test
	void testgetgetDistance() {
		Line l1 = new Line(1, 1, 5, 1);
		assertEquals(l1.getDistance(), 4, .0001);
		assertNotEquals(l1.getDistance(), 3, .0001);
	}
	
	@Test
	void testparallelTo() {
		Line l1 = new Line(1, 1, 5, 1);
		Line l2 = new Line(1, 5, 5, 5);
		Line l3 = new Line(1, 1, 5, 5);
		assertEquals(l1.parallelTo(l2), true);
		assertNotEquals(l1.parallelTo(l3), true);
	}

}
