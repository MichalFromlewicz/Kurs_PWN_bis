package pl.pwn.reaktor.model;

public class KontoBank2 extends KontoBankowe {

	public KontoBank2(String nrKonta, double saldo) {
		super(nrKonta, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "KontoBank2 [getMaxDebit()=" + getMaxDebit() + ", getNrKonta()=" + getNrKonta() + ", getSaldo()="
				+ getSaldo();
	}

	@Override
	public void intrest() {
		addSaldo(getSaldo() * 0.05);
		
	}

	@Override
	public void addDebit(Double debit) {
		if (getSaldo() > 1000) {
		setMaxDebit(getMaxDebit() + debit);
		}else {
			System.out.println("Za ma³o œrodków na koncie");
		}
	}

}