import java.util.Random;

public class J16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result;
		Random gen = new Random();
		int x = gen.nextInt(10);
		int y = gen.nextInt(10);
		System.out.println(x);
		System.out.println(y);
		result = (x>y);
		System.out.println(result);
		result = ((x*2)>y);
		System.out.println(result);
		result = (y<(x+3) && y>(x-2));
		System.out.println(result);
		result = (((x*y)%2)==0);
		System.out.println(result);
		System.out.println("------------------------");
		System.out.println(result ? "parzysty": "nieparzysty");
		
		
	}

}
