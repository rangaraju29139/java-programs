package stringfunctions;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Case1
		String s1="Mahesh";
		String s2="Mahesh";
		if(s1.equals(s2))System.out.println("\n case1 the to Strings are equal");
		else System.out.println("\n case1 the two strings are not equal");
		
		//case2
		String s11="Mahesh";
		String s22="mahesh";
		if(s11.equals(s22))System.out.println("\n case1 the to Strings are equal");
		else System.out.println("\n case2 the two strings are not equal");
		
		//Ignoring the case
		if(s11.equalsIgnoreCase(s22))System.out.println("\n case1 the to Strings are equalsIgnoreCase");
		else System.out.println("\n case2 the two strings are not equalsIgnoreCase");
	}

}
