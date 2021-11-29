package spring.core.quest4.Bank;

public interface BankAccountInterface {
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
}
