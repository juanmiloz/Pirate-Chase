package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Island {
	
	private int posX, posY, width, height;
	private int islandNumber;
	private PImage islandLight, islandDark, powerImg;
	private boolean occupied;
	private boolean adyacent;
	private boolean energy;
	private PApplet app;
	/**
     * Name: Island
     * Constructor method of a Island. <br>
	 * @param posX - Position in the map - posX = int
	 * @param posY - Position in the map - posY = int
	 * @param occupied - If island stay occupied - occupied = boolean
	 * @param adyacent - If island is adyacent - adyacent = boolean
	 * @param islandNumber - number of island - islandNumber = int
	 * @param app - PApplet
	 */
	public Island(int posX, int posY, boolean occupied, boolean adyacent,int islandNumber,PApplet app) {
		this.app=app;
		islandLight= app.loadImage("images/island.png");
		islandDark= app.loadImage("images/darkIsland.png");
		powerImg= app.loadImage("/images/energy.png");
		this.posX = posX;
		this.posY = posY;
		width=70;
		height=70;
		this.adyacent=adyacent;
		this.occupied=occupied;
		this.islandNumber=islandNumber;
	}
	/**
	 * 
     * Name: Island
     * Constructor method of a Island. <br>
	 * @param posX - Position in the map - posX = int
	 * @param posY - Position in the map - posY = int
	 * @param islandNumber - number of island - islandNumber = int
	 * @param app - PApplet
	 */
	public Island(int posX, int posY,int islandNumber,PApplet app) {
		this.app=app;
		islandLight= app.loadImage("images/island.png");
		islandDark= app.loadImage("images/darkIsland.png");
		powerImg= app.loadImage("/images/energy.png");
		this.posX = posX;
		this.posY = posY;
		width=70;
		height=70;
		adyacent=false;
		occupied=false;
		this.islandNumber=islandNumber;
	}
	/**
	 * 
     * Name: Island
     * Constructor method of a Island. <br>
	 * @param posX - Position in the map - posX = int
	 * @param posY - Position in the map - posY = int
	 * @param islandNumber - number of island - islandNumber = int
	 */
	public Island(int posX, int posY, int islandNumber) {
		this.posX = posX;
		this.posY = posY;
		width=70;
		height=70;
		adyacent=false;
		occupied=false;
		this.islandNumber=islandNumber;
	}
	
	
	
	/**
     * Name: drawIsland
     * Method to draw a new island. <br>
	 */
	public void drawIsland() {
		if(adyacent || occupied) {
			app.image(islandLight, posX, posY,width,height);
		
		}else {
			app.image(islandDark, posX, posY,width,height);
		}
		
		if(energy) {
			app.image(powerImg, posX-40, posY+20,50,50);
		}
		
	}
	
	
	/**
	 * Name: getPosX
	 * Method used to get the position of the island. <br>
	 * @return A Int representing the position of the island.
	*/
	public int getPosX() {
		return posX;
	}
	/**
	 * Name: setPosX
	 * Method used to update the position of island.  <br>
	 * @param posX - Position in the map - posX = int
	*/
	public void setPosX(int posX) {
		this.posX = posX;
	}
	/**
	 * Name: getPosY
	 * Method used to get the position of the island. <br>
	 * @return A Int representing the position of the island.
	*/
	public int getPosY() {
		return posY;
	}
	/**
	 * Name: setPosY
	 * Method used to update the position of island.  <br>
	 * @param posY - Position in the map - posY = int
	*/
	public void setPosY(int posY) {
		this.posY = posY;
	}
	/**
	 * Name: getWidth
	 * Method used to get the width of the island. <br>
	 * @return A Int representing the width of the island.
	*/
	public int getWidth() {
		return width;
	}
	/**
	 * Name: setWidth
	 * Method used to update the width of island.  <br>
	 * @param width - width in the map - width = int
	*/
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * Name: getHeight
	 * Method used to get the height of the island. <br>
	 * @return A Int representing the height of the island.
	*/
	public int getHeight() {
		return height;
	}
	/**
	 * Name: setHeight
	 * Method used to update the height of island.  <br>
	 * @param height - height in the map - height = int
	*/
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * Name: isOccupied
	 * Method used to get if is occupied the island. <br>
	 * @return A boolean representing the occupied of the island.
	*/
	public boolean isOccupied() {
		return occupied;
	}
	/**
	 * Name: setOccupied
	 * Method used to update the position of island.  <br>
	 * @param occupied - occupied´s map - posY = boolean
	*/
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	/**
	 * Name: isAdyacent
	 * Method used to get adyacense of island. <br>
	 * @return A boolean representing the adyacent of the island.
	*/
	public boolean isAdyacent() {
		return adyacent;
	}
	/**
	 * Name: setAdyacent
	 * Method used to update adyacent of island.  <br>
	 * @param adyacent - adyacent in the map - adyacent = boolean
	*/
	public void setAdyacent(boolean adyacent) {
		this.adyacent = adyacent;
	}
	/**
	 * Name: getIslandNumber
	 * Method used to get the number of the island. <br>
	 * @return A Int representing the number of the island.
	*/
	public int getIslandNumber() {
		return islandNumber;
	}
	/**
	 * Name: setIslandNumber
	 * Method used to update the number of island.  <br>
	 * @param islandNumber - number in the map - islandNumber = int
	*/
	public void setIslandNumber(int islandNumber) {
		this.islandNumber = islandNumber;
	}
	/**
	 * Name: isEnergy
	 * Method used to get if is energy of island. <br>
	 * @return A boolean representing if is energy of the island.
	*/
	public boolean isEnergy() {
		return energy;
	}
	/**
	 * Name: setEnergy
	 * Method used to update if is energy in island.  <br>
	 * @param energy - if is energy island - energy = boolean
	*/
	public void setEnergy(boolean energy) {
		this.energy = energy;
	}
	
}
