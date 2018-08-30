package stringfunctions;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b=new StringBuffer("rangaraju");
		System.out.println("\nthis is the b:"+b);
		b.append(' ');
		System.out.println("\nthis is the b:"+b);
		b.append("penmetsa");
		System.out.println("\nthis is the b:"+b);
		b.reverse();
		System.out.println("\nthis is the reverse of b:"+b);
		
		String s1="This is the Sample String";
		System.out.println("\nthis is the string of s1:"+s1);
		System.out.println("\nthis is the length of s1:"+s1.length());
		
		System.out.println("\nthis is the lowercase of s1:"+s1.toLowerCase());
		String s2=s1.replace('a', '*');
		System.out.println("\nthis is the replace of * by a of s1:"+s2);
		
	}

}
