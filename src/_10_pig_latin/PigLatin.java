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
		String jacob = english.getText();
		String jacquelyn = pig.getText();
		
		if(buttonPressed.equals(eng)) {
			String noob = translateEnglishToPigLatin(jacob);
			pig.setText(noob);
		}
		else if (buttonPressed.equals(latin)) {
			String nub = translatePigLatinToEnglish(jacquelyn);
			english.setText(nub);
		}
		}

    public static String translateEnglishToPigLatin(String s) {
        String latin = "";
        int i = 0;
        while (i < s.length()) {
            // Take care of punctuation and spaces
            while (i < s.length() && !isLetter(s.charAt(i))) {
                latin = latin + s.charAt(i);
                i++;
            }
            // If there aren't any words left, stop.
            if (i >= s.length())
                break;
            // Otherwise we're at the beginning of a word.
            int begin = i;
            while (i < s.length() && isLetter(s.charAt(i))) {
                i++;
            }
            // Now we're at the end of a word, so translate it.
            int end = i;
            latin = latin + pigWord(s.substring(begin, end));
        }
        return latin;
    }
    
    /**
     * Method to translate a pig latin to english.
     * 
     * @param s
     *            The sentence in pig latin
     * @return The english version
     */
    public static String translatePigLatinToEnglish(String s) {
        String english = "";
        
        String[] words = s.split(" ");
        
        for( String word : words ) {
            String[] hyphenSplit = word.split("-");
            String translatedWord = word;
            String punctuation = "";
            
            if( hyphenSplit.length == 2 ) {
                if( hyphenSplit[1].startsWith("ay")) {
                    // Started with a vowel
                    
                    translatedWord = hyphenSplit[0];
                } else {
                    // Started with a consonant
                    
                    translatedWord = hyphenSplit[1].substring(0, firstVowel(hyphenSplit[1])) + hyphenSplit[0];
                }
                
                // Handle punctuation at the end of a word
                int lastLetterIndex = hyphenSplit[1].length() - 1;
                
                while( !Character.isLetter(hyphenSplit[1].charAt(lastLetterIndex)) ){
                    lastLetterIndex -= 1;
                }
                
                punctuation = hyphenSplit[1].substring(lastLetterIndex + 1);
            }
            
            // Add word
            if( english.isEmpty() ) {
                english += translatedWord + punctuation;
            } else {
                english = english + " " + translatedWord + punctuation;
            }
        }
        
        return english;
    }
    
    
    /**
     * Method to test whether a character is a letter or not.
     * 
     * @param c
     *            The character to test
     * @return True if it's a letter
     */
    private static boolean isLetter(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
    }

    /**
     * Method to translate one word into pig latin.
     * 
     * @param word
     *            The word in english
     * @return The pig latin version
     */
    private static String pigWord(String word) {
        int split = firstVowel(word);
        return word.substring(split) + "-" + word.substring(0, split) + "ay";
    }

    /**
     * Method to find the index of the first vowel in a word.
     * 
     * @param word
     *            The word to search
     * @return The index of the first vowel
     */
    private static int firstVowel(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u')
                return i;
        return 0;
    }
}
