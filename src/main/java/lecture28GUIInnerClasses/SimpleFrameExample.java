package lecture28GUIInnerClasses;

import java.awt.*;
import javax.swing.*;

public class SimpleFrameExample {
	public static void main(String[] args) {
		JFrame fr = new JFrame("Welcome window");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setPreferredSize(new Dimension(500, 500));
		fr.pack();
		fr.setVisible(true);
	}
}
