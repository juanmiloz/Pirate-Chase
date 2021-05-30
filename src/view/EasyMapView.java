package view;

import controller.ControllerPirateChase;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class EasyMapView {

	private PApplet app;
	private PImage easyMapBackground;
	private PImage easyMapTemplate;
	private PFont font;
	private ControllerPirateChase controller;
	
	public EasyMapView(PApplet app) {
		this.app = app;
		
		easyMapBackground = app.loadImage("images/easyMapBackground.jpg");
		easyMapTemplate = app.loadImage("images/easyMapTemplate.jpg");
		font= app.loadFont("fonts/MINECRAFT.TTF");
		controller= new ControllerPirateChase(app);
		controller.makeMapEasy();
		
		
	}
	
	public void drawScreen() {
		app.background(0);
		app.image(easyMapBackground, 0, 0);
		controller.drawEasyMap();
		//
	}

}
