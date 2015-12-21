package demos;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;
import processing.core.PImage;

public class TestApp extends PApplet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Location location = new Location(mouseX, mouseY);
	PImage photo;
	
	UnfoldingMap map;
	
	public void setup(){
		size(800, 600, OPENGL);

		map = new UnfoldingMap(this);
		map.zoomAndPanTo(2, location);
		
		MapUtils.createDefaultEventDispatcher(this, map);
		
		photo = loadImage("../data/airplane_3x4.png");
		
		//this is where I created the specific image marker for THAT location - venice will be replaced with the lastClicked
		ImageMarker imgMarker2 = new ImageMarker(location, photo);
		
		
		map.addMarkers(imgMarker2);
	}
	
	public void draw(){
		photo.resize(15, 20);
		//scale();
		map.draw();
		
	}
	

}
