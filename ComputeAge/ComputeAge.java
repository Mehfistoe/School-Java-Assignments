import java.util.*;
public class ComputeAge {
	
	static Scanner userInput = new Scanner(System.in);
	static int currentYear = 2014;
	static int currentMonth = 3;
	static int currentDay = 18;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int birthYear = 0;
		int birthMonth = 0;
		int birthDay = 0;
		while (true) {
			System.out.println("Enter the year you were born: ");
			birthYear = checkNumericValue();
			if (birthYear < 1800 || birthYear > currentYear) {
				System.out.println("Error: Year can't be before 1800 or after 2014.");
				continue;
			}
			System.out.println("Enter the month you were born (1-12): ");
			birthMonth = checkNumericValue();
			if (birthMonth < 1 || birthMonth > 12) {
				System.out.println("Error: Month does not exist.");
				continue;
			}
			if (birthYear == currentYear && birthMonth > currentMonth) {
				System.out.println("Liar. You don't exist yet.");
				continue;
			}
			System.out.println("Enter the day you were born: ");
			birthDay = checkNumericValue();
			if (birthDay < 1 || birthDay > 31 || birthDay > daysInMonth(birthMonth,birthYear)) {
				System.out.println("Error: Day does not exist.");
				continue;
			}
			if (birthYear == currentYear && birthMonth == currentMonth && birthDay > currentDay){
				System.out.println("Liar. You don't exist yet.");
				continue;
			}
			break;
		}
		
		int year = currentYear;
		int month = currentMonth;
		if (currentMonth < birthMonth || currentMonth == birthMonth && currentDay < birthDay){
			year--;
		}
		if (currentDay < birthDay){
			month--;
		}
		int yearsOld = year - birthYear;
		int monthsOld = month + 12*(currentYear - year) - birthMonth;
		int daysOld;
		if (currentDay > birthDay || currentDay == birthDay) {
			daysOld = currentDay - birthDay;
		}else {
			daysOld = daysInMonth(currentMonth - 1,currentYear) - (birthDay - currentDay);
		}
		String specificYears = (yearsOld != 1)?" years, ":" year, ";
		String specificMonths = (monthsOld != 1)?" months, ":" month ";
		String specificDays = (daysOld != 1)?" days old.":" day old.";
		System.out.println("You are " + yearsOld + specificYears + 
				monthsOld + specificMonths + " and " +
				daysOld + specificDays);
	}
	
	public static int checkNumericValue() {
		while (true) {
			String input = userInput.next();
			try {
				return Integer.parseInt(input);
			}
			catch (NumberFormatException e) { //part of the library
				System.out.println("That isn't a number. Try again.");
			}
		}
	}

	public static int daysInMonth(int month, int year){ 
		int days = 0; 
		switch (month) {
        	case 1: case 3: case 5:
        	case 7: case 8: case 10:
        	case 12:
        		days = 31;
        	break;
        	case 4: case 6:
        	case 9: case 11:
        		days = 30;
            break;
        	case 2:
        		if (((year % 4 == 0) && 
        				!(year % 100 == 0))
        				|| (year % 400 == 0))
                days = 29;
            else
                days = 28;
            break;
        default:
            System.out.println("Invalid month.");
            break;
    	}
		return days; 
	}
}
