package _04_typing_tutor;

import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing_Tutor {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		char currentLetter;

		void setup(){
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			currentLetter = generateRandomLetter();
			JLabel bond = new JLabel();
			bond.setText(""+currentLetter);
			bond.setFont(bond.getFont().deriveFont(28.0f));
			bond.setHorizontalAlignment(JLabel.CENTER);
			frame.addKeyListener((KeyListener)this);
			
		}
		char generateRandomLetter() {
		    Random r = new Random();
		    return (char) (r.nextInt(26) + 'a');
		}
}
