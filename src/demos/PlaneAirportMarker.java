package demos;

import processing.core.*;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.geo.*;

public class PlaneAirportMarker extends SimplePointMarker {
	
	public PlaneAirportMarker(Location location){
		super(location);
		
	}
	
	public void draw(PGraphics pg, float x, float y){
		pg.pushStyle();
		pg.beginShape();
		pg.vertex(20, 0);
		pg.vertex(22, 4);
		pg.vertex(22, 12);
		pg.vertex(40, 24);
		pg.vertex(38, 26);
		pg.vertex(22, 24);
		pg.vertex(22, 36);
		pg.vertex(26, 40);
		
		pg.vertex(20, 38);
		
		pg.vertex(14, 40);
		pg.vertex(18, 36);
		pg.vertex(18, 24);
		pg.vertex(2, 26);
		pg.vertex(0, 24);
		pg.vertex(18, 12);
		pg.vertex(18, 4);
		//pg.vertex(0, 240);
		//pg.scale((float) .5);
		pg.endShape();
		pg.popStyle();
		
	}

}
