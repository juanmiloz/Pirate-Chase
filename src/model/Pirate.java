package model;

public class Pirate {
	
	
	private int energy;
	private int currentIsland;
	
	public Pirate() {
		this.currentIsland = 0; 
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
}
