package stringfunctions;

public class Capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="this is the sample strING";
       String s1[]=s.split(" ");
       String capital="";
       for(int i=0;i<s1.length;i++){
    	   capital=capital+s1[i].substring(0,1).toUpperCase();
    	   capital=capital+s1[i].substring(1).toLowerCase();
       }
       System.out.println("\n Original String:"+s);
       System.out.println("\n Capitalized String:"+s);
       
	}
}
