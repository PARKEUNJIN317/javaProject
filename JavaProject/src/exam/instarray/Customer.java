package exam.instarray;

public class Customer {
	int num, age;
	String name, phoneNum, job, gender;
	
	public Customer(int num, String name, String phoneNum, String job, String gender, int age) {
		this.num = num;
		this.name = name;
		this.phoneNum = phoneNum;
		this.job = job;
		this.gender = gender;
		this.age = age;
	}
	public void showCustomerInfo() {
		System.out.print(num + " ");
		System.out.print(name + " ");
		System.out.print(phoneNum + " ");
		System.out.print(job + " ");
		System.out.print(gender + " ");
		System.out.print(age + " ");
	
	}

}
