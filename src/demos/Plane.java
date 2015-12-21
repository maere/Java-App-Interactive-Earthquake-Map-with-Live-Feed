package demos;

import processing.core.PGraphics;
import processing.core.PShape;

public class Plane extends PGraphics {
	
	//fields
	PShape s;
	float x, y;

	//constructor
	 public Plane() {
		    // First create the shape
		   s = createShape();
		   
		    //pulled "CLOSE" from inside constructor
		   s.beginShape();
		    s.fill(0, 0, 255);
			
			s.vertex(20, 0);
			s.vertex(22, 4);
			s.vertex(22, 12);
			s.vertex(40, 24);
			s.vertex(38, 26);
			s.vertex(22, 24);
			s.vertex(22, 36);
			s.vertex(26, 40);
			
			s.vertex(20, 38);
			
			s.vertex(14, 40);
			s.vertex(18, 36);
			s.vertex(18, 24);
			s.vertex(2, 26);
			s.vertex(0, 24);
			s.vertex(18, 12);
			s.vertex(18, 4);
			//pg.vertex(0, 240);
			//pg.scale((float) .5);
			s.endShape(CLOSE);
		    
		  }

	//methods
	// public void display(){
		// shape(s, x, y);
		 
	// }

	
	

}
