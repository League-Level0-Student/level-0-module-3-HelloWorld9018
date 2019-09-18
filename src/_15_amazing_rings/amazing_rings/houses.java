package _15_amazing_rings.amazing_rings;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses {
public static void main(String[] args) {
		Robot bob  = new Robot();
		Robot.setWindowColor(Color.BLACK);

	bob.miniaturize();
	bob.setSpeed(100);
	bob.setX(50);
	bob.setY(500);
	bob.penDown();

	for(int i=0; i<10; i++) {
		int r = new Random().nextInt(501-100)+100;
		System.out.println(r);
		bob.setRandomPenColor();
		if (r <= 250) {
			bob.move(r);
			bob.turn(45);
			bob.move(30);
			bob.turn(90);
			bob.move(30);
			bob.turn(45);
			bob.move(r);
			bob.turn(-90);
			bob.setPenColor(Color.GREEN);
			bob.move(30);
			bob.turn(-90);
	 }
		else{
	
		bob.move(r);
		bob.turn(90);
		bob.move(30);
		bob.turn(90);
		bob.move(r);
		bob.turn(-90);
		bob.setPenColor(Color.GREEN);
		bob.move(30);
		bob.turn(-90);
		}
		
	}
		
}
}
