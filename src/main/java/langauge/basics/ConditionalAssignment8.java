package langauge.basics;

import java.util.ArrayList;
import java.util.List;

public class ConditionalAssignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int creditAmmount = 0;
		int debitAmmount = 0;
		int balanceAmmount;
		int count = 0;
		//int txn[] = { 50000, -2000, 3000, -15000, -200, -300, 4000, -3000 };
		int txn[] = new int[8];

		txn[0] = 50000;
		txn[1] = -2000;
		txn[2] = 3000;
		txn[3] = -15000;
		txn[4] = -200;
		txn[5] = -300;
		txn[6] = 4000;
		txn[7] = -3000;

		List<Integer> negativeList = new ArrayList<Integer>();
		List<Integer> positiveList = new ArrayList<Integer>();
		for (int num : txn) {
			if (num < 0) {
				negativeList.add(num);
				debitAmmount = debitAmmount + num;
			} else if (num > 0) {
				positiveList.add(num);
				creditAmmount = creditAmmount + num;
			}
			if (num > 10000) {

				count++;
				System.out.println("Transactions Greater than 10000: " + count);
				System.out.println("Suspecious Transaction Ammount" + num);

			}

		}
		balanceAmmount = creditAmmount + debitAmmount;
		System.out.println("BalanceAmmount in Account:" + balanceAmmount);
		System.out.println("Debit Transactions List is : " + negativeList);
		System.out.println("Credit Transactions List is : " + positiveList);
		System.out.println("Total Debit Txn Ammount is :" + debitAmmount);
		System.out.println("Total Credit Txn Ammount is :" + creditAmmount);
	}

}
