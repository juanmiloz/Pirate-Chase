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
	/**
	 * Name: HardMapView
	 * Constructor of HardMapView. <br>
	 * @param app
	 */
	public HardMapView(PApplet app) {
		this.app = app;
		
		hardMapBackground = app.loadImage("images/hardMap.jpg");
		setHardMapTemplate(app.loadImage("images/hardMapTemplate.jpg"));

		font= app.createFont("fonts/MINECRAFT.TTF",25);



		controller= new ControllerPirateChase(app);
	}
	/**
	 * Name: drawScreen
	 * Method to draw a new screen . <br>
	 */
	public void drawScreen() {
		app.background(0);
		app.image(hardMapBackground, 0, 0);
		controller.drawHardMap();
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
		return controller.clickIsland(mouseX,mouseY);
	}
	/**
	 * Name: getHardMapTemplate
	 * Method to get Hard map template. <br>
	 * @return PImage
	 */
	public PImage getHardMapTemplate() {
		return hardMapTemplate;
	}
	/**
	 * Name: setHardMapTemplate
	 * Method to update hard map template. <br>
	 * @param HardMapTemplate
	 */
	public void setHardMapTemplate(PImage hardMapTemplate) {
		this.hardMapTemplate = hardMapTemplate;
	}



}
