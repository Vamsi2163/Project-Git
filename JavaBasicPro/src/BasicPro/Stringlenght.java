package BasicPro;

public class Stringlenght {

	public static void main(String[] args) {
		
		String s="(24/7 Customer Support) 08662570005"; 
		System.out.println("String length is: "+s.length());

		String  msg = "24/7 Customer Support 08662570005";
		String[] strarr = msg.split(" ");
		for (String m: strarr)
		System.out.println(m);
		String number = strarr[3];
		System.out.println("Mobile Number is : "+ number); 

	}

}
