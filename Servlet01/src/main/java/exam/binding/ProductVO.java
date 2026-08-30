package exam.binding;

public class ProductVO {
	private String productNo;
	private String productName;
	private String productMaker;
	private String productColor;
	
	public ProductVO() {}

	public ProductVO(String productNo, String productName, String productMaker, String productColor) {
		this.productNo = productNo;
		this.productName = productName;
		this.productMaker = productMaker;
		this.productColor =productColor;
	}

	public String getProductNo() {
		return productNo;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductMaker() {
		return productMaker;
	}

	public String getProductColor() {
		return productColor;
	}
	
	
	
	
	
	
	

}
