import java.io.FilterInputStream;
import java.text.BreakIterator;
import java.util.Scanner;
import java.util.Random; 

public class J38{

	public static void main(String[] args) {
// Uruchomine skanera 
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
			});

// generator zmiennej x i deklaracja pocz�tkowa a
		Random gen = new Random();
		int x = gen.nextInt(1000);
		
		int a=0;
		
		while(true) {
			try {
				System.out.print("podaj szukan� liczb�: ");
				a = rl.nextInt();
				
				if (a>x) {
					System.out.println("Poda�e� za du�� liczb�");
				} else {
						if (a<x) {
						System.out.println("Poda�e� za ma�� liczb�");
						} else {
							System.out.println("Gratulacje");
					}
				}
				
			} catch (Exception e) {
				rl.nextInt();
			}
		}
		
		
		
		
		
		/*int a=0;
		int b=0;
		int min=0;
		int max=0;
		int sred=0;
		int i =0;
		
		while(true) {
			try {
				System.out.println("podaj liczb�: ");
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
		System.out.println("Suma najwi�kszej i najmniejszej wynosi: "+(min+max));
		System.out.println("�redina wprowadzonych liczb wynosi: " + sred);
		rl.close();	*/
		
		
		
		
		
		
		
		
		
		
		}
			
}