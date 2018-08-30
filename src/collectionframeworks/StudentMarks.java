package collectionframeworks;

public class StudentMarks {
  private int rollNumber;
  private String name;
  private int maths;
  private int physics;
  private int chemistry;
  public StudentMarks(){
	  rollNumber=-1;
	  name = "_";
	  maths=0;
	  physics=0;
	  chemistry=0;
	  
  }
  public StudentMarks(int rollNumber,String name,int maths,int physics,int chemistry){
	  this.rollNumber=rollNumber;
	  this.name = name;
	  this.maths=maths;
	  this.physics=physics;
	  this.chemistry=chemistry;
	  
  }
  public void show(){
	  System.out.println("\n rollNumber="+this.rollNumber);
	  System.out.println("\tname="+this.name);
	  System.out.println("\t maths="+this.maths);
	  System.out.println("\t physics="+this.physics);
	  System.out.println("\t Chemistry="+this.chemistry);
  }

}
