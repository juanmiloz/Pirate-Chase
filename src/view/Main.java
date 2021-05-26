package view;

import processing.core.PApplet;

public class Main extends PApplet{

	private MenuView menuView;
	private GameView gameEasyView;
	private int screen;
	
	public static void main(String args[]) {
		PApplet.main(Main.class.getName());
	}
	
	public void setup() {
		screen = 1;
		menuView = new MenuView(this);
		gameEasyView = new GameView(this);
	}
	
	public void settings() {
		size(800,650);
	}
	
	public void draw() {
		background(00,00,00);
		switch(screen) {
			case 1:
				menuView.drawScreen();
			break;
			
			case 2:
				
			break;
			
			case 3:
				
			break;
			
			case 4:
				
			break;
		}
	}

}
