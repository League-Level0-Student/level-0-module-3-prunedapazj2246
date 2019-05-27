
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setX(45);// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
rob.penDown();
rob.setSpeed(500);
rob.miniaturize();
for (int m = 0; m < 10; m++) {
	
rob.setAngle(0);
		for (int i = 0; i < 5; i++) {
	rob.move(30);// 2. Make the robot draw a star shape. Hint: 144.
rob.turn(144);
// 3. Set the size of the star to 30.
}
rob.penUp();
rob.setAngle(90);
	//	 Make the robot draw a line of stars like this:
	rob.move(50);
	// http://bit.ly/RobotWalk
	rob.penDown();


	}

}
}