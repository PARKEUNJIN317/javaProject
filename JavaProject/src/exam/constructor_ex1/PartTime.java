package exam.constructor_ex1;

public class PartTime extends Worker {
	private int hours;
	private int unitPrice;
	
	public PartTime(String joominNo, String name, int hour, int unitPrice) {
		super(joominNo, name);
		this.hours = hour;
		this.unitPrice = unitPrice;
	}
	
	public int calculatePay() {
	    return hours * unitPrice;
	}
	
	@Override
	public String toString() {
		return super.toString()
                + "\n시급 : " + unitPrice + " 원"
                + "\n근무시간 : " + hours + " 시간"
                + "\n총지불액 : " + calculatePay() + " 원";
	}
	
	

}
