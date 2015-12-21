package demos;

import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;
import processing.core.PShape;

public class TestProcessing extends PApplet {
	
/**
	 * 
	 */
private static final long serialVersionUID = 1L;

PGraphics pg;
PImage photo;
PImage altPhoto;


private PShape plane;

public void setup() {
  size(720,960);
  //photo = loadImage("airplane_3x4.png");
  //altPhoto = loadImage("airplane.jpg");
  //Plane plane = new Plane();
}

public void draw() {
  //photo.resize(15, 20);
  //image(photo, 0, 0);
	//shape(plane, 50, 50);
}


/*
PShape s;
public void setup() {
	  size(640, 480);
	  noStroke();
	  
	  // The file "bot.svg" must be in the data folder
	  // of the current sketch to load successfully
	  s = loadShape("plane.svg");
	}

public void draw() {
	shape(s, 50, 50, 15, 20);
	
	}
*/

	/*
int dragX, dragY, moveX, moveY;

public void setup() {
  size(200, 200);
  noStroke();
}

public void draw() {
  background(204);
  fill(0); 
  ellipse(dragX, dragY, 33, 33); // Black circle
  
  fill(153);
  ellipse(moveX, moveY, 33, 33); // Gray circle
}

public void mouseMoved() { // Move gray circle
  moveX = mouseX;
  moveY = mouseY;
}

public void mouseDragged() { // Move black circle
  dragX = mouseX;
  dragY = mouseY;
}
*/
}
