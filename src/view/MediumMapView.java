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
	/**
	 * Name: MediumMapView
	 * Constructor of MediumMapView. <br> 
	 * @param app
	 */
	public MediumMapView(PApplet app) {
		this.app = app;
		
		mediumMap= app.loadImage("images/mediumMap.jpg");
		font= app.createFont("fonts/MINECRAFT.TTF",25);
		controller= new ControllerPirateChase(app);
	}
	/**
	 * Name: drawScreen
	 * Method to draw a new screen . <br>
	 */
	public void drawScreen() {
		app.background(0);
		app.image(mediumMap, 0, 0);
		controller.drawMediumMap();
		app.textFont(font);
		app.fill(0);
		app.text(controller.getUserEnergy(), 92, 51);
		app.text(controller.getMorganEnergy(), 276, 51);
	}
	/**
	 * Name: clickIsland
	 * Method to get clicked island. <br>
	 * @param mouseX - Position click - MouseX = int
	 * @param mouseY - Position click - MouseY = int
	 * @return int[][] representing clicked island
	 */
	public int[] clickIsland(int mouseX, int mouseY) {
		return controller.clickIslandMedium(mouseX, mouseY);
	}

	

}
