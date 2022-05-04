package lecture28GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JPanel {

	private JButton additionButton;
	JTextField num1Box;
	JTextField num2Box;

	private JLabel result;

	// -----------------------------------------------------------------
	// Constructor: Sets up the GUI.
	// -----------------------------------------------------------------
	public SimpleCalculator() {
		setPreferredSize(new Dimension(400, 100));

		num1Box = new JTextField(5);
		num2Box = new JTextField(5);
		add(num1Box);
		add(num2Box);

		// create a button
		additionButton = new JButton("Add");

		// create a listener for the button
		ButtonListener listener = new ButtonListener();
		// "attach" the listener to the button so that it responds to button press
		additionButton.addActionListener(listener);

		// add the button to the panel
		add(additionButton);

		// create a text label
		result = new JLabel("Result: ");
		add(result);

	}

	// *****************************************************************
	// Represents a listener for button events
	// *****************************************************************
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// get two numbers, convert them to integers, take the sum and update the label result
			// so that it shows the sum of two integers
			System.out.println("Button pressed!");
			int add = Integer.parseInt(num1Box.getText()) + Integer.parseInt(num2Box.getText());
			result.setText("Result: " + add);

		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Push Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new SimpleCalculator());
		frame.setPreferredSize(new Dimension(300, 70));

		frame.pack(); //size it so that dimensions are close to preferred size
		frame.setVisible(true);

	}
}
