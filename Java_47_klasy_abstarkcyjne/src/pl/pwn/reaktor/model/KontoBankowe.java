package pl.pwn.reaktor.model;

public abstract class KontoBankowe {
	
	private String nrKonta;
	private double saldo;
	private double maxDebit = 0d;
	
	public KontoBankowe(String nrKonta, double saldo) {
		this.nrKonta = nrKonta;
		this.saldo = saldo;
	}

	public double getMaxDebit() {
		return maxDebit;
	}

	public void setMaxDebit(double maxDebit) {
		this.maxDebit = maxDebit;
	}

	public String getNrKonta() {
		return nrKonta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void printSaldo() {
		System.out.println("Obecne saldo to: "+ saldo + " z³");
	}
	
	public void addSaldo (Double wplyw) {
		this.saldo += wplyw;
	}
	
	public void subSaldo(Double wyplyw) {
		if (saldo - wyplyw < -maxDebit) {
			System.out.println("Za moa³o œrodków na koncie");
			return;
		}
		
		this.saldo -= wyplyw;
	}
	
	public abstract void intrest();
	
	public abstract void addDebit(Double debit);
}
