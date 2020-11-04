package medicineusecase;
/**
 * Super class to store all the details related to medicine and provide different functionalitis.
 * @author Aman Soni
 *
 */
public class Medicine {
	/**
	 * Fields of medicine.
	 */
	private String medicineName;
	private Double medicinePrice;
	private String compName;
	private String expiryDate;
	
	/**
	 * Initialize the medicine.
	 */
	public Medicine() {
		super();
	}
	
	/**
	 * Initiailize the medicine with provided fields.
	 * @param medicineName
	 * @param medicinePrice
	 * @param compName
	 * @param expiryDate
	 */
	public Medicine(String medicineName, Double medicinePrice, String compName, String expiryDate) {
		super();
		this.medicineName = medicineName;
		this.medicinePrice = medicinePrice;
		this.compName = compName;
		this.expiryDate = expiryDate;
	}
	
	/**
	 * Display the details related to medicine.
	 */
	public void dispMedicineInfo() {
		System.out.print(toString());
	}

	@Override
	public String toString() {
		return "[medicineName=" + medicineName + ", medicinePrice=" + medicinePrice + ", compName=" + compName
				+ ", expiryDate=" + expiryDate + "]";
	}
	
	
	
	
}
