package extendsex.access;

public class BBB {
	public BBB() {
		AAA a = new AAA(); 
		
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1; //private접근제한
		a.field4 = 1; //protected접근제한 동일 패키지 접근가능
		
		a.method1();
		a.method2();
		a.method3(); //private접근제한
	}

}
