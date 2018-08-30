package stringfunctions;

public class substring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="This is the Sample String";
        System.out.println("\n\n substring:"+s1.substring(2,5));
        
        String dob="12/08/1997";
        System.out.println("\nthis is the dob :"+dob);
        String db[]=dob.split("/");
        String day=db[0];
        String month=db[1];
        String year=db[2];;
        System.out.println("\n day :"+day);
        System.out.println("\n month :"+month);
        System.out.println("\n year :"+year);
        
	}

}
