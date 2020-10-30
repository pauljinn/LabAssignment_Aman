/**
 * Desc : Creating a two dimensional array for storing salutation and names.
 * @author Aman Soni
 *
 */
public class SalutationAndNameAssignment {

	public static void main(String[] args) {
		/**
		 * Creating a jagged array with salutation and names.
		 */
		String salutationNameArray[][] = {{"Mr.","Mrs.","Ms."},{"Prateek","Surya","Aiswarya","Rohan","Rakesh"}};
		/**
		 * Printing the correct salulation and the names as directed in question.
		 */
		System.out.println(salutationNameArray[0][0] + " " +salutationNameArray[1][0]);
		System.out.println(salutationNameArray[0][2] + " " + salutationNameArray[1][1]);
		System.out.println(salutationNameArray[0][1] + " " + salutationNameArray[1][2]);
		System.out.println(salutationNameArray[0][0] + " " + salutationNameArray[1][3]);
		System.out.println(salutationNameArray[0][0] + " " + salutationNameArray[1][4]);
	}

}
