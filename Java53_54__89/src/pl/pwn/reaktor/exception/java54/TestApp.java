package pl.pwn.reaktor.exception.java54;

import java.util.Random;

public class TestApp {

	public static void main(String[] args) {
		
		Random gen = new Random();
		int i= gen.nextInt(3);
		
		TestApp test = new TestApp();
		
		try {
			test.generateMyExc(i);
		} catch (MyExc1 e) {
			e.printStackTrace();
		} catch (MyExc2 e) {
			e.printStackTrace();
		} catch (MyExc3 e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Wyj¹tek niekontrolowany");
		}

		
	}
	
	void generateMyExc(int i)  throws MyExc1, MyExc2, MyExc3 { 
		
		if (i==0) {
			throw new MyExc1();
		}
		if (i==1) {
			throw new MyExc2();
			
		}
		if (i==3){
			throw new MyExc3();
		}
		throw new NullPointerException();
	}
}
