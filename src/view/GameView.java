package view;

import processing.core.PApplet;

public class GameView {

	private PApplet app;
	
	public GameView(PApplet app) {
		this.setApp(app); 
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

}
