/**
 * Desc : Calculating the duration between current date and date provided in days, months and years.
 * @author Aman Soni
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateAssignment {

	public static void main(String[] args) {
		printDuration("14-10-2014");

	}
	/*
	 * A method to accept date.
	 * Print the duration in days, months and years with regards to current system date.
	 */
	public static void printDuration(String date) {
		LocalDate dateReceived = LocalDate.parse(date,DateTimeFormatter.ofPattern("dd-MM-uuuu"));
		LocalDate currentDate = LocalDate.now();
		Period dateDuration = Period.between(dateReceived,currentDate);
		System.out.println("Duration is: "+ dateDuration.getDays() + " days, " + dateDuration.getMonths() + " months and " + dateDuration.getYears() + " years");
	}

}
