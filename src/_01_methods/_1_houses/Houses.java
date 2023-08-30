package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		// Check the recipe to find out what code to put here
				
		house();
		
		} 
	 void house() {
		Robot r = new Robot();
		r.miniaturize();
		r.setX(50);
		r.setY(250);
		r.setSpeed(10);
		r.setRandomPenColor();
		r.penDown();
		r.move(100);
		 r.penUp();
		 r.turn(90);
		 r.move(29);
		 flat();
		 r.turn(90);
		 r.penDown();
		r.move(100);
		r.penUp();
		r.turn(-90);
		r.setPenColor(12,143,7);
		r.penDown();
		r.move(20);
	 }
	 
	 void pointy() {
		 Robot r = new Robot();
		 r.penDown();
		 r.setRandomPenColor();
		 r.hide();
		 r.setX(50);
		 r.setY(150);
		 r.setSpeed(10);
		 r.turn(45);
		 r.move(20);
		 r.turn(90);
		 r.move(20);
		 r.turn(45);
	 }
	 
	 void flat() {
		 Robot r = new Robot();
		 r.setRandomPenColor();
		 r.penDown();
		 r.hide();
		 r.setX(50);
		 r.setY(150);
		 r.setSpeed(10);
		 r.turn(90);
		 r.move(29);
		 r.turn(90);
	 }
}

