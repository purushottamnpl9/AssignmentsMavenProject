package langauge.basics;

public class Assignment10SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 12, 34, 11, 36, 87, 98, 93 };
		int temp;

		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {

				if (num[i] < num[j]) {

					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("Second largest Number is: " + num[1]);
		System.out.println("Third Largest Number is: " + num[2]);

	}

}
