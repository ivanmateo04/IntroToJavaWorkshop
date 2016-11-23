package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot bb8=new Robot();
	
bb8.penDown();
		
bb8.setSpeed(10);
		
for (int i = 0; i < 75; i++) {
	


	bb8.setRandomPenColor();
			
	bb8.move(5*i);
			
	bb8.turn(360/7);
			
	

bb8.setPenWidth(i);
	}
}
}