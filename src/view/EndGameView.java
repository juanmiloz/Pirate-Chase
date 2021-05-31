package view;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class EndGameView {

	private PApplet app;
	private PImage endGameImage,endGameExit, endGameMenu;
	private PFont font;
	
	public EndGameView(PApplet app) {
		this.app = app;
		
		this.endGameImage = app.loadImage("images/endGameImage.jpg");
		this.endGameExit = app.loadImage("images/endGameExit.jpg");
		this.endGameMenu = app.loadImage("images/endGameMenu.jpg");
		this.font= app.createFont("fonts/MINECRAFT.TTF",25);
	}
	
	public void drawScreen(String message, int minEnergy) {
		app.background(0);
		
		if(app.mouseX>193 && app.mouseX<348 && app.mouseY>461 && app.mouseY<518) {
			app.image(endGameMenu, 0, 0);
		}else if(app.mouseX>395 && app.mouseX<570 && app.mouseY>461 && app.mouseY<518){
			app.image(endGameExit, 0, 0);
		}else {
			app.image(endGameImage, 0, 0); 
		}
		
		app.fill(0);
		if(message.equalsIgnoreCase("you win!")) {
			app.textFont(font,83);
			app.text(message,235,240);
		}else {
			app.textFont(font,75);
			app.text(message,235,240);
		}
		
		app.text(minEnergy, 475, 350);
	}
	
	public int switchScreen() {
		if(app.mouseX>193 && app.mouseX<348 && app.mouseY>461 && app.mouseY<518) {
			return 1; 
		}else if(app.mouseX>395 && app.mouseX<570 && app.mouseY>461 && app.mouseY<518){
			return 3;
		}
		return 7;
	}
}
