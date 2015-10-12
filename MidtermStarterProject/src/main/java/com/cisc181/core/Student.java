package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
import com.cisc181.eNums.*;

public class Student extends Person {

	private eMajor Major;
	private UUID StudentID;
	
	public eMajor getMajor ( )
    {
        return this.Major;
    }
    public void setMajor (eMajor Major)
    {
        this.Major = Major;           
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email) 
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.Major = Major;
		this.StudentID = UUID.randomUUID();
		
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
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}