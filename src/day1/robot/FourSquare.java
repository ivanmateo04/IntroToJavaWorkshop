package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	

	Robot vic=new Robot("vic");

	void go() {
		
vic.setSpeed(10);
vic.setPenWidth(5);
		
for (int i = 0; i < 4; i++) {
	
	
			
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
vic.turn(90);
	}

	}
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare(ivan) method!");
		vic.penDown();
		vic.setRandomPenColor();
for (int i = 0; i < 4; i++) {
	vic.move(200);
	vic.turn(90);
}
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
