package com.spring_aop.xml2;

public class Circle {
	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public void showResult() {
		double pie = 3.14;
		System.out.println("원의 둘레 : " + (2*pie*r));
		System.out.println("원의 면적 : " + (pie*r*r));
		
	}
	
	

}
