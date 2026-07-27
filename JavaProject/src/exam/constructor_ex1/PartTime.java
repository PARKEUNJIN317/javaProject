package exam.constructor_ex1;

public class PartTime extends Worker {
	private int hour;
	private int unitPrice;
	
	public PartTime(String joominNo, String name, int hour, int unitPrice) {
		super(joominNo, name);
		this.hour = hour;
		this.unitPrice = unitPrice;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t|" + hour + "\t|" + unitPrice;
	}
	
	

}
