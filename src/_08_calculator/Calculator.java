package _08_calculator;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator implements ActionListener {
	
	 static void add(int x,int y) {
		 String xy = String.valueOf(x+y);
	tash.setText(xy);
	}
	static void sub(int x,int y) {
		String xyx = String.valueOf(x-y);
		tash.setText(xyx);
	}
	static void div(int x,int y) {
		String xyz = String.valueOf(x/y);
		tash.setText(xyz);
	}
	static void mult(int x,int y) {
		String xy = String.valueOf(x*y);
		tash.setText(xy);
	}
	
	static JLabel tash = new JLabel ("");
	JButton addy = new JButton ("add");
	JButton sub = new JButton("subtract");
	JButton multi = new JButton("multiply");
	JButton davide = new JButton("divide");
	JTextField field = new JTextField(4);
	JTextField hockey = new JTextField(4);
	
	public void run(){
		// TODO Auto-generated method stub
		JFrame frame = new JFrame ("Simple Calculator");
		JPanel potato = new JPanel();
		potato.add(field);
		frame.setSize(1000,1000);
		potato.add(hockey);
		frame.add(potato);
		frame.pack();
		frame.setSize(1000,1000);
		frame.add(potato);
		frame.pack();
		addy.setSize(50, 50);
		potato.add(addy);
		frame.setVisible(true);
		frame.add(potato);
		frame.pack();
		 addy.addActionListener(this);
		sub.setSize(50, 50);
		potato.add(sub);
		frame.setVisible(true);
		frame.add(potato);
		frame.pack();
		 sub.addActionListener(this);
		multi.setSize(50, 50);
		potato.add(multi);
		frame.setVisible(true);
		frame.add(potato);
		frame.pack();
		 multi.addActionListener(this);
		 davide.setSize(50, 50);
			potato.add(davide);
			frame.setVisible(true);
			frame.add(potato);
			frame.pack();
			 davide.addActionListener(this);
			 potato.add(tash);
			 frame.add(potato);
			 frame.pack();
	}
		

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		String x = field.getText();
		int xint = Integer.parseInt(x);
		String y = hockey.getText();
		int yint = Integer.parseInt(y);
		if(buttonPressed.equals(addy)) {
		add(xint,yint);
		}
		if(buttonPressed.equals(sub)) {
			sub(xint,yint);
		}
		if(buttonPressed.equals(davide)) {
			div(xint,yint);
			
		}
		if(buttonPressed.equals(multi)) {
			mult(xint,yint);
		}
	}

	
	
}