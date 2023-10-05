package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int birdx=55;
    int birdy=33;
    int velocity=-10;
    int gravity=1;
    int pipex=757;
    float uppery=random(100,529);
    int gap=127;
    float lowery=uppery+gap;
    int score=0;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
    	flap();
        pipes();
    	background(100, 192, 201);
    	fill(0, 0, 0);
    	ellipse(birdx, birdy, 10, 10);
    	birdy+=2;
    	fill(106,197,119);
    	rect(0,529,800,71);
    	fill(139, 207, 106);
    	stroke(104,172,71);
    	rect(pipex,0,43,uppery);
    	pipex-=2;
    	rect(pipex,lowery,43,lowery);
    	
    	}
    public void flap() {
    	if(keyPressed||mousePressed) {
    		birdy-=5;
    	}
    }
    public void pipes() {
    	if(pipex<=-26) {
    		pipex=800;
    	}
    }
   boolean death() {
	   if(birdy>=529) {
		   return true; }
	   else if (birdy < uppery && birdx > pipex && birdx < (pipex+43)){
           return true; }
       else if (birdy>lowery && birdx > pipex && birdx < (pipex+43)) {
           return true; }
       else { return false; }
   }
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
