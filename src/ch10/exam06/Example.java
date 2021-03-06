package ch10.exam06;

public class Example {

	public static void main(String[] args) {
		Account account = new Account();
		// String ano = "111-222-333";

		try {
			String ano = null;
			account.deposit(ano, 1000);
		} catch (NoAccountException e) {
			// System.out.println("계좌번호가 없습니다.");
			System.out.println(e.getMessage());
		}

		String ano = "111-222-333";
		try {
			account.withdraw(ano, 1000);
			account.withdraw(ano, 1000000);
		} catch (NoAccountException e) {
			System.out.println(e.getMessage());
		} catch (BalanceLackException e) {
			System.out.println(e.getMessage());
		}
	}

}
