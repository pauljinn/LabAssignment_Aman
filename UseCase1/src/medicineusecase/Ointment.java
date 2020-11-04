package medicineusecase;

/**
 * A child class to provided functionalities to ointment a type of medicine.
 * @author Aman Soni
 *
 */
public class Ointment extends Medicine{
	/**
	 * Initialize ointment a type of medicine.
	 */
	public Ointment() {
		super();
	}

	/**
	 * Initialize ointment with provided fields.
	 * @param medicineName
	 * @param medicinePrice
	 * @param compName
	 * @param expiryDate
	 */
	public Ointment(String medicineName, Double medicinePrice, String compName, String expiryDate) {
		super(medicineName, medicinePrice, compName, expiryDate);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Display extra information related to Ointment.
	 */
	@Override
	public void dispMedicineInfo() {
		System.out.print("Ointment");
		super.dispMedicineInfo();
		System.out.println("\nFor external use only\n");
	}
}
