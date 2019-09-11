package _15_amazing_rings.amazing_rings;

import org.jointheleague.graphical.robot.Robot;

public class houses {
public static void main(String[] args) {
	int a=10;
	Robot bob  = new Robot();
	bob.miniaturize();
	bob.setSpeed(100);
	bob.setX(50);
	bob.setY(500);
	bob.penDown();
	for(int i=0; i<10; i++) {
		bob.move(100);
		bob.turn(90);
		bob.move(30);
		bob.turn(90);
		bob.move(100);
		//bob.turn(180);
		//bob.move(10);
	}
	
}
}
