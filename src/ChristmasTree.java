
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    
 ******************************************************************************/

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class ChristmasTree {

	Robot rob = new Robot("mini");

	public static void main(String[] args) {

		ChristmasTree ohChristmasTree = new ChristmasTree();
		ohChristmasTree.setup();
		ohChristmasTree.drawStar();
		ohChristmasTree.drawTreeBody();
		ohChristmasTree.drawTreeTrunk();
		
	}

	double treeWidth = 16;
	double scale = 1.1; // This is how much the width of the tree increases with each layer down

	void drawTreeBody() {
		rob.setSpeed(100);
		rob.penDown();
		rob.setPenWidth(12);
		// 8. Change the color of the line the robot draws to forest green
		rob.setPenColor(new Color(32, 102, 17));

		// 1. Make a variable for turnAmount and set it to 175
		int turnAmount = 175;

		// 2. Start the Robot facing to the right
		rob.setAngle(90);

		// 5. Repeat steps 3 through 11, 11 times
		for (int i = 0; i < 11; i++) {

			// 3. Move the robot the width of the tree
			rob.move((int) treeWidth);
			// 4. Turn the robot the current turnAmount to the right
			rob.turn(turnAmount);
			// 6. Set the treeWidth to the current treeWidth times the scale
			treeWidth *= scale;
			// 7. Move the robot the width of a tree again
			rob.move((int) treeWidth);
			// 9. Turn the robot the current turn amount to the LEFT
			rob.turn(-turnAmount);
			// 10. Set the treeWidth to the current treeWidth times the scale again
			treeWidth *= scale;
			// 11. Decrease turnAmount by 1
			turnAmount -= 1;
		}
	}

	void drawTreeTrunk() {
		// 1. Move the robot half the width of the tree
		rob.move((int) (treeWidth / 2));
		// 2. Change the robot so that it is pointing straight down
		rob.setAngle(180);
		// 4. Set the pen width to the tree width divided by 10
		rob.setPenWidth((int) (treeWidth / 10));
		// 5. Change the color of the line the robot draws to brown
		rob.setPenColor(new Color(68, 51, 17));
		// 3. Move the robot a quarter the tree width
		rob.move((int) (treeWidth / 4));
	}

	void drawStar() {
		// * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a
		// star.
		rob.setPenWidth(15);
		rob.setPenColor(new Color(238, 255, 187));
		rob.setSpeed(100);
		rob.penDown();
		rob.setAngle(20);
		for (int i = 0; i < 5; i++) {
			rob.move(100);
			rob.turn(144);

		}

		rob.setAngle(90);
		rob.penUp();
		rob.move(22);
	}
void setup() {
	rob.hide();
	rob.setSpeed(1000000);
	
	
}
}

