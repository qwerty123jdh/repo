import java.util.Scanner;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		System.out.println("enter value for string");
		String name= s.next();
		System.out.println("initial value for name:-"+name);
		String conact=name.concat(", Pune");
		System.out.println("value of name after concantation:-"+conact);
		String subpart= name.substring(name.length()-5);
		System.out.println("value after finding subpart:-"+subpart);
		String lower= name.toLowerCase();
		System.out.println("value after lower case conversion:-"+lower);
		char trans= name.charAt(5);
		System.out.println("value after transformation:-"+trans);
		String newer= name.trim();
		System.out.println("new string is:-"+newer);
	}

}
