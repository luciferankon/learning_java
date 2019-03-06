package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
	
	@Test
	void shouldReturnTrueIfOneMemberIsTeen() {
		boolean hasTeen = Main.hasTeen(1,2,13);
		assertEquals(true,hasTeen);
	}
	
}