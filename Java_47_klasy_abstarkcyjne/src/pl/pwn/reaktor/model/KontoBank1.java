package pl.pwn.reaktor.model;

public class KontoBank1 extends KontoBankowe {

	public KontoBank1(String nrKonta, double saldo) {
		super(nrKonta, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "KontoBank1 [getMaxDebit()=" + getMaxDebit() + ", getNrKonta()=" + getNrKonta() + ", getSaldo()="
				+ getSaldo();
	}

	@Override
	public void intrest() {
		addSaldo(getSaldo() * 0.03);
		
	}

	@Override
	public void addDebit(Double debit) {
		setMaxDebit(getMaxDebit() + debit);
		
	}

}
