package reaktor;
import javax.swing.*;
import java.awt.event.*;

public class App2 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Aplikacja 2");
		JButton btn = new JButton("Hello");
		JTextField tf = new JTextField();
		
		tf.setBounds(20,20,300,20);
		btn.setBounds(20,60,100,20);
		// obs³uga zdarzen
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//co ma siê wydarzyc
				String imie = tf.getText();
				
				tf.setText("Witaj "+imie+" na warsztacie Reaktor");
			}
		});
	
		frame.add(tf);
		frame.add(btn);
		
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
