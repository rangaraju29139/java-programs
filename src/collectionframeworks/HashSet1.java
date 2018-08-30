package collectionframeworks;
import java.util.HashSet;
import java.util.Iterator;
public class HashSet1 {
    public static void main(String args[])throws Exception{
    	HashSet<StudentMarks> hs =new HashSet<StudentMarks>();
    	hs.add(new StudentMarks(101,"rangaraju",1,2,3));
    	hs.add(new StudentMarks(102,"penmetsa",2,3,4));
    	hs.add(new StudentMarks(103,"adda",2,3,4));
    	
    	System.out.println("\n Retriving the collection objects from the HashSet using the foreach loop:");
    	for(StudentMarks s:hs){
    		s.show();
    	}
    	System.out.println("\n Retriving the collection objects from the HashSet using the iterator interface:");
    	Iterator it=hs.iterator();
    	while(it.hasNext()){
    		StudentMarks s=(StudentMarks)it.next();
    		s.show();
    	}
    	
    }
}
