package _11_whack_a_mole;

import java.awt.Font;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class WhackAMole {
	//int rand = new Random().nextInt(15);
	//int rank = new Random().nextInt(15);
	JFrame joe = new JFrame("Whack A Button for Fame and Glory");
	static JPanel biden = new JPanel();
	static void drawButtons() {
		for(int i=0;i<=14;i++) {
		JButton num = new JButton();
	String tums = "";
	num.setFont("Times New Roman", Font.BOLD, 50);
		biden.add(num);
		}
	}

	public void run() {
		joe.setSize(500,500);
		drawButtons();
		joe.add(biden);
		joe.setVisible(true);
		
	}
}