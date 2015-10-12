package com.cisc181.core;
import java.util.UUID;
import com.cisc181.eNums.*;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course(){
		
	}
	
	public Course(String name, int points){
		CourseID = UUID.randomUUID();
		CourseName = name;
		GradePoints = points;
		
	}
	/**
	 * @return the courseID
	 */
	public UUID getCourseID() {
		return CourseID;
	}
	/**
	 * @param courseID the courseID to set
	 */
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return CourseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	/**
	 * @return the gradePoints
	 */
	public int getGradePoints() {
		return GradePoints;
	}
	/**
	 * @param gradePoints the gradePoints to set
	 */
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

	public eMajor getMajor() {
		return Major;
	}

	public void setMajor(eMajor major) {
		Major = major;
	}
}
