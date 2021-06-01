package view;

import controller.ControllerPirateChase;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class MediumMapView {

	private PApplet app;
	private PImage mediumMap;
	
	private PFont font;
	private ControllerPirateChase controller;
	
	public MediumMapView(PApplet app) {
		this.app = app;
		
		mediumMap= app.loadImage("images/mediumMap.jpg");
		font= app.createFont("fonts/MINECRAFT.TTF",25);
		controller= new ControllerPirateChase(app);
	}
	
	public void drawScreen() {
		app.background(0);
		app.image(mediumMap, 0, 0);
		controller.drawMediumMap();
		app.textFont(font);
		app.fill(0);
		app.text(controller.getUserEnergy(), 92, 51);
		app.text(controller.getMorganEnergy(), 276, 51);
	}

	public void clickIsland(int mouseX, int mouseY) {
		controller.clickIsland(mouseX,mouseY);
		
	}

	

}
