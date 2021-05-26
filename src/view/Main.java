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
		size(800,600);
	}
	
	public void draw() {
		System.out.println("draw");
		background(00,00,00);
		switch(screen) {
			case 1:
				menuView.drawScreen();
			break;
			
			case 2:
				text("info",400,450);
			break;
			
			case 3:
				text("play",400,450);
			break;
			
			case 4:
				
			break;
		}
		fill(255);
		text(mouseX+", "+mouseY,mouseX,mouseY );
	}
	
	public void mousePressed() {
		System.out.println("click");
		switch(screen) {
		case 1:
			screen=menuView.switchScreen();
		break;
		
		case 2:
			screen=1;
		break;
		
		case 3:
			screen=1;
		break;
		
		case 4:
			
		break;
	}
	}
	
	
	

}
