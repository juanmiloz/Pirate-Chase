package view;

import processing.core.PApplet;
import processing.core.PImage;

public class InfoView {

	private PApplet app;
	private PImage info1, info2;
	
	public InfoView(PApplet app) {
		this.app = app;
		
		info1=app.loadImage("images/info1.jpg");
		info2=app.loadImage("images/info2.jpg");
	}
	
	public void drawScreen() {
		app.background(0);
		
		if(app.mouseX>316 && app.mouseX<490 && app.mouseY>510 && app.mouseY<566) {
			app.image(info2, 0, 0);
		}else {
			app.image(info1, 0, 0); 
		}
	}
	
	public int switchScreen() {
		int screen=2;
		if(app.mouseX>316 && app.mouseX<490 && app.mouseY>510 && app.mouseY<566) {
			screen = 3;
		}
		
		return screen;
	}

}
