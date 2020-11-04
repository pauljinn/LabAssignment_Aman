package medicineusecase;

import java.util.Scanner;
import java.util.Random;

/**
 * Handles the user interface.
 * @author Aman Soni
 *
 */
public class MedicineClient {

	public static void main(String[] args) {
		/**
		 * Asking user.
		 */
		System.out.print("How many medicines you want: ");
		Scanner in = new Scanner(System.in);
		int numberOfMedicine = in.nextInt();
		in.nextLine();
		/**
		 * Initializing a medicine list to kept all medicine user want.
		 */
		Medicine medicineList[] = new Medicine[numberOfMedicine];
		/**
		 * Initializing random number generator.
		 */
		Random r = new Random();
		/**
		 * Looping on number of medicine user want.
		 */
		for(int i=0;i<numberOfMedicine;i++) {
			/**
			 * Generating a random number between 1 and 3.
			 */
			int medicineNumber = r.nextInt(3)+1;
			/**
			 * Based on random number adding specific medicine to medicine list.
			 */
			if(medicineNumber==1) {
				/**
				 * Taking the tablet information from the user.
				 */
				System.out.print("Enter the name of the tablet: ");
				String tabletName = in.nextLine();
				System.out.print("Enter the price of tablet: ");
				double tabletPrice = in.nextDouble();
				in.nextLine();
				System.out.print("Enter the company name of tablet: ");
				String tabletCompanyName = in.nextLine();
				System.out.print("Enter the expiry date of tablet: ");
				String tabletExpiryDate = in.nextLine();
				/**
				 * Creating a new tablet based on user input.
				 */
				Tablet tablet = new Tablet(tabletName,tabletPrice,tabletCompanyName,tabletExpiryDate);
				/**
				 * Adding tablet to medicine list.
				 */
				medicineList[i] = tablet;
				
			}
			else if(medicineNumber==2) {
				/**
				 * Taking the ointment information from the user.
				 */
				System.out.print("Enter the name of the ointment: ");
				String ointmentName = in.nextLine();
				System.out.print("Enter the price of ointment: ");
				double ointmentPrice = in.nextDouble();
				in.nextLine();
				System.out.print("Enter the company name of ointment: ");
				String ointmentCompanyName = in.nextLine();
				System.out.print("Enter the expiry date of ointment: ");
				String ointmentExpiryDate = in.nextLine();
				/**
				 * Creating a new ointment based on user input.
				 */
				Ointment ointment = new Ointment(ointmentName,ointmentPrice,ointmentCompanyName,ointmentExpiryDate);
				/**
				 * Adding ointment to medicine list.
				 */
				medicineList[i] = ointment;
				
			}
			else if(medicineNumber==3) {
				/**
				 * Taking the syrup information from the user.
				 */
				System.out.print("Enter the name of the syrup: ");
				String syrupName = in.nextLine();
				System.out.print("Enter the price of syrup: ");
				double syrupPrice = in.nextDouble();
				in.nextLine();
				System.out.print("Enter the company name of syrup: ");
				String syrupCompanyName = in.nextLine();
				System.out.print("Enter the expiry date of syrup: ");
				String syrupExpiryDate = in.nextLine();
				/**
				 * Creating a new syrup based on user input.
				 */
				Syrup syrup = new Syrup(syrupName,syrupPrice,syrupCompanyName,syrupExpiryDate);
				/**
				 * Adding syrup to medicine list.
				 */
				medicineList[i] = syrup;
				
			}
			
		}
		/**
		 * Displaying the details of medicine present in the medicine list.
		 */
		System.out.println("All medicine you purchased: ");
		for(Medicine m:medicineList) {
			m.dispMedicineInfo();
		}

	}

}
