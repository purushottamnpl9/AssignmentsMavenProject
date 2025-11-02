package langauge.basics;

public class Assignment13StringParagraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";

		String wordToFind = "Java";

		String words[] = paragraph.split("\\s+");

		int count = 0;

		System.out.print("Word: " + wordToFind + " found at index positions: ");

		for (String wordsSplit : words) {

			if (wordsSplit.equalsIgnoreCase(wordToFind)) {

				count++;
			}

		}
		System.out.println(count);

	}

}
