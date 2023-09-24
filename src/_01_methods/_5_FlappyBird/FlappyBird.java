package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        
    }

    @Override
    public void draw() {
    	background(140, 170, 255);
    	fill(0, 0, 0);
    	stroke(0, 0, 0);
    	ellipse(12, 7, width, height);
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
