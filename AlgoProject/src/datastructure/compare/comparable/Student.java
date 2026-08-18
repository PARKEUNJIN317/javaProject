package datastructure.compare.comparable;

// Comparable -> 객체1.compareTo(객체2)
public class Student implements Comparable<Student>{
	//age값으로 대소비교
	int age;
	int classNumber; //학급번호
	
	
	public Student(int age, int classNumber) {
		super();
		this.age = age;
		this.classNumber = classNumber;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}
	
	
	
	
}
