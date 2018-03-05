package pl.pwn.reaktor.model.intrfaces;

import pl.pwn.reaktor.model.Humanoid;

public interface Phone extends Komunikacja{
	
	public void dzwoni(Humanoid humanoid);
	
	public void koniec();
	
	public void pytanie(Humanoid humanoid);
	
	public void odpowiedz(Humanoid humanoid);

}
