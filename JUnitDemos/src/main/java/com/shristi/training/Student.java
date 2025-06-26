package com.shristi.training;

import com.shristi.exceptions.InvalidMarksException;
import com.shristi.exceptions.NegativeMarksException;

public class Student {

	public int totalMarks(int mark1, int mark2, int mark3) throws NegativeMarksException, InvalidMarksException {
		if (mark1 < 0 | mark2 < 0 | mark3 < 0)
			throw new NegativeMarksException("marks should be greater than 0");
		if (mark1 > 100 | mark2 > 100 | mark3 > 100)
			throw new InvalidMarksException("marks should be less than or equal to 100");
		return mark2 + mark1 + mark3;
	}
}
