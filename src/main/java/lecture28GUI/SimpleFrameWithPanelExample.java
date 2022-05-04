package lecture28GUI;

import java.awt.*;
import javax.swing.*;

public class SimpleFrameWithPanelExample {
	public static void main(String[] args) {
		JFrame fr = new JFrame("Welcome window");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setPreferredSize(new Dimension(500, 500));
		
		// Add a JPanel to the frame, in blue color
		JPanel panel = new JPanel();
		//panel.setBackground(Color.blue);

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

		fr.getContentPane().add(panel);

		fr.pack();
		fr.setVisible(true);

	}
}
