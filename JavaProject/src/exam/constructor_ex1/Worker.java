package exam.constructor_ex1;

public class Worker {
	private String joominNo;
	private String name;
	
	public Worker(String joominNo, String name) {
		this.joominNo = joominNo;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return joominNo + "\t|" + name ;
	}

}
