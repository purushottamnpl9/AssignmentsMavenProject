package langauge.basics;

public class Assignment12String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java programming is fun and challenging";

		String[] words = str.trim().split("\\s+");

		System.out.println("Total Words: " + words.length);
		System.out.println();

		for (String upperCase : words) {

			String UpperCaseSent = upperCase.substring(0, 1).toUpperCase() + upperCase.substring(1).toLowerCase();

			System.out.print(UpperCaseSent);
		}
		System.out.println();

		String revWords[] = str.trim().split(" ");

		for (int i = revWords.length - 1; i >= 0; i--) {

			System.out.print(revWords[i] + " ");

		}

	}
}