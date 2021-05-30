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
<<<<<<< HEAD
		font= app.createFont("fonts/MINECRAFT.TTF",25);
=======
		font= app.createFont("fonts/MINECRAFT.TTF",16);
>>>>>>> f68cd12cc7763253b04daec0955389b516758bc4
		controller= new ControllerPirateChase(app);
		controller.makeMapEasy();
	}
	
	public void drawScreen() {
		app.background(0);
		app.image(easyMapBackground, 0, 0);
		controller.drawEasyMap();
		app.textFont(font);
		app.fill(0);
		app.text(controller.getUserEnergy(), 92, 51);
		app.text(controller.getMorganEnergy(), 276, 51);
	}

}
