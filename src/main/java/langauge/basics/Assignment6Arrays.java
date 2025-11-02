package langauge.basics;

public class Assignment6Arrays {

	public static void main(String[] args) {

		String studentNames[] = { "Suresh", "Mahesh", "Naresh" };
		int studentMarks[] = { 75, 80, 82 };

		for (int i = 0; i < studentNames.length; i++) {

			for (int j = 0; j < studentMarks.length; j++) {
				if (studentNames[i] == "Suresh") {
					studentMarks[j] = studentMarks[j] + 10;
				} else if (studentNames[i] == "Mahes") {
					studentMarks[j] = studentMarks[j] + 10;
				} else if (studentNames[i] == "Naresh") {
					studentMarks[j] = studentMarks[j] + 10;
				}

				System.out.println(studentNames[j] + " Updated Marks: " + studentMarks[j]);
				int updatedMarks = studentMarks[j];

				System.out.println(updatedMarks);

				int averageMarks = updatedMarks / studentNames.length;
				for (int k = 0; k < studentNames.length; k++) {

					System.out.println(studentNames[i] + " Average Marks: " + averageMarks);
					break;
				}

			}
			break;

		}

	}
}
