package com.example.model;
import java.util.*;

public class BeerExpert {

	public List getBrands(String color) {
		
		List<String> brands = new ArrayList<String>();
		
		if(color.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		}
		else {
			
			brands.add("Jai Pale Ale");
			brands.add("Gout Stout");
		}
		
		return (brands);
		
	}
	
	/*public static void main(String args[]) {
		
		ArrayList<String> beerBrands;
		BeerExpert be = new BeerExpert();		
		beerBrands = (ArrayList)be.getBrands("red"); 
		
		for(String st : beerBrands) {
			
			System.out.println(st);
			
		}
		
	}*/
	
}
