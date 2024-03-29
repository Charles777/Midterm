package com.cisc181.core;
import java.util.UUID;
import java.util.Date;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester(){
		
	}
	
	public Semester(Date start, Date end){
		SemesterID = UUID.randomUUID();
		StartDate = start;
		EndDate = end;
		
		
	}

	/**
	 * @return the semesterID
	 */
	public UUID getSemesterID() {
		return SemesterID;
	}

	/**
	 * @param semesterID the semesterID to set
	 */
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return StartDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return EndDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
}
