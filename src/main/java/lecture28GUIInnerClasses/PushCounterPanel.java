package lecture28GUIInnerClasses;
//********************************************************************
//  PushCounterPanel.java       Authors: Lewis/Loftus
//
//  Demonstrates a graphical user interface and an event listener.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// The class PushCounterPanel is a child of JPanel.
// Has a button and a label
public class PushCounterPanel extends JPanel {

	private JButton pushButton;

	private int count = 0;
	private JLabel label;

	// -----------------------------------------------------------------
	// Constructor: Sets up the GUI.
	// -----------------------------------------------------------------
	public PushCounterPanel() {
		setPreferredSize(new Dimension(300, 40));
		// create a button
		pushButton = new JButton("Push Me!");
		// add the button to the panel
		add(pushButton); // calling the add method from JPanel
		// create a text label
		label = new JLabel("Pushes: " + count);
		add(label);
		
		// create a listener for the button
		ButtonListener listener = new ButtonListener();
		// "attach" the listener to the button so that it responds to button press
		pushButton.addActionListener(listener);
	}
	// *****************************************************************
	// Represents a listener for button push (action) events.
	// *****************************************************************
	private class ButtonListener implements ActionListener {
		// --------------------------------------------------------------
		// Updates the counter and label when the button is pushed.
		// --------------------------------------------------------------
		public void actionPerformed(ActionEvent event) {
			// System.out.println("Button pressed!");

			count++;
			label.setText("Pushes: " + count);

		}
	}
}
