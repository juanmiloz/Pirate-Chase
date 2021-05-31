package view;

import controller.ControllerPirateChase;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class HardMapView {

	private PApplet app;
	private PImage hardMapBackground;
	private PImage hardMapTemplate;
	private PFont font;
	private ControllerPirateChase controller;
	
	public HardMapView(PApplet app) {
		this.app = app;
		
		hardMapBackground = app.loadImage("images/hardMap.jpg");
		hardMapTemplate= app.loadImage("images/hardMapTemplate.jpg");

		font= app.createFont("fonts/MINECRAFT.TTF",25);



		controller= new ControllerPirateChase(app);
		controller.makeMapHard();
	}
	
	public void drawScreen() {
		app.background(0);
		app.image(hardMapBackground, 0, 0);
		controller.drawHardMap();
		app.textFont(font);
		app.fill(0);
		app.text(controller.getUserEnergy(), 92, 51);
		app.text(controller.getMorganEnergy(), 276, 51);
	}

	public int[] clickIsland(int mouseX, int mouseY) {
		
		return controller.clickIsland(mouseX,mouseY);
	}



}
