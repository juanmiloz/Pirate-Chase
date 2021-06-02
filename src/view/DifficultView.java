package view;

import controller.ControllerPirateChase;
import processing.core.PApplet;
import processing.core.PImage;

public class DifficultView {
	
	private PApplet app;
	private PImage selectDifficulty, selectDifficultyNoob, selectDifficultyNormal, selectDifficultyPro;
	private ControllerPirateChase controllerPirateChase;
	/**
	 * Name: DifficultView
	 * Constructor of difficult view. <br>
	 * @param app
	 */
	public DifficultView(PApplet app) {
		this.app = app;
		controllerPirateChase = new ControllerPirateChase(app);
		
		selectDifficulty = app.loadImage("images/selectDifficulty.jpg");
		selectDifficultyNoob = app.loadImage("images/selectDifficultyNoob.jpg");
		selectDifficultyNormal = app.loadImage("images/selectDifficultyNormal.jpg");
		selectDifficultyPro = app.loadImage("images/selectDifficultyPro.jpg");
	}
	/**
	 * Name: drawScreen
	 * Method to draw a new screen . <br>
	 */
	public void drawScreen() {
		app.background(0);
		
		if(app.mouseX>290 && app.mouseX<520 && app.mouseY>244 && app.mouseY<318) {
			app.image(selectDifficultyNoob,0,0);
		}else if(app.mouseX>290 && app.mouseX<520 && app.mouseY>345 && app.mouseY<422){
			app.image(selectDifficultyNormal,0,0);
		}else if(app.mouseX>290 && app.mouseX<520 && app.mouseY>450 && app.mouseY<525){
			app.image(selectDifficultyPro,0,0);
		}else {
			app.image(selectDifficulty,0,0);
		}
	}
	/**
	 * Name: switchScreen
	 * Method to switch screen. <br>
	 * @return integer representing number of screen
	 */
	public int switchScreen() {
		int screen = 3;
		if(app.mouseX>290 && app.mouseX<520 && app.mouseY>244 && app.mouseY<318) {
			controllerPirateChase.makeMapEasy();
			screen = 4;
		}else if(app.mouseX>290 && app.mouseX<520 && app.mouseY>345 && app.mouseY<422){
			controllerPirateChase.makeMapMedium();
			screen = 5;
		}else if(app.mouseX>290 && app.mouseX<520 && app.mouseY>450 && app.mouseY<525){
			controllerPirateChase.makeMapHard();
			screen = 6;
		}
		
		return screen;
	}
}
