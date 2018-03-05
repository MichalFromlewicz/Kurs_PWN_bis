package reaktor;
import javax.swing.*;
import java.awt.event.*;

public class App3 {

	public static void main(String[] args) {
				
		JFrame frame = new JFrame("Aplikacja 3");
		JLabel l_imie = new JLabel("Imiê");
		JLabel l_nazw = new JLabel("Nazwisko");
		JLabel l_stan = new JLabel("stanowisko");
		JLabel l_wypis = new JLabel();
		JButton btn_act = new JButton("Wypisz");
		JButton btn_exit = new JButton("Wyjdz");
		JTextField tf_imie = new JTextField();
		JTextField tf_nazw = new JTextField();
		JTextField tf_stan = new JTextField();
									
		l_imie.setBounds(20,20,300,20);
		tf_imie.setBounds(20, 60,300,20);
		l_nazw.setBounds(20,100,300,20);
		tf_nazw.setBounds(20, 140,300,20);
		l_stan.setBounds(20,180,300,20);
		tf_stan.setBounds(20,220,300,20);
		l_wypis.setBounds(20,260,300,20);
		btn_act.setBounds(20,300,100,20);
		btn_exit.setBounds(140,300,100,20);
		
		// obs³uga zdarzen
		btn_act.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//co ma siê wydarzyc
				String imie = tf_imie.getText();
				String nazw = tf_nazw.getText();
				String stan = tf_stan.getText();
				l_wypis.setText(imie+" "+nazw+" ("+stan+")");
			}
		});
		
		btn_exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		frame.add(l_imie);frame.add(l_nazw);frame.add(l_stan);frame.add(l_wypis);
		frame.add(tf_imie);frame.add(tf_nazw);frame.add(tf_stan);
		frame.add(btn_act);frame.add(btn_exit);
		
		frame.setSize(400,600);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}

