import java.io.FilterInputStream;
import java.text.BreakIterator;
import java.util.Scanner;

public class J36{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
			});
		
		int a=0;
		int b=0;
		int min=0;
		int max=0;
		int sred=0;
		int i =0;
		
		while(true) {
			try {
				System.out.println("podaj liczbê: ");
				a = rl.nextInt();
				b += a;
				
				if(a==0) {
							
					break;
				} else {
					if (a<min || min==0) {min=a;} 
					if (a>max || max==0) {max=a;} 
					i+=1;
				}
				
				} catch (Exception e) {
					
					rl.nextLine();
				}
			
		}
		System.out.println(i);
		System.out.println(min  +"  "+max);
		sred = b/i;
		System.out.println("suma podanych liczb wynosi: " + b);
		System.out.println("Suma najwiêkszej i najmniejszej wynosi: "+(min+max));
		System.out.println("Œredina wprowadzonych liczb wynosi: " + sred);
		rl.close();	
		}
			
}