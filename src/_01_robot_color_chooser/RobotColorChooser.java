//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		boolean drawing = true;
		Robot bob = new Robot();
		bob.setPenWidth(10);
		bob.setSpeed(50);
		bob.penDown();
		
		while (drawing) {
		// 3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color of the rainbow do you want the robot to draw?");
		// 5. Use an if/else statement to set the pen color that the user requested

		if (color.equals("blue")) {
			bob.setPenColor(Color.BLUE);
		}

		else if (color.equals("red")) {
			bob.setPenColor(Color.RED);
		}

		else if (color.equals("orange")) {
			bob.setPenColor(Color.ORANGE);
		}

		else if (color.equals("yellow")) {
			bob.setPenColor(Color.YELLOW);
		}

		else if (color.equals("green")) {
			bob.setPenColor(Color.GREEN);
		}
			
		else if (color.equals("purple")) {
			bob.setPenColor(Color.MAGENTA);
			}
		
		else {
			bob.setRandomPenColor();
		}
		
			bob.move(100);
			bob.turn(90);
			bob.move(100);
			bob.turn(90);
			bob.move(100);
			bob.turn(90);
			bob.move(100);

			
			String response = JOptionPane.showInputDialog("Would you like to play again? (yes/no)");
			if (response. equals ("no")) {
				drawing = false;
			}
		}
		}

	}
	
	// 6. If the user doesn’t enter anything, choose a random color

	// 7. Put a loop around your code so that you keep asking the user for more
	// colors & drawing them

	// 4. Set the pen width to 10

	// 2. Make the robot draw a shape (this will take more than one line of code)

