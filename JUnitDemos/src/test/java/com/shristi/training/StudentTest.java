package com.shristi.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.shristi.exceptions.InvalidMarksException;
import com.shristi.exceptions.NegativeMarksException;

class StudentTest {

	Student student;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new Student();
	}

	@AfterEach
	void tearDown() throws Exception {
		student =null;
	}

	@Test
	@DisplayName("TestStudent- correct marks")
	void testTotalMarks() throws NegativeMarksException, InvalidMarksException {
		int actual = student.totalMarks(90, 80, 92);
		assertEquals(262, actual);
	}
	
	@Test
	@DisplayName("TestStudent- negative marks")
	void testNegTotalMarks()  {
		assertThrows(NegativeMarksException.class, ()->student.totalMarks(90, 80, -92));
	}
	
	@Test
	@DisplayName("TestStudent- marks greater than 100")
	void testInvalidTotalMarks()  {
		assertThrows(InvalidMarksException.class, ()->student.totalMarks(190, 80, 92));
	}

}








