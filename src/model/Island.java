package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Island {
	
	private int posX, posY, width, height;
	private int islandNumber;
	private PImage islandLight, islandDark, power;
	private boolean occupied;
	private boolean adyacent;
	private boolean powerRecharge;
	private PApplet app;
	
	public Island(int posX, int posY, boolean occupied, boolean adyacent,int islandNumber,PApplet app) {
		this.app=app;
		islandLight= app.loadImage("images/island.png");
		islandDark= app.loadImage("images/darkIsland.png");
		//power= app.loadImage("/")
		this.posX = posX;
		this.posY = posY;
		width=70;
		height=70;
		this.adyacent=adyacent;
		this.occupied=occupied;
		this.islandNumber=islandNumber;
	}
	
	public Island(int posX, int posY,int islandNumber,PApplet app) {
		this.app=app;
		islandLight= app.loadImage("images/island.png");
		islandDark= app.loadImage("images/darkIsland.png");
		this.posX = posX;
		this.posY = posY;
		width=70;
		height=70;
		adyacent=false;
		occupied=false;
		this.islandNumber=islandNumber;
	}
	
	public Island(int posX, int posY, int islandNumber) {
		this.posX = posX;
		this.posY = posY;
		width=70;
		height=70;
		adyacent=false;
		occupied=false;
		this.islandNumber=islandNumber;
	}
	
	
	
	
	public void drawIsland() {
		if(adyacent || occupied) {
			app.image(islandLight, posX, posY,width,height);
		
		}else {
			app.image(islandDark, posX, posY,width,height);
		}
		
	}
	
	

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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

	public int getIslandNumber() {
		return islandNumber;
	}

	public void setIslandNumber(int islandNumber) {
		this.islandNumber = islandNumber;
	}
	
	
	
	
	
	

	
}
