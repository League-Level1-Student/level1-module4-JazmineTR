package _11_whack_a_mole;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import _06_book_of_illusions.BookOfIllusions;


public class WhackAMole {
	int rand = new Random().nextInt(15);
	//int rank = new Random().nextInt(15);
	JFrame joe = new JFrame("Whack A Button for Fame and Glory");
	static JPanel biden = new JPanel();
	static void drawButtons(int rand) {
		for(int i=0;i<rand+1;i++) {
		JButton num = new JButton();
		num.setSize(100, 100 );
		biden.add(num);
		}
}
	public void run() {
		joe.setSize(500,500);
		drawButtons(13);
		joe.add(biden);
		joe.setVisible(true);
		
	}
}