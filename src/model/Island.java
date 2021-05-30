package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Island {
	
	private int posX, posY, width, height;
	private PImage islandLight, islandDark;
	private boolean occupied;
	private boolean adyacent;
	private PApplet app;
	
	public Island(int posX, int posY, boolean occupied, boolean adyacent,PApplet app) {
		this.app=app;
		islandLight= app.loadImage("images/island.png");
		islandDark= app.loadImage("images/darkIsland.png");
		this.posX = posX;
		this.posY = posY;
		width=70;
		height=70;
		this.adyacent=adyacent;
		this.occupied=occupied;
	}
	
	public Island(int posX, int posY,PApplet app) {
		this.app=app;
		islandLight= app.loadImage("images/island.png");
		islandDark= app.loadImage("images/darkIsland.png");
		this.posX = posX;
		this.posY = posY;
		width=70;
		height=70;
		adyacent=false;
		occupied=false;
	}
	
	public Island(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		width=70;
		height=70;
		adyacent=false;
		occupied=false;
	}
	
	
	
	
	public void drawIsland() {
		if(adyacent || occupied) {
			app.image(islandLight, posX, posY,width,height);
		
		}else {
			app.image(islandDark, posX, posY,width,height);
		}
		
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public boolean isAdyacent() {
		return adyacent;
	}

	public void setAdyacent(boolean adyacent) {
		this.adyacent = adyacent;
	}
	
	
	
	

	
}
