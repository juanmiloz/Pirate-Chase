package controller;

import model.PirateChase;
import processing.core.PApplet;

public class ControllerPirateChase {
	
	 private PirateChase pc;

	public ControllerPirateChase(PApplet app) {
		pc= new PirateChase(app);
	}

	public void makeMapEasy() {
		pc.makeMapEasy();
	}

	public void drawEasyMap() {
		pc.drawEasyMap();
	}

	public int getUserEnergy() {
		return pc.getUserEnergy();
	}

	public int getMorganEnergy() {
		return pc.getMorganEnergy();
	}

	public void clickIsland(int mouseX, int mouseY) {
		pc.clickOnIsland(mouseX, mouseY);
		
	}
	
	
	
	
	
	 
	 
	

}
