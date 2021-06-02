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
	/**
	 * Name: EasyMapView
	 * Constructor of EasyMapView . <br>
	 * @param app
	 */
	public EasyMapView(PApplet app) {
		this.app = app;
		
		easyMapBackground = app.loadImage("images/easyMapBackground.jpg");
		setEasyMapTemplate(app.loadImage("images/easyMapTemplate.jpg"));

		font= app.createFont("fonts/MINECRAFT.TTF",25);



		controller= new ControllerPirateChase(app);
	}
	/**
	 * Name: drawScreen
	 * Method to draw a new screen . <br>
	 */
	public void drawScreen() {
		app.background(0);
		app.image(easyMapBackground, 0, 0);
		controller.drawEasyMap();
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
	 * Name: getEasyMapTemplate
	 * Method to get Easy map template. <br>
	 * @return PImage
	 */
	public PImage getEasyMapTemplate() {
		return easyMapTemplate;
	}
	/**
	 * Name: setEasyMapTemplate
	 * Method to update easy map template. <br>
	 * @param easyMapTemplate
	 */
	public void setEasyMapTemplate(PImage easyMapTemplate) {
		this.easyMapTemplate = easyMapTemplate;
	}

}
