package com.cisc181.core;

import java.util.UUID;

public class Enrollment{
	

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	
	private Enrollment(){
		
	}
	
	public Enrollment(UUID section, UUID student){
		SectionID = section;
		StudentID = student;
		EnrollmentID = UUID.randomUUID();
		
	}

	/**
	 * @return the sectionID
	 */
	public UUID getSectionID() {
		return SectionID;
	}

	/**
	 * @param sectionID the sectionID to set
	 */
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	/**
	 * @return the studentID
	 */
	public UUID getStudentID() {
		return StudentID;
	}

	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	/**
	 * @return the enrollmentID
	 */
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	/**
	 * @param enrollmentID the enrollmentID to set
	 */
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	/**
	 * @return the grade
	 */
	public double getGrade() {
		return Grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(double grade) {
		grade = grade/100;
		if (grade<.9 && grade > .7)
			grade = grade + .1;
		
		if(grade <=.7)
			grade = grade + .05;

		if(grade <=.6)
			grade = grade + .1;

		if(grade <=.5)
			grade = grade + .2;

		
		Grade = grade;
		
	}
	
}
