package view;

import processing.core.PApplet;

public class GameView {

	private PApplet app;
	/**
	 * Name: GameView
	 * Constructor of GameView. <br>
	 * @param app
	 */
	public GameView(PApplet app) {
		this.setApp(app); 
	}
	/**
	 * Name: getApp
	 * Method to get PApplet. <br>
	 * @return
	 */
	public PApplet getApp() {
		return app;
	}
	/**
	 * Name: setApp
	 * Method to update PApplet. <br>
	 * @param app
	 */
	public void setApp(PApplet app) {
		this.app = app;
	}

}
