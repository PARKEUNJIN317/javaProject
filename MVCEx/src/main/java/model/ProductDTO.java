package model;

public class ProductDTO {
	
	private String prdNo;
	private String prdName;
	private String prdMaker;
	private String prdColor;
	
	
	
	public ProductDTO() {}

	public ProductDTO(String prdNo, String prdName, String prdMaker, String prdColor) {
		super();
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdMaker = prdMaker;
		this.prdColor = prdColor;
	}

	public String getPrdNo() {
		return prdNo;
	}

	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public String getPrdMaker() {
		return prdMaker;
	}

	public void setPrdMaker(String prdMaker) {
		this.prdMaker = prdMaker;
	}

	public String getPrdColor() {
		return prdColor;
	}

	public void setPrdColor(String prdColor) {
		this.prdColor = prdColor;
	}
	
	
	
	

}
