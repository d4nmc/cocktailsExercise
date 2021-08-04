package cocktailsOrder;

// ADDED PACKAGE TO GITHUB

import domain.Cocktails;

public class Runner {
	public static void main(String[] args) {
		
		Cocktails newCocktail = new Cocktails("Dark N' Stormy", "50ml Dark Rum", "Ginger Ale", "Fresh Lime", 14.00, true);
		Cocktails newCocktail2 = new Cocktails("Long Island Ice Tea", "15ml Light Rum + 15ml Gin + 15ml Vodka + 15ml Tequila + 15ml Triple Sec", "Coke", "Sours Mix", 18.00, true);
		Cocktails newCocktail3 = new Cocktails("Sex on the Beach", "50ml Vodka + 30ml Peach Schnapps", "50ml Orange Juice + 50ml Cranberry Juice ", "Orange Slice", 20.00, true);
		
		System.out.println("==========Cocktail Number 1==========");
		System.out.println(newCocktail.cocktailName);
		System.out.println(newCocktail.theBase);
		System.out.println(newCocktail.theModifier);
		System.out.println(newCocktail.theFlavouring);
		System.out.println(newCocktail.theCost);
		System.out.println(newCocktail.over18);
		System.out.println("==========Cocktail Number 2==========");
		System.out.println(newCocktail2.cocktailName);
		System.out.println(newCocktail2.theBase);
		System.out.println(newCocktail2.theModifier);
		System.out.println(newCocktail2.theFlavouring);
		System.out.println(newCocktail2.theCost);
		System.out.println(newCocktail2.over18);
		System.out.println("==========Cocktail Number 3==========");
		System.out.println(newCocktail3.cocktailName);
		System.out.println(newCocktail3.theBase);
		System.out.println(newCocktail3.theModifier);
		System.out.println(newCocktail3.theFlavouring);
		System.out.println(newCocktail3.theCost);
		System.out.println(newCocktail3.over18);
	}
}
