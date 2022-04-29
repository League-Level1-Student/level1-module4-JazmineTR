package _03_jeopardy;


/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/* Check out the Jeopardy Handout to see what the end result should look like: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton, fifthButton;
	private JPanel quizPanel;
	private int score = 0;
	private JLabel scoreBox = new JLabel("0");
	private int buttonCount = 0;
	private Clip jeopardyThemeClip;



	public void run() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		// 1. Make the frame show up
		frame.setTitle("Jeopardy");
		// 2. Give your frame a title
		JPanel mangoes;
		mangoes = createHeader("Celebrities");
		quizPanel.add(mangoes);
		frame.add(quizPanel);
		// 3. Create a JPanel variable to hold the header using the createHeader method
		// 4. Add the header component to the quizPanel
		// 5. Add the quizPanel to the frame
		firstButton = createButton("$200");
		quizPanel.add(firstButton);
		// 6. Use the createButton method to set the value of firstButton
		// 7. Add the firstButton to the quizPanel

		// 8. Write the code to complete the createButton() method below. Check that your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.

		// 9. Use the secondButton variable to hold a button using the createButton
		// method
		secondButton = createButton("$400");
		// 10. Add the secondButton to the quizPanel
		quizPanel.add(secondButton);
		thirdButton = createButton("$600");
		quizPanel.add(thirdButton);
		fourthButton = createButton("$800");
		quizPanel.add(fourthButton);
		fifthButton = createButton("$1000");
		quizPanel.add(fifthButton);
		// 11. Add action listeners to the buttons (2 lines of code)
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		thirdButton.addActionListener(this);
		fourthButton.addActionListener(this);
		fifthButton.addActionListener(this);
		// 12. Write the code to complete the actionPerformed() method below

		// 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
		
		 /*
		 * [optional] Use the showImage or playSound methods when the user answers a
		 * question
		 */		
		
		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
	}


	private JButton createButton(String dollarAmount) {
		
		// Create a new JButton
		JButton temp = new JButton();
		temp.setText(dollarAmount);
		buttonCount++;
		// Set the text of the button to the dollarAmount

		// Increment the buttonCount (this should make the layout vertical)

		// Return your new button instead of the temporary button

		return temp;
	}

	public void actionPerformed(ActionEvent e) {
		
		// Remove this temporary message after testing:
		JButton buttonPressed = (JButton) e.getSource();
		// If the buttonPressed was the firstButton

		if(buttonPressed == firstButton) {
			askQuestion("Who is the artist of Baby featuring Ludacris?","Justin Bieber", 200);
		}
			// Call the askQuestion() method
 
		// Complete the code in the askQuestion() method. When you play the game, the score should change.
		
		// If the buttonPressed was the secondButton
		if(buttonPressed == secondButton) {
			askQuestion("Who sings Ride or Stressed Out? ","Twenty One Pilots", 400);
		}
			// Call the askQuestion() method with a harder question
		if(buttonPressed == thirdButton) {
			askQuestion("What is the name of the female singer who rescheduled her concert date in Minnesota because she had food poisoning?","Katy Perry", 600);
		}
		if(buttonPressed == fourthButton) {
			askQuestion("In which state was the singer Chris Brown born in?","Virginia", 800);
		}
		if(buttonPressed == fifthButton) {
			askQuestion("Who won an Oscar for best Actor/ Actress in the year 2013? ","Jennifer Lawrence", 1000);
		}

		
		// Clear the text on the button that was pressed (set the button text to nothing)
buttonPressed.setText("");
	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		
		// Use the playJeopardyTheme() method to play music while the use thinks of an answer
		// Remove this temporary message and replace it with a pop-up that asks the user the question
		String bieber = JOptionPane.showInputDialog(question);
		// Stop the theme music when they have entered their response. 
			
		// If the answer is correct
		if(bieber.equalsIgnoreCase(correctAnswer)) {
			score = score + prizeMoney;
			JOptionPane.showMessageDialog(null, "Ding Ding Ding! Correct!!");
		}
		else {
			score = score - prizeMoney;
			JOptionPane.showMessageDialog(null, "Wrong, it was " + correctAnswer);
		}
		updateScore();	
			// Increase the score by the prizeMoney

			// Pop up a message to tell the user they were correct

		// Otherwise

			// Decrement the score by the prizeMoney

			// Pop up a message to tell the user they were wrong and give them the correct answer

		// Call the updateScore() method

	}

	public void playJeopardyTheme() {
		String fileName = "src/_03_jeopardy/jeopardy.wav";
		// Note: use .wav files
		try {
			jeopardyThemeClip = AudioSystem.getClip();
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(fileName));
			jeopardyThemeClip.open(inputStream);
			jeopardyThemeClip.start();
		} catch (Exception e) {
			System.out.println("play sound error: " + e.getMessage() + " for " + fileName);
		}
	}

	public void stopJeopardyTheme() {
		jeopardyThemeClip.stop();

	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
