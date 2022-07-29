package _08_calculator;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator implements ActionListener {
	
	static void add(int x,int y) {
		System.out.println(x+y);
	}
	static void sub(int x,int y) {
		System.out.println(x-y);
	}
	static void div(int x,int y) {
		System.out.println(x/y);
	}
	static void mult(int x,int y) {
		System.out.println(x*y);
	}
	

	
	public void run(){
		// TODO Auto-generated method stub
		JFrame frame = new JFrame ("Simple Calculator");
		JPanel potato = new JPanel();
		JTextField field = new JTextField("");
		field.setBounds(50, 100, 100, 80);
		potato.add(field);
		frame.setSize(1000,1000);
		JTextField hockey = new JTextField("");
		hockey.setBounds(300, 100, 100, 80);
		potato.add(hockey);
		frame.add(potato);
		frame.pack();
		frame.setSize(1000,1000);
		 frame.getContentPane().add(field);
		 frame.getContentPane().add(hockey);
		frame.pack();
		JButton addy = new JButton ("add");
		addy.setSize(50, 50);
		potato.add(addy);
		frame.setVisible(true);
		frame.add(potato);
		frame.pack();
		 addy.addActionListener(this);
		
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}