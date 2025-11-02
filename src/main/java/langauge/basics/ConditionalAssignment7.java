package langauge.basics;

public class ConditionalAssignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String custName= "John Doe";
		int creditScore =720;
		float income=55000.0f;
		Boolean employmentStatus=true;
		float dti = 35.0f;
		
		if (creditScore>750) {
			System.out.println("Loan is Automatically Approved");
		}
			
		else if(creditScore>650 && creditScore<750) {
			
			if(income>=50000) {
				
				if(employmentStatus=true) {
					
					if(dti<40) {
						System.out.println("loan is approved");
					}
					
					if (dti>=40) {
						System.out.println("Loan is denied");
					
					 if(creditScore<650) {
							
							System.out.println("Loan is Denied");
						}
					}

			}}}}}

