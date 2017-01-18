import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

/**
 * A "Yahtzee" program which allows the user to roll 5 dice and receive random results.
 * @author Benjamin Morledge-Hampton
 * @version 1.0 1/18/2017
 */
public class Yahtzee extends JComponent implements ActionListener{

	// The images of the 6 die faces.
	static ArrayList<Image> dice;
	
	// The labels for the dice to be displayed on.
	private JLabel[] labels;
	
	// The threads to roll the dice.
	private DiceRoll[] threads;
	
	// The frame and button necessary to display and roll the dice.
	private JFrame frame;
	private JButton roll;
	
	/**
	 * Pretty basic constructor which just calls init.
	 */
	Yahtzee() {init();}
	
	/**
	 * Initializes everything.
	 */
	private void init() {
		
		// Set up the JFrame.
		frame = new JFrame();
		frame.setSize (1000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		setLayout(new FlowLayout());
		frame.add(this);
		
		// Load all of the dice into the array
		dice = new ArrayList<Image>();
		
		dice.add(loadImage("resource/1 Die.png", 100, 100));
		dice.add(loadImage("resource/2 Die.png", 100, 100));
		dice.add(loadImage("resource/3 Die.png", 100, 100));
		dice.add(loadImage("resource/4 Die.png", 100, 100));
		dice.add(loadImage("resource/5 Die.png", 100, 100));
		dice.add(loadImage("resource/6 Die.png", 100, 100));
		
		// Initialize the labels and threads.
		labels = new JLabel[5];
		threads = new DiceRoll[5];
		
		for (int i = 0; i < 5; i++) {
			labels[i] = new JLabel();
			threads[i] = new DiceRoll(labels[i]);
			add(labels[i]);
		}
		
		// Initialize the roll button.
		roll = new JButton("Roll");
		roll.addActionListener(this);
		add(roll);
		
		frame.setVisible(true);
		
	}
	
	/**
	 *  Gets all the threads moving to roll the dice!
	 */
	private void roll() {
		
		System.out.println("We're Rolling!");
		
		for (int i = 0; i < 5; i++) {
			Thread t = new Thread(threads[i]);
			t.start();
		}
		
	}

	/**
	 * Loads an image with the given parameters.
	 * @param fileLocation specifies the file location to find the image file at.
	 * @param width specifies the width of the file in pixels.
	 * @param height specifies the height of the file in pixels.
	 * @return the loaded image.
	 */
	private Image loadImage(String fileLocation, int width, int height) {
		// Load the image.
		Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource(fileLocation));
		// Scale the image.
		image = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		// Return the image.
		return image;
	}
	
	/**
	 * The main function which just creates a Yahtzee object.
	 * @param args specifies potential arguments to be passed to the program.
	 */
	public static void main(String[] args) {
		// Create that Yahtzee object!
		@SuppressWarnings("unused")
		Yahtzee y = new Yahtzee();
	}

	/**
	 * Rolls the dice when the button is pushed.
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == roll) roll();
	}
	
}
