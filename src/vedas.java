import java.util.*;

 class Student {
  public String collegename;
  public int rollnumber;
  public	String name;
}

class vedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student  s2= new Student();
        
        s1.collegename="srkr";
        s1.rollnumber=173;
        s1.name="rangaraju penmatsa";
        s2.collegename="vishnu";
        s2.rollnumber=123;
        s2.name="rangaraju";
        
       // displaying the results
       System.out.println("this is the details of the object s1");
       System.out.println("s1.collegename ="+s1.collegename);
       System.out.println("s1.roll="+s1.rollnumber);
       System.out.println("s1.name="+s1.name+"\n\n");
       
       System.out.println("this is the details of the object s1");
       System.out.println("s2.collegename="+s2.collegename);
       System.out.println("s2.roll="+s2.rollnumber);
       System.out.println("s2.name="+s2.name);
	}

}
