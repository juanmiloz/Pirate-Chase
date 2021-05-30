package view;

import processing.core.PApplet;
import processing.core.PImage;

public class EasyMapBackground {

	private PApplet app;
	private PImage easyMapBackground;
	
	public EasyMapBackground(PApplet app) {
		this.app = app;
		
		easyMapBackground = app.loadImage("images/easyMapBackground.jpg");
	}
	
	public void drawScreen() {
		app.background(0);
		
		app.image(easyMapBackground, 0, 0);
	}

}
