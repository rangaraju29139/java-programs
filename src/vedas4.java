class staticdemo{
	private static String collegeName="srkr";
	private int rollnumber;
	public staticdemo(){
		System.out.println("\n this is the default constructor of the given class");
		this.rollnumber=101;
	}
	public staticdemo(int rollnumber){
		this.rollnumber=rollnumber;
	}
	public void show(){
		
		System.out.println("\n college name="+collegeName);
		System.out.println("\n roll number="+rollnumber);
		
	}
}
class Vedas4 {

	public static void main(String[] args) {
		staticdemo s1=new staticdemo();
		staticdemo s2=new staticdemo(173);
		s1.show();
		s2.show();

	}

}
