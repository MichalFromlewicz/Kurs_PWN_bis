
public class TestComputer {

	public static void main(String[] args) {
		
		Computer compIntel = new Computer();
		compIntel.processor = "IntelI5";
		compIntel.memory = 10000;
		compIntel.printInfo();
		
		ComputerUpgrade upgrade = new ComputerUpgrade();
		upgrade.addMemory(compIntel, 4096);
		compIntel.printInfo();
		
		Computer compAMD = new Computer("AMD", 1024);
		compAMD.printInfo();
		
	}
}
