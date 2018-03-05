package reaktor;
import javax.swing.*;
import java.awt.event.*;

public class App {

	public static void main(String[] args) {
		 				
		JFrame frame = new JFrame("App");
		
		JLabel l_imie = new JLabel("Imiê");
		JLabel l_nazw = new JLabel("Nazwisko");
		JLabel l_stan = new JLabel("stanowisko");
		JLabel l_mail = new JLabel("e-mail");
		JLabel l_jezyk = new JLabel("Jaki znasz jêzyk programowania?");
		JLabel l_ang = new JLabel("Wybierz poziom jezyka angielskiego?");
		JLabel l_kurs = new JLabel("Wybierz kurs programowania");
		
		JCheckBox cb_1 = new JCheckBox("Java");
		JCheckBox cb_2 = new JCheckBox("Python");
		JCheckBox cb_3 = new JCheckBox("inne");

		ButtonGroup bg1 = new ButtonGroup();
			bg1.add(rb_1);
			bg1.add(rb_2);
			bg1.add(rb_3);
					
		JComboBox cmb = new JComboBox();
			cmb.addItem("Back-end Developer");
			cmb.addItem("inny");
		
		JButton btn_act = new JButton("Wypisz");
		JButton btn_exit = new JButton("Wyjdz");
		JTextField tf_imie = new JTextField();
		JTextField tf_nazw = new JTextField();
		JTextField tf_stan = new JTextField();
		JTextField tf_mail = new JTextField();
		JTextArea ta_wynik = new JTextArea();
		
		
		
									
		l_imie.setBounds(50,20,100,20); l_jezyk.setBounds(420,20,300,20);ta_wynik.setBounds(790,20,400,300);
		tf_imie.setBounds(50, 60,150,30);cb_1.setBounds(420,60,150,20);
		l_nazw.setBounds(50,110,100,20);cb_2.setBounds(420,100,150,20);
		tf_nazw.setBounds(50, 150,150,30);cb_3.setBounds(420,140,150,20);
		l_stan.setBounds(50,200,100,20);l_ang.setBounds(420,190,300,20);
		tf_stan.setBounds(50,240,150,30);
		l_mail.setBounds(50,290,150,20);
		tf_mail.setBounds(50,330,150,30);cmb.setBounds(420,330,300,30);
		btn_act.setBounds(50,400,150,30);
		btn_exit.setBounds(420,400,150,30);
		
		
		// obs³uga zdarzen
		btn_act.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//co ma siê wydarzyc
				String imie = tf_imie.getText();
				String nazw = tf_nazw.getText();
				String stan = tf_stan.getText();
				String mail = tf_mail.getText();
				ta_wynik.setText("Dane kontaktowe\n"+imie+" "+nazw+" ("+stan+") "+mail);
			
			
			}
		});
		
		btn_exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		frame.add(l_imie);frame.add(l_nazw);frame.add(l_stan);frame.add(l_mail);frame.add(l_jezyk);frame.add(l_ang);frame.add(ta_wynik);
		frame.add(tf_imie);frame.add(tf_nazw);frame.add(tf_stan);frame.add(tf_mail);
		frame.add(cb_1);frame.add(cb_2);frame.add(cb_3);
		frame.add(cmb);
		frame.add(btn_act);frame.add(btn_exit);
		
		frame.setSize(1260,600);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
