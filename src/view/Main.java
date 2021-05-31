package view;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{

	private MenuView menuView;
	private DifficultView difficultView;
	private InfoView infoView;
	private EasyMapView easyMapView;
	private MediumMapView mediumMapView;
	private HardMapView hardMapView;
	private EndGameView endGameView;  
	private int screen;
	private String message;
	private int minEnergy;
	
	public static void main(String args[]) {
		PApplet.main(Main.class.getName());
	}
	
	public void setup() {
		surface.setTitle("Pirate Chase");
		PImage icon= loadImage("images/icon.png");
		surface.setIcon(icon);
		screen = 1;
		menuView = new MenuView(this);
		difficultView = new DifficultView(this); 
		infoView = new InfoView(this);
		easyMapView = new EasyMapView(this);
		mediumMapView = new MediumMapView(this);
		hardMapView = new HardMapView(this);
		endGameView = new EndGameView(this);
	}
	
	public void settings() {
		size(800,600);
	}
	
	public void draw() {
		background(00,00,00);
		switch(screen) {
			case 1:
				menuView.drawScreen();
			break;
			
			case 2:
				infoView.drawScreen();
			break;
			
			case 3:
				difficultView.drawScreen();
			break;
			
			case 4:
				easyMapView.drawScreen();
			break;
			
			case 5:
				mediumMapView.drawScreen();
			break;
			case 6:
				hardMapView.drawScreen();
			break;
			case 7:
				endGameView.drawScreen(message, minEnergy);
			break;
			case 8:
				exit();
				break;
		}
		fill(255);
		textSize(12);
		text(mouseX+", "+mouseY,mouseX,mouseY );
	}
	
	public void mousePressed() {
		switch(screen) {
			case 1:
				screen=menuView.switchScreen();
			break;
			
			case 2:
				screen=infoView.switchScreen();
			break;
			
			case 3:
				screen=difficultView.switchScreen();
			break;
			
			case 4:
				int[] output =easyMapView.clickIsland(mouseX,mouseY);
				if(output[0]==7 && output[1]==0) {
					screen = 7;
					message = "You Lose!";
					minEnergy = output[2];
				}else if(output[0]==7 && output[1]==1) {
					screen = 7;
					message = "You Win!";
					minEnergy = output[2];
				}
			break;
			
			case 5:
				
			break;
			
			case 6:
				int[] outputhard =hardMapView.clickIsland(mouseX,mouseY);
				if(outputhard[0]==7 && outputhard[1]==0) {
					screen = 7;
					message = "You Lose!";
					minEnergy = outputhard[2];
				}else if(outputhard[0]==7 && outputhard[1]==1) {
					screen = 7;
					message = "You Win!";
					minEnergy = outputhard[2];
				}
			break;
			
			case 7:
				screen=endGameView.switchScreen();
			break;
		}
	}
	
	
	

}
