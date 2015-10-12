package com.cisc181.core;

import static org.junit.Assert.*;
import java.lang.Math;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Course> CourseList = new ArrayList<Course>();
	static ArrayList<Semester> SemesterList = new ArrayList<Semester>();
	static ArrayList<Section> SectionList = new ArrayList<Section>();
	static ArrayList<Student> StudentList = new ArrayList<Student>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		Course course1 = new Course("MATH101", 4);
		Course course2 = new Course("ENGL307", 4);
		Course course3 = new Course("GEOL468", 4);
		
		CourseList.add(course1);
		CourseList.add(course2);
		CourseList.add(course3);
		
		Semester semester1 = new Semester(new Date(114, 8, 30), new Date(114, 12, 15));
		Semester semester2 = new Semester(new Date(115, 2, 5), new Date(115, 6, 4));
		
		SemesterList.add(semester1);
		SemesterList.add(semester2);
		
		for (Course c : CourseList){
			for (Semester s : SemesterList){
				SectionList.add(new Section(c.getCourseID(), s.getSemesterID(), 1));
				
			}
		}
		
		for(int i = 1; i<=10; i++){
			StudentList.add(new Student("A", "B", "C", new Date(90, 1, 1), eMajor.CHEM, 
					"1 Asdf Lane", "(123)-456-7890", "asdf1@asdf.com"));
		}
		
		
	}
				

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void test() {
		ArrayList<Enrollment> EnrollmentList = new ArrayList<Enrollment>();
		ArrayList<Double> GradeList = new ArrayList<Double>();
		double StudentGrade = 0;
		
		for(Student student : StudentList){
			for (Section section : SectionList){
				
				Enrollment e = new Enrollment(section.getSectionID(), student.getStudentID());
				e.setGrade((int)(Math.random()*100));
				EnrollmentList.add(e);
				GradeList.add(e.getGrade());
				StudentGrade = StudentGrade + e.getGrade()*4; 
				
			}
			student.PrintName();
			System.out.println("has a GPA of: " + 0.01*(int)(StudentGrade/(SectionList.size())*100));
			StudentGrade = 0;
			 
		}
		StudentList.get(1).setMajor(eMajor.NURSING);
		
	}
	
	
	

}
