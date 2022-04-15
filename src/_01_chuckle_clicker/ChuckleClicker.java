package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
public static void main(String[] args) {
	ChuckleClicker cookie = new ChuckleClicker();
	cookie.makeButtons();
}
public void makeButtons() {
	JFrame milk = new JFrame();
	milk.setVisible(true);
	JPanel oreo = new JPanel();
	oreo.add(nilla);
	oreo.add(ahoy);
	milk.add(oreo);
	milk.pack();
	nilla.addActionListener(this);
	ahoy.addActionListener(this);
}
JButton nilla = new JButton("joke");
JButton ahoy = new JButton("punchline");
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed.equals(nilla)) {
		JOptionPane.showMessageDialog(null, "What did the shark say when he ate the clownfish? This taste a little funny");
	}
		else {
			JOptionPane.showMessageDialog(null, "Dont mess up with Wayne / when it waynes it pours");
		}

}}
