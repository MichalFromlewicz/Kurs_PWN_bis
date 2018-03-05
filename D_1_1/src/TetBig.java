import java.math.BigDecimal;
import java.math.BigInteger;

public class TetBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BigInteger bI = new BigInteger("712564561245764576421");
		//BigInteger bIFL = BigInteger.valueOf(8727238756872653l);
		//System.out.println(bI);
		//BigInteger sumaBI = bI.add(bIFL);
		//System.out.println(bI);
		//System.out.println(bIFL);
		//System.out.println(sumaBI);
		
		BigInteger bI1 = new BigInteger("182648716428716426414");
		BigInteger bI2 = new BigInteger("980989452576438768764");
		
		BigInteger a = bI1.add(bI2);
		System.out.println(a);
		
		a = bI1.subtract(bI2);
		System.out.println(a);
		
		a = bI1.multiply(bI2);
		System.out.println(a);
		
		a = bI1.divide(bI2);
		System.out.println(a);
		
		BigDecimal bdI1 = new BigDecimal("182648716428716426414");
		BigDecimal bdI2 = new BigDecimal("980989452576438768764");
		
		BigDecimal x = bdI1.add(bdI2);
		System.out.println(x);
		
		x = bdI1.subtract(bdI2);
		System.out.println(x);
		
		x = bdI1.multiply(bdI2);
		System.out.println(x);
		
		x = bdI1.divide(bdI2, 4, BigDecimal.ROUND_HALF_UP);
		System.out.println(x);
		
		
		
	}

}
