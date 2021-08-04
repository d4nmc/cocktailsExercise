package cocktailsOrder;

// ADDED PACKAGE TO GITHUB

import domain.Cocktails;

public class Runner {
	
	public static void main(String[] args) {
		
// The cocktails I am creating
		Cocktails newCocktail = new Cocktails("Dark N' Stormy", "50ml Dark Rum", "Ginger Ale", "Fresh Lime", 14.00, true);
		Cocktails newCocktail2 = new Cocktails("Long Island Ice Tea", "15ml Light Rum + 15ml Gin + 15ml Vodka + 15ml Tequila + 15ml Triple Sec", "Coke", "Sours Mix", 18.00, true);
		Cocktails newCocktail3 = new Cocktails("Sex on the Beach", "50ml Vodka + 30ml Peach Schnapps", "50ml Orange Juice + 50ml Cranberry Juice ", "Orange Slice", 20.00, true);
		
// The Printouts For console		
		
		System.out.println("==========Cocktail Number 1==========");
		System.out.println(newCocktail.getCocktailName());
		System.out.println(newCocktail.getTheBase());
		System.out.println(newCocktail.getTheModifier());
		System.out.println(newCocktail.getTheFlavouring());
		System.out.println(newCocktail.getTheCost());
		System.out.println(newCocktail.isOver18());
		System.out.println("==========Cocktail Number 2==========");
		System.out.println(newCocktail2.getCocktailName());
		System.out.println(newCocktail2.getTheBase());
		System.out.println(newCocktail2.getTheModifier());
		System.out.println(newCocktail2.getTheFlavouring());
		System.out.println(newCocktail2.getTheCost());
		System.out.println(newCocktail2.isOver18());
		System.out.println("==========Cocktail Number 3==========");
		System.out.println(newCocktail3.getCocktailName());
		System.out.println(newCocktail3.getTheBase());
		System.out.println(newCocktail3.getTheModifier());
		System.out.println(newCocktail3.getTheFlavouring());
		System.out.println(newCocktail3.getTheCost());
		System.out.println(newCocktail3.isOver18());
	}
}
