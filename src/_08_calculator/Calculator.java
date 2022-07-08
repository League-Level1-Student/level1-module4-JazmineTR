package _08_calculator;

import javax.swing.*;
public class Calculator {

		
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
		JTextField field = new JTextField("Integer #1");
		field.setBounds(50, 100, 100, 80);
		frame.add(field);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(1000,1000);
		JTextField hockey = new JTextField("Integer #2");
		hockey.setBounds(300, 100, 100, 80);
		frame.add(hockey);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(1000,1000);
		 frame.getContentPane().add(field);
		 frame.getContentPane().add(hockey);
		frame.pack();
		/* JButton addy = new JButton ("add");
		addy.setSize(50, 50);
		frame.add(addy);
		frame.pack();
		*/
}

}