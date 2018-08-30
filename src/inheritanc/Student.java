package inheritanc;

public class Student{
	private int rollNumber;
	private String name;
	public Student(){
		System.out.println("this is the default constructor");
		this.name="rangaraju";
		this.rollNumber=173;
	}
	public Student(int rollNumber,String name){
		this.name=name;
		this.rollNumber=rollNumber;
	}
}