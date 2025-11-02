package langauge.basics;

public class Assignment14Pattern {

	public Assignment14Pattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		
		for(int i =1; i<=n;i++) {
			
			for(int j=i;j<n;j++) {
				
				System.out.print("  ");
			}
			for (int k=1;k<=i;k++) {
				System.out.print("* ");
				
			}
			
			System.out.println();
		}
		
		
	}

}
