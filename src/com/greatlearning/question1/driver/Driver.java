package com.greatlearning.question1.driver;

import java.util.Iterator;
import java.util.Scanner;

import com.greatlearning.question1.service.Service;

public class Driver {

	public static void main(String[] args) {
		int noOfFloors;
		int [] floors;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of floors in the building");
		noOfFloors = sc.nextInt();
		floors = new int[noOfFloors];
		
		for(int i=0;i< noOfFloors;i++ ) {
			System.out.println("Enter the floor size on the day:");
			floors[i] = sc.nextInt();
		}
		
		Service service = new Service();
		service.printConstructionTable(floors);
	}

}
