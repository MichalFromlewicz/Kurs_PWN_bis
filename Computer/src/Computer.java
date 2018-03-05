
public class Computer {
	
	public String processor;
	
	public Integer memory;
	
	public Computer() {
		
	}
	

	public Computer(String processor, Integer memory) {
		super();
		this.processor = processor;
		this.memory = memory;
	}

	public void printInfo() {
		System.out.println("Procesoor: "+ processor+ ", Memory: "+ memory);
	}
		
	}
