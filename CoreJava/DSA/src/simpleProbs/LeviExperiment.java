package simpleProbs;

import java.util.Scanner;

public class LeviExperiment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the room(in m)");
		double length = sc.nextDouble();
		System.out.println("Enter the breadth of the room(in m))");
		double breadth = sc.nextDouble();
		System.out.println("Enter the plant area of a single plant(in cm2)");
		double plantArea = sc.nextDouble();
		sc.close();
		
		if(length<=0) {
			System.out.println("Invalid length");
		}
		else if(breadth<=0) {
			System.out.println("Invalid breadt");
		}
		else if(plantArea<=0) {
			System.out.println("Invalid plant area");
		}
		else {
			double oxygenProdPercent=oxygenProduction(length, breadth, plantArea);
			System.out.printf("%.2f",oxygenProdPercent);
		}
		
		
	}
	public static double oxygenProduction(double length,double breadth,double plantArea) {
		
		int plants = (int) (((length*breadth)/plantArea)*(100*100));
		int totalPlants = plants-(plants%10) ;
		double totalO2Production = totalPlants*0.9;
		return totalO2Production;
	}

}
