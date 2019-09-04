import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses {
public static void main(String[] args) {
	
	
	Robot bob = new Robot();
	bob.miniaturize();
	bob.setSpeed(60);
	bob.penDown();
	bob.setX(20);
	bob.setY(500);
for	(int i=0; i<10; i++) {
	int h = new Random().nextInt(500-100)+100+1;
	int r = new Random().nextInt(255);
	int g = new Random().nextInt(255);
	int b = new Random().nextInt(255);
	bob.move(h);
	bob.setPenColor(r, g, b);
	bob.turn(90);
	bob.move(40);
	bob.turn(90);
	bob.move(h);
	bob.turn(270);
	bob.move(30);
	bob.turn(270);
}
    /*bob.move(150);
    bob.turn(45);
    bob.move(50);
	bob.turn(90);
	bob.move(50);
	bob.turn(45);
	bob.move(150);
	bob.turn(270);
	
	bob.move(40);
	
	bob.turn(270);
	bob.move(325); */
}
}
