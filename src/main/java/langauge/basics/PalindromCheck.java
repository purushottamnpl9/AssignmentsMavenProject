package langauge.basics;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PalindromCheck {

	public static void Assignment15Palindrome() {

		String str = "madam";
		String rev = "";

		for (int i = str.length()-1; i >=0; i--) {

			rev = rev + str.charAt(i);
			
		}
		if(rev.equals(str)) {
			
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not A Palindrome");
		}
		
		System.out.println(rev);
	}

	public static void main(String[] args) {

	PalindromCheck pali= new PalindromCheck();
		
	pali.Assignment15Palindrome();
           
	}

}
