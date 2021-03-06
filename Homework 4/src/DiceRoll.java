import java.util.Random;

import javax.swing.*;

/**
 * A class that is used by a thread to simulate a rolled die.
 * @author Benjamin Morledge-Hampton
 * @version 1.0 1/18/2017
 */
public class DiceRoll implements Runnable {

	// The label to display the die image icon.
	private JLabel label;
	
	// Used to randomly rotate through the die faces and determine the number of rotations.
	Random rng = new Random();
	
	/**
	 * Constructor which takes the JLabel to display the die face.
	 * @param label specifies the JLabel to display the die face.
	 */
	DiceRoll(JLabel label) {
		this.label = label;
	}
	
	/**
	 * The main function of the class which simulates the die roll.
	 */
	public void run() {
		
		// Randomly assigns a number of loops from 10 to 30
		int loops = rng.nextInt(21) + 10;
		
		// Based on the number of loops, display a different die face every 100 milliseconds.
		for (int i = 0; i < loops; i++) {
			
			// Add a random die face to the JLabel as an ImageIcon.
			ImageIcon icon = new ImageIcon(Yahtzee.dice.get(rng.nextInt(6)));
			label.setIcon(icon);
			
			// Wait 100 milliseconds before continuing...
			try{
				Thread.sleep(100);
			}
			catch (Exception ex) {
				label.setText("Something went wrong...");
			}
			
		}
		
		
	}

	
	
}
