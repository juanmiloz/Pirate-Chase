package controller;

import model.PirateChase;
import processing.core.PApplet;

public class ControllerPirateChase {

	private PirateChase pc;
	/**
	 * Name: ControllerPirateChase
	 * Constructor of ControllerPirateChase. <br>
	 * @param app
	 */
	public ControllerPirateChase(PApplet app) {
		pc= PirateChase.getInstance(app);
	}
	/**
	 * Name: makeMapEasy
	 * Method to make a easy map . <br>
	 */
	public void makeMapEasy() {
		pc.makeMapEasy();
	}
	/**
	 * Name: drawEasyMap
	 * Method to draw a easy map . <br>
	 */
	public void drawEasyMap() {
		pc.drawEasyMap();
	}
	/**
	 * Name: makeMapHard
	 * Method to make a hard map. <br>
	 */
	public void makeMapHard() {
		pc.makeMapHard();
	}
	/**
	 * Name: drawHardMap
	 * Method to draw a hard map. <br>
	 */
	public void drawHardMap() {
		pc.drawHardMap();
	}
	/**
	 * Name: makeMapMedium
	 * Method to make a medium map. <br>
	 */
	public void makeMapMedium() {
		pc.generateMediumMap();
	}
	/**
	 * Name: drawMediumMap
	 * Method to draw a medium map. <br>
	 */
	public void drawMediumMap() {
		pc.drawMediumMap();
	}
	/**
	 * Name: getUserEnergy
	 * Method to get user's energy. <br>
	 * @return int representing user's energy
	 */
	public int getUserEnergy() {
		return pc.getUserEnergy();
	}
	/**
	 * Name: getMorganEnergy
	 * Method to get morgan´s energy. <br>
	 * @return int representing morgan's energy
	 */
	public int getMorganEnergy() {
		return pc.getMorganEnergy();
	}
	/**
	 * Name: clickIsland
	 * Method to get clicked island. <br>
	 * @param mouseX - Position click - MouseX = int
	 * @param mouseY - Position click - MouseY = int
	 * @return int[][] representing clicked island
	 */
	public int[] clickIsland(int mouseX, int mouseY) {
		return pc.clickOnIsland(mouseX, mouseY);
	}
	/**
	 * Name: clickIslandMedium
	 * Method to get clicked island. <br>
	 * @param mouseX - Position click - MouseX = int
	 * @param mouseY - Position click - MouseY = int
	 * @return int[][] representing clicked island
	 */
	public int[] clickIslandMedium(int mouseX, int mouseY) {
		return pc.clickOnIslandMedium(mouseX, mouseY);
	}
	
	
	 
	 
	

}
