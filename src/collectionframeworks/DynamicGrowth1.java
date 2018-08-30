package collectionframeworks;

import java.util.*;
import java.io.*;

public class DynamicGrowth1 {
	public static void showTable(Collection collection){
		System.out.println("\n-------------------");
		System.out.println("\nObjects in the collection object");
		System.out.println("\n--------------------");
		Iterator it=collection.iterator();
		while(it.hasNext()){
			StudentMarks s=(StudentMarks)it.next();
			s.show();
		}
	}
	

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
      LinkedHashSet<StudentMarks> lhs=new LinkedHashSet<StudentMarks>();
      lhs.add(new StudentMarks(101,"rangaraju",1,2,3));
  	lhs.add(new StudentMarks(102,"penmetsa",2,3,4));
  	lhs.add(new StudentMarks(103,"adda",2,3,4));
  	  showTable(lhs);
  	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  	int choice=0;
  	do{
  		System.out.println("\n1:Storing a new Object");
  		System.out.println("\n2:Retrieving the existing object");
  		System.out.println("\n3:Exit");
  		System.out.println("\n\n Enter your choice:");
  		choice=Integer.parseInt(br.readLine());
  		switch(choice){
  		case 1:System.out.println("\n rollNumber:");
  		       int rollNumber=Integer.parseInt(br.readLine());
  		     System.out.println("\n name:");
  		     String name = br.readLine();
  		   System.out.println("\n maths:");
		       int maths=Integer.parseInt(br.readLine());
		       System.out.println("\n physics:");
  		       int physics=Integer.parseInt(br.readLine());
  		     System.out.println("\n chemistry:");
		       int chemistry=Integer.parseInt(br.readLine());
		lhs.add(new StudentMarks(rollNumber,name,maths,physics,chemistry));
		    System.out.println("\n\n Object has been saved...");
		    break;
  		case 2:showTable(lhs);
  		       break;
  		case 3:System.exit(0);
  		break;
  		default:System.out.println("\n\n you have entered an invalid choice");
  		        break;
  		     
  		     
  		}
  		
  	}while(true);
  	
  	
	}

}
