package com.spring_aop.annotationex;

public class Evaluation {

	private int math;
	private int eng;
	private int kor;
	
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	
	public void showResult() {
		System.out.println("총점 = " + (math+eng+kor));
		System.out.println("평균 = " + (float)(math+eng+kor)/3);
	}
	
}
