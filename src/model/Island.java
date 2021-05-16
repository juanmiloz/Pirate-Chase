package model;

public class Island {
	
	boolean rechargeEnergy;
	boolean morganRetarder;
	boolean moreTime; 
	Pirate evilPirate; 
	Pirate goodPirate;
	
	public Island(boolean rechargeEnergy, boolean morganRetarder, boolean moreTime) {
		this.rechargeEnergy = rechargeEnergy; 
		this.morganRetarder = morganRetarder;
		this.moreTime = moreTime;
		this.evilPirate = null;
		this.goodPirate = null;
	}

	public boolean isRechargeEnergy() {
		return rechargeEnergy;
	}

	public void setRechargeEnergy(boolean rechargeEnergy) {
		this.rechargeEnergy = rechargeEnergy;
	}

	public boolean isMorganRetarder() {
		return morganRetarder;
	}

	public void setMorganRetarder(boolean morganRetarder) {
		this.morganRetarder = morganRetarder;
	}

	public boolean isMoreTime() {
		return moreTime;
	}

	public void setMoreTime(boolean moreTime) {
		this.moreTime = moreTime;
	}

	public Pirate getEvilPirate() {
		return evilPirate;
	}

	public void setEvilPirate(Pirate evilPirate) {
		this.evilPirate = evilPirate;
	}

	public Pirate getGoodPirate() {
		return goodPirate;
	}

	public void setGoodPirate(Pirate goodPirate) {
		this.goodPirate = goodPirate;
	}
}
