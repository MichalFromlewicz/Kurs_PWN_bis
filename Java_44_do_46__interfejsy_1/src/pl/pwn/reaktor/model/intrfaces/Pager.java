package pl.pwn.reaktor.model.intrfaces;

public interface Pager {
	
	public String sendSMS();
	
	public String getSMSM();
	
	public void rozmawia();
	
	default String getDeafaultNumber() {
		return "987123654";
	}

}
