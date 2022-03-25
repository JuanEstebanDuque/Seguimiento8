package model;

public class Country implements Comparable<Country>{
	//Attributes
	String name;
	int goldMedalMale;
	int silverMedalMale;
	int bronzeMedalMale;
	int goldMedalFemale;
	int silverMedalFemale;
	int bronzeMedalFemale;
	int totalGold;
	int totalSilver;
	int totalBronze;
	
	//relations
	
	//methods
	public Country(String name, int goldMedalMale, int silverMedalMale, int bronzeMedalMale, int goldMedalFemale,int silverMedalFemale, int bronzeMedalFemale) {
		this.name = name;
		this.goldMedalMale = goldMedalMale;
		this.silverMedalMale = silverMedalMale;
		this.bronzeMedalMale = bronzeMedalMale;
		this.goldMedalFemale = goldMedalFemale;
		this.silverMedalFemale = silverMedalFemale;
		this.bronzeMedalFemale = bronzeMedalFemale;
		this.totalGold = goldMedalFemale+goldMedalMale;
		this.totalSilver = silverMedalFemale+silverMedalMale;
		this.totalBronze = bronzeMedalFemale+bronzeMedalMale;
	}
	
	@Override
	public int compareTo(Country arg0) {
		Country A = arg0;
		Country B = this;
		if(A.goldMedalFemale-B.goldMedalMale == 0) {
			if(A.silverMedalFemale-B.silverMedalFemale == 0) {
				if(A.bronzeMedalFemale-B.bronzeMedalFemale == 0) {
					return A.name.compareTo(B.name);
				}else {
					return A.bronzeMedalFemale-B.bronzeMedalFemale;
				}
			}else {
				return A.silverMedalFemale-B.silverMedalFemale;
			}
		}else {
			return A.goldMedalFemale-B.goldMedalMale;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGoldMedalMale() {
		return goldMedalMale;
	}

	public void setGoldMedalMale(int goldMedalMale) {
		this.goldMedalMale = goldMedalMale;
	}

	public int getSilverMedalMale() {
		return silverMedalMale;
	}

	public void setSilverMedalMale(int silverMedalMale) {
		this.silverMedalMale = silverMedalMale;
	}

	public int getBronzeMedalMale() {
		return bronzeMedalMale;
	}

	public void setBronzeMedalMale(int bronzeMedalMale) {
		this.bronzeMedalMale = bronzeMedalMale;
	}

	public int getGoldMedalFemale() {
		return goldMedalFemale;
	}

	public void setGoldMedalFemale(int goldMedalFemale) {
		this.goldMedalFemale = goldMedalFemale;
	}

	public int getSilverMedalFemale() {
		return silverMedalFemale;
	}

	public void setSilverMedalFemale(int silverMedalFemale) {
		this.silverMedalFemale = silverMedalFemale;
	}

	public int getBronzeMedalFemale() {
		return bronzeMedalFemale;
	}

	public void setBronzeMedalFemale(int bronzeMedalFemale) {
		this.bronzeMedalFemale = bronzeMedalFemale;
	}

	public int getTotalGold() {
		return totalGold;
	}

	public void setTotalGold(int totalGold) {
		this.totalGold = totalGold;
	}

	public int getTotalSilver() {
		return totalSilver;
	}

	public void setTotalSilver(int totalSilver) {
		this.totalSilver = totalSilver;
	}

	public int getTotalBronze() {
		return totalBronze;
	}

	public void setTotalBronze(int totalBronze) {
		this.totalBronze = totalBronze;
	}

}
