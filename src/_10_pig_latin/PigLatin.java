package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PigLatin implements ActionListener {
	JTextField english = new JTextField(40);
	JButton eng = new JButton(">>");
	JButton latin = new JButton("<<");
	JTextField pig = new JTextField(40);
	JButton submit = new JButton("Speak");
	public void run(){
		JFrame butch = new JFrame("Pig Latin Translator");
		JPanel zayn = new JPanel();
		butch.add(zayn);
		//English textfield added
		zayn.add(english);
		butch.add(zayn);
		butch.pack();
		//English to Pig Latin Button added
		eng.setSize(100,100);
		zayn.add(eng);
		butch.add(zayn);
		butch.pack();
		eng.addActionListener(this);
		//Latin to English button added
		latin.setSize(100,100);
		zayn.add(latin);
		butch.add(zayn);
		butch.pack();
		latin.addActionListener(this);
		//Latin textfield added
		zayn.add(pig);
		butch.add(zayn);
		butch.pack();
		//Speak button added
		submit.setSize(150, 150);
		zayn.add(submit);
		butch.add(zayn);
		butch.pack();
		submit.addActionListener(this);
		//Set frame visible
		butch.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		
	}

}
