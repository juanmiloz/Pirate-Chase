package view;

import processing.core.PApplet;
import processing.core.PImage;

public class MenuView {

	private PApplet app;
	private PImage menu,menuInfo,menuPlay;
	
	public MenuView(PApplet app) {
		this.app = app; 
		
		menu= app.loadImage("images/menu.jpg");
		menuInfo= app.loadImage("images/menuInfo.jpg");
		menuPlay= app.loadImage("images/menuPlay.jpg");
	}
	
	public void drawScreen() {
		app.background(0);
		
		
		if(app.mouseX>190 && app.mouseX<360 && app.mouseY>390 && app.mouseY<460) {
			app.image(menuInfo,0,0);
		}else if(app.mouseX>395 && app.mouseX<570 && app.mouseY>390 && app.mouseY<460){
			app.image(menuPlay,0,0);
		}else {
			app.image(menu,0,0);
		}
	}
	
	public int switchScreen() {
		int screen=1;
		if(app.mouseX>190 && app.mouseX<360 && app.mouseY>390 && app.mouseY<460) {
			screen=2;
		}
		if(app.mouseX>395 && app.mouseX<570 && app.mouseY>390 && app.mouseY<460){
			screen=3;
		}
		
		return screen;
	}

}
