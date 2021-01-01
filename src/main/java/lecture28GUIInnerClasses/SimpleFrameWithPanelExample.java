package lecture28GUIInnerClasses;

import java.awt.*;
import javax.swing.*;

public class SimpleFrameWithPanelExample {
	public static void main(String[] args) {
		JFrame fr = new JFrame("Welcome window");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setPreferredSize(new Dimension(500, 100));
		
		// Add a JPanel to the frame, in blue color
		JPanel panel = new JPanel();
		// panel.setBackground(Color.blue);

		// Create a button
		JButton button = new JButton("Enter"); // does nothing in this example!
		// Create a label with text “Hello”:
		JLabel label = new JLabel("Enter a number: ");
		// Create a textfield
		JTextField txtF = new JTextField(5);

		// Add to the frame
		panel.add(label);
		panel.add(txtF);
		panel.add(button);
		// Note: nothing will happen when you press the button, since we don't have
		// an action listener attached to the button

		fr.add(panel);

		fr.pack();
		fr.setVisible(true);

	}
}
