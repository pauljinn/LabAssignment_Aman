package exercises;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Desc: Finding if the people is eligible to vote or not based on their age.
 * @author Aman Soni
 *
 */
public class VoterAssignment {
	
	/**
	 * Check if the people is eligible for vote.
	 * @param peopleMap stores the id of the people as key and their date of birth as value.
	 * @return the list of id's of people who are eligible to vote.
	 */
	public static List<Integer> votersList(Map<Integer,String> peopleMap){
		/**
		 * Initializing List of the id's of the people which are eligible for vote.
		 */
		List<Integer> eligiblePersonToVote = new ArrayList<>();
		/**
		 * Looping through each id's and it's corresponding value in the people map using for each.
		 */
		peopleMap.forEach((Integer id,String dateOfBirth)->{
			/**
			 * Storing the current date.
			 */
			LocalDate currentDate = LocalDate.now();
			/**
			 * Parsing the date of birth of people using date time formatter.
			 * Pattern used for parsing date is dd-mm-yyyy i.e "20-08-2021".
			 * Storing the parsed date as local date object.
			 */
			LocalDate dob = LocalDate.parse(dateOfBirth,DateTimeFormatter.ofPattern("dd-MM-uuuu"));
			/**
			 * Finding the duration between current date and date of birth.
			 */
			Period age = Period.between(dob, currentDate);
			/**
			 * Checking if the age of the people is greater than 18.
			 */
			if(age.getYears()>18) {
				/**
				 * Adding the people id  who are eligible to vote to eligible person list.
				 */
				eligiblePersonToVote.add(id);
			}
		});
		return eligiblePersonToVote;
	}

	public static void main(String[] args) {
		/**
		 * Initializing a new hash map that store the people id and their date of birth.
		 */
		Map<Integer,String> peopleMap = new HashMap<>();
		/**
		 * Adding people to hash map.
		 */
		peopleMap.put(1,"26-08-1997");
		peopleMap.put(2, "04-11-2020");
		peopleMap.put(3, "07-11-2000");
		/**
		 * Printing the id's of the people who are eligible for voting.
		 */
		System.out.println(votersList(peopleMap));

	}

}
