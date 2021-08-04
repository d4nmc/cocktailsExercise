package domain;

public class Cocktails {
	private String cocktailName;
	private String theBase;
	private String theModifier;
	private String theFlavouring;
	private double theCost;
	private boolean over18;

	public Cocktails(String cocktailName, String theBase, String theModifier, String theFlavouring, double theCost,
			boolean over18) {
		super();
		this.cocktailName = cocktailName;
		this.theBase = theBase;
		this.theModifier = theModifier;
		this.theFlavouring = theFlavouring;
		this.theCost = theCost;
		this.over18 = over18;
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
		if (theModifier == "Cream") {
			System.out.println("Get outta town you disgusting person!");
		} else {
			this.theModifier = theModifier;
		}
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

	public boolean isOver18() {
		return over18;
	}

	public void setOver18(boolean over18) {
		this.over18 = over18;
	}

}
