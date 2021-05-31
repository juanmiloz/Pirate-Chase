package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Pirate {
	
	
	private int energy;
	private int currentIsland;
	private int posX, posY, width, height;
	private boolean type;
	private PApplet app;
	private PImage morgan, user; 
	
	public Pirate(int posX, int posY, boolean type,PApplet app) {
		energy = 0;
		currentIsland = 0;
		this.posX = posX;
		this.posY = posY;
		width = 50;
		height = 50;
		this.type = type;
		this.app = app;
		morgan = app.loadImage("images/morgan.png");
		user = app.loadImage("images/pirate.png");
	}
	
	public void drawPirate() {
		if(type) {
			app.image(user, posX, posY);
		}else {
			app.image(morgan, posX, posY);
		}
	}
	
	public void movePirate(int x, int y) {
		posX = x;
		posY = y; 
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getCurrentIsland() {
		return currentIsland;
	}

	public void setCurrentIsland(int currentIsland) {
		this.currentIsland = currentIsland;
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

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public PImage getMorgan() {
		return morgan;
	}

	public void setMorgan(PImage morgan) {
		this.morgan = morgan;
	}


	public PImage getUser() {
		return user;
	}

	public void setUser(PImage user) {
		this.user = user;
	}
}