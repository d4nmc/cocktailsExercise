package domain;

public class Cocktails {
	public String cocktailName;
	public String theBase;
	public String theModifier;
	public String theFlavouring;
	public double theCost;
	public boolean over18;
	
	public Cocktails(String cocktailName, String theBase, String theModifier, String theFlavouring, double theCost,
			boolean fancyGlass) {
		super();
		this.cocktailName = cocktailName;
		this.theBase = theBase;
		this.theModifier = theModifier;
		this.theFlavouring = theFlavouring;
		this.theCost = theCost;
		this.over18 = fancyGlass;
	}

	public String getCocktailName() {
		return cocktailName;
	}

	public void setCocktailName(String cocktailName) {
		this.cocktailName = cocktailName;
	}

	public String getTheBase() {
		return theBase;
	}

	public void setTheBase(String theBase) {
		this.theBase = theBase;
	}

	public String getTheModifier() {
		return theModifier;
	}

	public void setTheModifier(String theModifier) {
		this.theModifier = theModifier;
	}

	public String getTheFlavouring() {
		return theFlavouring;
	}

	public void setTheFlavouring(String theFlavouring) {
		this.theFlavouring = theFlavouring;
	}

	public double getTheCost() {
		return theCost;
	}

	public void setTheCost(double theCost) {
		this.theCost = theCost;
	}

	public boolean isFancyGlass() {
		return over18;
	}

	public void setFancyGlass(boolean fancyGlass) {
		this.over18 = fancyGlass;
	}
	
	
}
