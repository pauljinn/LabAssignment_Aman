package medicineusecase;

/**
 * A child class to provided functionalities to syrup a type of medicine.
 * @author Aman Soni
 *
 */
public class Syrup extends Medicine {
	/**
	 * Initialize the syrup a type of medicine.
	 */
	public Syrup() {
		super();
	}

	/**
	 * Initialize the syrup with provided fields.
	 * @param medicineName
	 * @param medicinePrice
	 * @param compName
	 * @param expiryDate
	 */
	public Syrup(String medicineName, Double medicinePrice, String compName, String expiryDate) {
		super(medicineName, medicinePrice, compName, expiryDate);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Display extra information related to medicine.
	 */
	@Override
	public void dispMedicineInfo() {
		System.out.print("Syrup");
		super.dispMedicineInfo();
		System.out.println("\nShake well before use\n");
	}

}
