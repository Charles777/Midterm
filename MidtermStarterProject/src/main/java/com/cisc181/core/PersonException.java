package com.cisc181.core;

import java.util.Calendar;

public class PersonException extends Exception
{
		private Person peep;
	   
	   public PersonException(Person peep)
	   {
	      this.peep = peep;
	      
	   } 
	 
	   public int getAge() {
			Calendar today = Calendar.getInstance();
			Calendar birthDate = Calendar.getInstance();

			int age = 0;
			birthDate.setTime(this.peep.getDOB());
			if (birthDate.after(today)) {
				throw new IllegalArgumentException("Can't be born in the future");
			}
			age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

			// If birth date is greater than todays date (after 2 days adjustment of
			// leap year) then decrement age one year
			if ((birthDate.get(Calendar.DAY_OF_YEAR)
					- today.get(Calendar.DAY_OF_YEAR) > 3)
					|| (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH))) {
				age--;

				// If birth date and todays date are of same month and birth day of
				// month is greater than todays day of month then decrement age
			} else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH))
					&& (birthDate.get(Calendar.DAY_OF_MONTH) > today
							.get(Calendar.DAY_OF_MONTH))) {
				age--;
			}

			return age;

		}
	   
	   public String getPhoneNumber(){
		   
		   return this.peep.getPhone();
		   
	   }
}
