package stringfunctions;
import java.util.*;
public class BaseConversion1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the decimal value:");
		int n=sc.nextInt();
		String binary=Integer.toBinaryString(n);
		System.out.println("\n the binary value:"+binary);
		String octal =Integer.toOctalString(n);
		String hex=Integer.toHexString(n);
		System.out.println("\nEnter the octal value:"+octal);
		System.out.println("\nEnter the hex value:"+hex);
	}

}
