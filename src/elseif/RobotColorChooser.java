//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot billy = new Robot();
		billy.hide();
		for (int c = 0; c < 5;) {

			 // 1. Create a new Robot
			Random color = new Random();
			String str = JOptionPane.showInputDialog("What color would you like billy to draw with?"); // 3. Ask the
																										// user
																										// what color
																										// they
																										// would like
																										// the
																										// robot to draw

			if (str.equals("red")) {// 5. Use an if/else statement to set the pen color that the user requested
				billy.setPenColor(Color.RED);
			} else if (str.equals("orange")) {
				billy.setPenColor(Color.ORANGE);
			} else if (str.equals("yellow")) {
				billy.setPenColor(Color.YELLOW);
			} else if (str.equals("green")) {
				billy.setPenColor(Color.GREEN);
			} else if (str.equals("blue")) {
				billy.setPenColor(Color.BLUE);
			} else if (str.equals("purple")) {
				billy.setPenColor(new Color(137, 8, 252));
			} else {
				billy.setPenColor(new Color(color.nextInt(255), color.nextInt(255), color.nextInt(255)));
			}
			// 6. If the user doesn’t enter anything, choose a random color

			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			billy.setPenWidth(10);// 4. Set the pen width to 10

			billy.penDown();// 2. Make the robot draw a shape (this will take more than one line of code)
			billy.setSpeed(1000);
			for (int i = 0; i < 4; i++) {
				billy.move(100);
				billy.turn(90);
			}
			
		}
	}
}