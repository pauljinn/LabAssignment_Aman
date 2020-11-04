package exercises;

import java.util.*;

/**
 * Desc: Finding the appropriate medal for a student based on it's marks which is used to give scholarship to students.
 * @author Aman Soni
 *
 */
public class StudentMedalAssignment {
	/**
	 * Method to find the appropriate medal for eligible students based on their marks.
	 * @param studentMap a map with key as student registration number and value as marks.
	 * @return a hash map with registration number as key and medal name as value.
	 */
	public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> studentMap){
		/**
		 * Initializing an empty map to store registration number of student as key and medal received as value.
		 */
		HashMap<Integer,String> medalMap = new HashMap<Integer,String>();
		/**
		 * A set to store the registration number of all the students.
		 */
		Set<Integer> registrationNumberSet = studentMap.keySet();
		/**
		 * Looping through each registration number in the set to get the student marks from student map.
		 */
		for(Integer i: registrationNumberSet) {
			/**
			 * Checking if the student marks is greater than equal to 90.
			 */
			if(studentMap.get(i)>=90) {
				/**
				 * Assigning a gold medal to student.
				 */
				medalMap.put(i,"Gold");
			}
			/**
			 * Checking if the student marks is greater than equal to 80 and less than 90.
			 */
			else if(studentMap.get(i)>=80 && studentMap.get(i)<90) {
				/**
				 * Assigning the silver medal to student.
				 */
				medalMap.put(i,"Silver");
			}
			/**
			 * Checking if the student marks is greater than equal to 70 and less than 80.
			 */
			else if(studentMap.get(i)>=70 && studentMap.get(i)<80) {
				/**
				 * Assigning a bronze medal to student.
				 */
				medalMap.put(i, "Bronze");
			}
		}
		/**
		 * Returning the medal received by students.
		 */
		return medalMap;
	}
	/**
	 * A method to test the getStudent method.
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Creating a hash map which store student registration number and their marks.
		 */
		HashMap<Integer,Integer> studentMap = new HashMap<>();
		/**
		 * Putting some registration number and marks of students in the hash map.
		 */
		studentMap.put(1, 70);
		studentMap.put(2, 90);
		studentMap.put(3,85);
		studentMap.put(4,60);
		/**
		 * Finding the appropriate medal for student.
		 */
		HashMap<Integer,String> medalMap = getStudents(studentMap);
		/**
		 * Printing the registration number of the student who received medal.
		 */
		medalMap.forEach((Integer registrationNumber,String medal)->System.out.println("Registration number: "+registrationNumber + " "+ "Medal Received: "+medal));
		

	}

}
