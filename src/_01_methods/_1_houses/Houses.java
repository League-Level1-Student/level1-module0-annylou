package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		// Check the recipe to find out what code to put here
		Robot r = new Robot();
		r.setX(25);
		r.setY(50);
		
		house(10);
		} 
	 void house(int a) {
		Robot r = new Robot();
		int height=100;
		r.penDown();
		r.move(height);
		r.turn(90);
		r.move(25);
		r.turn(90);
		r.move(height);
		r.penUp();
		r.turn(-90);
		r.penDown();
		r.move(15);
	}
}
