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
	
	public void setup(){
		
		JFrame frame = new JFrame ("Simple Calculator");
		JTextField field = new JTextField("Integer #1");
		field.setBounds(50, 100, 50, 30);
		frame.add(field);
		frame.setSize(300,300);
		frame.setVisible(true);
		JButton addy = new JButton ("add");
		frame.add(addy);
	}
	
	
}
