package view;

import processing.core.PApplet;

public class Main extends PApplet{

	private MenuView menuView;
	private DifficultView difficultView;
	private InfoView infoView;
	private EasyMapView easyMapView;
	private MediumMapView mediumMapView;
	private int screen;
	
	public static void main(String args[]) {
		PApplet.main(Main.class.getName());
	}
	
	public void setup() {
		screen = 1;
		menuView = new MenuView(this);
		difficultView = new DifficultView(this); 
		infoView = new InfoView(this);
		easyMapView = new EasyMapView(this);
		mediumMapView = new MediumMapView(this);
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
		}
		fill(255);
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
				easyMapView.clickIsland(mouseX,mouseY);
				
			break;
		}
	}
	
	
	

}
