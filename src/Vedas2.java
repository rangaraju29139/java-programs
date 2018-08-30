
class Student1{
	private String collegeName;
	public Student1(){
		System.out.println("\n this is the default constructor of the given class");
		this.collegeName="vishnu";
	}
	public Student1(String collegeName){
		this.collegeName=collegeName;
	}
	public void show(){
		System.out.println("\n college ="+this.collegeName);
		System.out.println("\n college name="+collegeName);
		
	}
}
public class Vedas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1();
		Student1 s2=new Student1("SRKR COLLEGE OF ENGINEERING");
		s1.show();
		s2.show();

	}

}
