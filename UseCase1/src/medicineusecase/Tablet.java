package medicineusecase;

/**
 * A child class to provided functionalities to tablet a type of medicine.
 * @author Aman Soni
 *
 */
public class Tablet extends Medicine {
	
	/**
	 * Initialize the tablet a type of medicine.
	 */
	public Tablet() {
		super();
	}

	/**
	 * Initialize the table with provided fields.
	 * @param medicineName
	 * @param medicinePrice
	 * @param compName
	 * @param expiryDate
	 */
	public Tablet(String medicineName, Double medicinePrice, String compName, String expiryDate) {
		super(medicineName, medicinePrice, compName, expiryDate);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Display extra information related to tablet.
	 */
	@Override
	public void dispMedicineInfo() {
		System.out.print("Tablet");
		super.dispMedicineInfo();
		System.out.println("\nStore in cool and dry place\n");
	}
	
	
	

}
