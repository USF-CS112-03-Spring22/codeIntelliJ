package lecture28GUIInnerClasses;
//********************************************************************
//  PushCounter.java       Authors: Lewis/Loftus
//
//  Demonstrates a graphical user interface and an event listener.
//********************************************************************

import java.awt.Dimension;

import javax.swing.JFrame;

public class PushCounter {
	// -----------------------------------------------------------------
	// Creates the main program frame.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		JFrame frame = new JFrame("Push Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(new PushCounterPanel());
		frame.setPreferredSize(new Dimension(300, 70));
		
		frame.pack(); //size it so that dimensions are close to preferred size
		frame.setVisible(true);
	}
}