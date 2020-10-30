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
	/**
	 * A method to print the duration between current date and date provided in days, months and years.
	 * @param date for which duration has to be calculated.
	 */
	public static void printDuration(String date) {
		/**
		 * Parsing the date received using appropriate date formatter and creating the object of LocalDate api.
		 */
		LocalDate dateReceived = LocalDate.parse(date,DateTimeFormatter.ofPattern("dd-MM-uuuu"));
		/**
		 * Getting the current date.
		 */
		LocalDate currentDate = LocalDate.now();
		/**
		 * Finding the duration between current date and date received using Period api between method.
		 */
		Period dateDuration = Period.between(dateReceived,currentDate);
		/**
		 * Printing the duration in days, months and years.
		 */
		System.out.println("Duration is: "+ dateDuration.getDays() + " days, " + dateDuration.getMonths() + " months and " + dateDuration.getYears() + " years");
	}

}
