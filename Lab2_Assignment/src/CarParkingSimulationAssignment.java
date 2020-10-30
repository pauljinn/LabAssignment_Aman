/**
 * Desc : Creating a 5 story car parking system simulation.
 * @author Aman Soni
 *
 */
import java.util.Scanner;

/**
 * A class to store the details of the car like name and registration number.
 * @author Aman Soni
 *
 */
class CarDetail{
	private String name;
	private String registrationNumber;
	
	/**
	 * A method to initialize the details of the car.
	 * @param name for the name of the car.
	 * @param registrationNumber for registration number of the car.
	 */
	public CarDetail(String name, String registrationNumber) {
		this.name = name;
		this.registrationNumber = registrationNumber;
	}
	
	/**
	 * 
	 * @return the name of the car.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 
	 * @return the registration number of the car.
	 */
	public String getRegistrationNumber() {
		return this.registrationNumber;
	}
	
}

/**
 * A class for simulating the 5 story car parking.
 * @author Aman Soni
 *
 */
public class CarParkingSimulationAssignment {
	/**
	 * Method to initialize the car parking slots.
	 * Displaying Car parking menu.
	 * Choosing a option from menu.
	 * Then displaying user content according to that.
	 * @param args for passing arguments from command line.
	 */
	public static void main(String[] args) {
		
		/**
		 * Initializing the car parking slots in 5 story parking.
		 */
		CarDetail parkingSlots[][] = new CarDetail[5][];
		/**
		 * First story have 100 cars parking capacity.
		 */
		parkingSlots[0] = new CarDetail[100];
		/**
		 * Second story have 70 cars parking capacity.
		 */
		parkingSlots[1] = new CarDetail[70];
		/**
		 * Third story have 50 cars parking capacity.
		 */
		parkingSlots[2] = new CarDetail[50];
		/**
		 * Fourth story have 20 cars parking capacity.
		 */
		parkingSlots[3] = new CarDetail[20];
		/**
		 * Fifth story have 10 cars parking capacity.
		 */
		parkingSlots[4] = new CarDetail[10];
		/**
		 * A variable to store the user choice for using the car parking.
		 */
		int choice;
		/**
		 * Do while loop to  displaying the car parking menu.
		 * Taking the user's choice on the basis of menu.
		 * Performing the necessary operation based on users choice.
		 */
		do {
			/**
			 * Displaying the menu for car parking system.
			 */
			System.out.println("Welcome to 5 story car parking system");
			System.out.println("1. Park car");
			System.out.println("2. Get car");
			System.out.println("3. Get available space");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			/**
			 * Taking the choice of the user.
			 */
			Scanner in = new Scanner(System.in);
			choice = in.nextInt();
			in.nextLine();
			/**
			 * Performing the necessary operation based on user's choice.
			 */
			switch(choice) {
				/**
				 * If choice is 1 then parking the user's car.
				 */
				case 1:
					/**
					 * Taking the details of the car to park from the user.
					 */
					System.out.print("Enter the car name: ");
					String carName = in.nextLine();
					System.out.print("Enter the car registration number: ");
					String registrationNumber = in.nextLine();
					/**
					 * Creating a car object on the given details.
					 */
					CarDetail car = new CarDetail(carName,registrationNumber);
					/**
					 * Checking if the parking has done successfully by calling the appropriate method.
					 * Printing the appropriate message if parking is done successfully.
					 * Printing the appropriate message if parking is not done successfully.
					 */
					if(parkCar(parkingSlots,car)){
						System.out.println("Car is successfully parked");
					}
					else {
						System.out.println("Car parking is full");
					}
					break;
				/**
				 * Getting the car from the car parking with registration number provided by user.
				 */
				case 2:
					/**
					 * Taking the registration number from the user.
					 */
					System.out.println("Enter the registration number of car: ");
					String registrationNumberToSearch = in.nextLine();
					/**
					 * Calling the appropriate method to get the car from the parking slot with provided registration number.
					 * Storing the returned car in carSearched variable.
					 */
					CarDetail carSearched = getCar(parkingSlots,registrationNumberToSearch);
					/**
					 * Printing the details of the returned car.
					 * If carSearched is null then printing the appropriate message.
					 */
					if(carSearched==null) {
						System.out.println("No car is parked with the given registration number");
					}
					else {
						System.out.println("Car Found");
						System.out.println("Car name: "+carSearched.getName());
						System.out.println("Car registration number: "+carSearched.getRegistrationNumber());
					}
					break;
				/**
				 * Printing the total space left in the car parking.
				 */
				case 3:
					System.out.println("Total space left in the parking: "+getSpace(parkingSlots));
					break;
			}
			
		}while(choice!=4);

	}
	/**
	 * A method for parking the car in the car parking.
	 * @param parkingSlots tells about the slots available for parking at various stories.
	 * @param car to park in the parking slot.
	 * @return true if the car is successfully parked otherwise false.
	 */
	public static boolean parkCar(CarDetail[][] parkingSlots,CarDetail car) {
		/**
		 * Running the outer loop to access each story in the car parking system.
		 */
		  for(int i=0;i<parkingSlots.length;i++) {
			  /**
			   * Running this loop to access each slot inside the story.
			   */
			  for(int j=0;j<parkingSlots[i].length;j++) {
				  /**
				   * Checking if the slot is empty.
				   */
				  if(parkingSlots[i][j]==null) {
					  /**
					   * If so then parking the provided car at that slot.
					   * Returning true after success full parking.
					   */
					  parkingSlots[i][j] = car;
					  return true;
				  }
			  }
		  }
		  /**
		   * Returning false if there is no parking slot is available at all the story.
		   */
		  return false;
	}
	/**
	 * Method to unpark the car from the parking.
	 * @param parkingSlots tells about the slots inside the parking.
	 * @param registrationNumber of car to search in the parking slots.
	 * @return object of CarDetail that holds the detail of the car.
	 */
	public static CarDetail getCar(CarDetail[][] parkingSlots,String registrationNumber) {
		/**
		 * Outer loop to access each story in the parking.
		 */
		for(int i=0;i<parkingSlots.length;i++) {
			/**
			 * Inner loop to access each parking slot in the story.
			 */
			  for(int j=0;j<parkingSlots[i].length;j++) {
				  /**
				   * Checking if the slot is not empty.
				   */
				  if(parkingSlots[i][j]!=null) {
					  /**
					   * Checking if the car parked at the slot has registration number of the car searched.
					   */
					  if(parkingSlots[i][j].getRegistrationNumber().equals(registrationNumber)) {
						  /**
						   * Getting the car from that parking slot.
						   */
						  CarDetail requiredCar = parkingSlots[i][j];
						  /**
						   * Creating back the slot empty.
						   */
						  parkingSlots[i][j] = null;
						  /**
						   * Returning the car.
						   */
						  return requiredCar;
					  }
				  }
			  }
		  }
		/**
		 * If no car with specified registration number found in the parking slot then returning null.
		 */
		return null;
	}
	/**
	 * Method to return the available space in the parking.
	 * Basically counts of all the places where car is not parked.
	 * @param parkingSlots represents the parking slot in various storys.
	 * @return the total available space inside the parking.
	 */
	public static int getSpace(CarDetail[][] parkingSlots) {
		/**
		 * Kept the total car space left.
		 */
		int availableSpace = 0;
		
		/**
		 * Outer loop to access each story in the parking.
		 */
		for(int i=0;i<parkingSlots.length;i++) {
			/**
			 * Inner loop to access each parking slot in the story.
			 */
			  for(int j=0;j<parkingSlots[i].length;j++) {
				  /**
				   * If the parking slot is empty then incrementing the availableSpace counter.
				   */
				  if(parkingSlots[i][j]==null) {
					  availableSpace += 1;
				  }
			  }
		}
		return availableSpace;
	}

}
