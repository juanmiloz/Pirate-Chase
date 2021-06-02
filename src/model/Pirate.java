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
	/**
	 * Name: Pirate
     * Constructor method of a Pirate. <br>
	 */
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
	/**
	 * Name: getEnergy
	 * Method used to get the energy of the pirate. <br>
	 * @return A Int representing the energy of the pirate.
	*/
	public int getEnergy() {
		return energy;
	}
	/**
	 * Name: setEnergy
	 * Method used to update the energy of the pirate.  <br>
	 * @param energy - energy of pirate - energy = int
	*/
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	/**
	 * Name: getCurrentIsland
	 * Method used to get the current island. <br>
	 * @return A Int representing the current island.
	*/
	public int getCurrentIsland() {
		return currentIsland;
	}
	/**
	 * Name: setCurrentIsland
	 * Method used to update the current island.  <br>
	 * @param currentIsland - currentIsland  - currentIsland = int
	*/
	public void setCurrentIsland(int currentIsland) {
		this.currentIsland = currentIsland;
	}
	/**
	 * Name: getPosX
	 * Method used to get the position of the pirate. <br>
	 * @return A Int representing the position of the pirate.
	*/
	public int getPosX() {
		return posX;
	}
	/**
	 * Name: setPosX
	 * Method used to update the position of pirate.  <br>
	 * @param posX - Position in the map - posX = int
	*/
	public void setPosX(int posX) {
		this.posX = posX;
	}
	/**
	 * Name: getPosY
	 * Method used to get the position of the pirate. <br>
	 * @return A Int representing the position of the pirate.
	*/
	public int getPosY() {
		return posY;
	}
	/**
	 * Name: setPosY
	 * Method used to update the position of pirate.  <br>
	 * @param posY - Position in the map - posY = int
	*/
	public void setPosY(int posY) {
		this.posY = posY;
	}
	/**
	 * Name: getWidth
	 * Method used to get the width of the pirate . <br>
	 * @return A Int representing the width of the pirate.
	*/
	public int getWidth() {
		return width;
	}
	/**
	 * Name: setWidth
	 * Method used to update the width of pirate.  <br>
	 * @param width - width in the map - width = int
	*/
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * Name: getHeight
	 * Method used to get the height of the pirate. <br>
	 * @return A Int representing the height of the pirate.
	*/
	public int getHeight() {
		return height;
	}
	/**
	 * Name: setHeight
	 * Method used to update the height of pirate.  <br>
	 * @param height - height in the map - height = int
	*/
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * Name: isType
	 * Method used to get type of the pirate. <br>
	 * @return A boolean representing the type of the pirate.
	*/
	public boolean isType() {
		return type;
	}
	/**
	 * Name: setType
	 * Method used to update the type of pirate.  <br>
	 * @param type - type of pirate - type = boolean
	*/
	public void setType(boolean type) {
		this.type = type;
	}
	/**
	 * Name: getApp
	 * Method used to get app of the pirate. <br>
	 * @return A PApplet representing the app of the pirate.
	*/
	public PApplet getApp() {
		return app;
	}
	/**
	 * Name: setApp
	 * Method used to update the app.  <br>
	 * @param app - app = PApplet
	*/
	public void setApp(PApplet app) {
		this.app = app;
	}
	/**
	 * Name: getMorgan
	 * Method used to get mprgan´s pirate. <br>
	 * @return A boolean representing the type of the pirate.
	*/
	public PImage getMorgan() {
		return morgan;
	}
	/**
	 * Name: setMorgan
	 * Method used to update morgan.  <br>
	 * @param morgan - morgan image - morgan = PImage
	*/
	public void setMorgan(PImage morgan) {
		this.morgan = morgan;
	}

	/**
	 * Name: getUser
	 * Method used to get user. <br>
	 * @return A boolean representing the user.
	*/
	public PImage getUser() {
		return user;
	}
	/**
	 * Name: setUser
	 * Method used to update the user.  <br>
	 * @param user - PImage
	*/
	public void setUser(PImage user) {
		this.user = user;
	}
}