package com.loga.day3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.loga.day3.EmployeeDetails;

class EmployeeDetailsTest {
	EmployeeDetails account;

	@BeforeEach
	void setUp() {
		account = new EmployeeDetails(1234, "John Doe", 50000,500.0);
	}
	@Test
	void testNetsalary() {
		assertEquals(69300, account.netsalary());
		
	}
	@AfterEach
	void testDown() {
		account = null;
		
	}

}
