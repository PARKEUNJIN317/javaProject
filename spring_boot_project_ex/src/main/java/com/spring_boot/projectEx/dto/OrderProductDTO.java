package com.spring_boot.projectEx.dto;

public class OrderProductDTO {
	private String ordNo;
	private String prdNo;
	private int ordQty;
	private String ordRcvReceiver;
	private String ordPay;
	
	
	
	
	public String getOrdRcvReceiver() {
		return ordRcvReceiver;
	}
	public void setOrdRcvReceiver(String ordRcvReceiver) {
		this.ordRcvReceiver = ordRcvReceiver;
	}
	public String getOrdPay() {
		return ordPay;
	}
	public void setOrdPay(String ordPay) {
		this.ordPay = ordPay;
	}
	public String getOrdNo() {
		return ordNo;
	}
	public void setOrdNo(String ordNo) {
		this.ordNo = ordNo;
	}
	public String getPrdNo() {
		return prdNo;
	}
	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}
	public int getOrdQty() {
		return ordQty;
	}
	public void setOrdQty(int ordQty) {
		this.ordQty = ordQty;
	}
	
	
}