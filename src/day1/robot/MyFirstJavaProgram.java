package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot rob=new Robot();
for (int i = 0; i < 10; i++) {
rob.sparkle();	
rob.penDown();
rob.setPenColor(143, 034, 134);
rob.setSpeed(500);
rob.move(400);	
rob.turn(60);		
rob.move(100);		
rob.turn(90);	
rob.move(300);	
rob.move(200);	
rob.turn(80);
rob.move(300);	
rob.move(200);	
	
	}
	}
}