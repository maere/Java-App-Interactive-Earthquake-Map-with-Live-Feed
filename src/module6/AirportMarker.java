package module6;

import java.awt.Shape;
import java.util.List;

import com.jogamp.graph.geom.Vertex;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimpleLinesMarker;
import demos.Plane;
import processing.core.PConstants;
import processing.core.PGraphics;
import processing.core.PImage;
import processing.core.PShape;

/** 
 * A class to represent AirportMarkers on a world map.
 *   
 * @author Adam Setters and the UC San Diego Intermediate Software Development
 * MOOC team
 *
 */
public class AirportMarker extends CommonMarker {
	
	public static List<SimpleLinesMarker> routes;
	public PImage photo;
	
	//public PShape pIcon = new Plane();
	//public Plane plane = new Plane();
	
	
	public AirportMarker(Feature city, PImage photo) {
		super(((PointFeature)city).getLocation(), city.getProperties());
		this.photo = photo;
		
	}
	

	
	@Override
	public void drawMarker(PGraphics pg, float x, float y) {
		pg.pushStyle();
		pg.imageMode(PConstants.CORNER);
		// The image is drawn in object coordinates, i.e. the marker's origin (0,0) is at its geo-location.
		photo.resize(15, 20);
		pg.image(photo, x - 11, y - 37);
		pg.popStyle();
		
   
	}

	@Override
	public void showTitle(PGraphics pg, float x, float y) {
		 // show rectangle with title
		
		// show routes
		
		
	}
	
}


/*
 * 		//plane = pg.loadShape("plane.svg");
		//photo.resize(15, 20);
		//image(photo, 0, 0);
	    //pg.image(photo, x, y, 15, 20);
		pg.fill(0, 0, 255);
		pg.beginShape();
		pg.vertex(200, 0);
		pg.vertex(220, 40);
		pg.vertex(220, 120);
		pg.vertex(400, 240);
		pg.vertex(380, 260);
		pg.vertex(220, 240);
		pg.vertex(220, 360);
		pg.vertex(260, 400);
		
		pg.vertex(200, 380);
		
		pg.vertex(140, 400);
		pg.vertex(180, 360);
		pg.vertex(180, 240);
		pg.vertex(20, 260);
		pg.vertex(0, 240);
		pg.vertex(180, 120);
		pg.vertex(180, 40);
		//pg.vertex(0, 240);
		pg.scale((float) .05);
		pg.endShape();
			
 */

//pg.fill(0, 0, 255);
//pg.fill(11);
//pg.ellipse(x, y, 5, 5);
//pg.loadShape("plane.svg");
//pg.shape(plane, x, y);
		/*
		pg.beginShape();
		pg.vertex(20, 0);
		pg.vertex(22, 4);
		pg.vertex(22, 12);
		pg.vertex(40, 24)
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
		*/
