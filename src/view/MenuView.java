package view;

import processing.core.PApplet;
import processing.core.PConstants;

public class MenuView {

	private PApplet app;
	private String message;
	
	public MenuView(PApplet app) {
		this.app = app; 
		this.message = null;
	}
	
	public void drawScreen() {
		app.background(0);
		app.fill(255);
		
		app.textAlign(PConstants.CENTER);
		app.textSize(40);
		message = "Bienvenido al menu";
		
		app.text(message, 400, 300);
		app.textSize(16);
	}

}
