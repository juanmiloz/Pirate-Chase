package controller;

import model.PirateChase;
import processing.core.PApplet;

public class ControllerPirateChase {
	
	 private PirateChase pc;

	public ControllerPirateChase(PApplet app) {
		pc= PirateChase.getInstance(app);
	}

	public void makeMapEasy() {
		pc.makeMapEasy();
	}

	public void drawEasyMap() {
		pc.drawEasyMap();
	}

	public void makeMapHard() {
		pc.makeMapHard();
	}
	
	public void drawHardMap() {
		pc.drawHardMap();
	}
	
	public void makeMapMedium() {
		pc.generateMediumMap();
	}
	
	public void drawMediumMap() {
		pc.drawMediumMap();
	}
	
	public int getUserEnergy() {
		return pc.getUserEnergy();
	}

	public int getMorganEnergy() {
		return pc.getMorganEnergy();
	}

	public int[] clickIsland(int mouseX, int mouseY) {
		return pc.clickOnIsland(mouseX, mouseY);
	}
	
	
	
	
	 
	 
	

}
