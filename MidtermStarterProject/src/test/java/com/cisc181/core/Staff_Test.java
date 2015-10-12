package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	ArrayList<Staff> StaffList = new ArrayList<Staff>();

	@Before
	public void setUp() throws Exception {
		Staff s1 = new Staff("A", "B", "C", new Date(55, 1, 1), "1 Asdf Lane", "(123)-456-7890", "asdf1@asdf.com",
				"9 to 5", 1, 10000, new Date(73, 5, 22), eTitle.COOK);
		Staff s2 = new Staff("D", "E", "F", new Date(59, 2, 14), "2 Asdf Lane", "(123)-456-7891", "asdf2@asdf.com",
				"9 to 5", 2, 20000, new Date(79, 11, 19), eTitle.JANITOR);
		Staff s3 = new Staff("G", "H", "I", new Date(80, 6, 30), "3 Asdf Lane", "(123)-456-7892", "asdf3@asdf.com",
				"9 to 5", 7, 30000, new Date(99, 3, 17), eTitle.COOK);
		Staff s4 = new Staff("J", "K", "L", new Date(67, 8, 10), "4 Asdf Lane", "(123)-456-7893", "asdf4@asdf.com",
				"9 to 5", 3, 40000, new Date(86, 4, 7), eTitle.ADMINISTRATOR);
		Staff s5 = new Staff("M", "N", "O", new Date(49, 4, 22), "5 Asdf Lane", "(123)-456-7894", "asdf5@asdf.com",
				"9 to 5", 6, 50000, new Date(70, 9, 1), eTitle.JANITOR);
				
		StaffList.add(s1);
		StaffList.add(s2);
		StaffList.add(s3);
		StaffList.add(s4);
		StaffList.add(s5);
		
	}

	@After
	public void tearDown() throws Exception {
		StaffList = null;
	}

	@Test
	public void testSalaryAverage() {
		double sum = 0;
		
		for (Staff i:StaffList){
			sum = sum + i.getSalary();
		}
		
		assertEquals((sum/StaffList.size()), 30000, 0);
	}
	
	
	@Test (expected = PersonException.class)
	public void testWrongNumber() throws PersonException{
		StaffList.get(1).setPhone("123");
		StaffList.get(1).printPhone();
		
	}
	
	@Test (expected = PersonException.class)
	public void testTooOld() throws PersonException{
		StaffList.get(1).setDOB(new Date(2, 8, 19));
		System.out.println(StaffList.get(1).getDOB());
		StaffList.get(1).printAge();
		
		
	}
}
