	package westview.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DriverHashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	HashMap m = new HashMap<String,String>();
		
		//push to map
		
		m.put("nice", "un-nice");
		m.put("motivated","un-motivated");
		m.put("rich", "un-rich");
		
		//get
		
		System.out.println(m.get("sunny"));//dose not exist
		
		System.out.println(m.get("nice"));
		
		System.out.println(m.size());
		
		HashMap m2 = new HashMap<String,ArrayList<String>>();
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("nails");
		food.add("bleach");
		food.add("rat poison");
		food.add("glass shards");
		
		m2.put("Rahul's Dog", food);
		System.out.println(m2.get("Rahul's Dog"));*/
		
		HashMap<String, HashMap<String, String[]>> state = new HashMap<>();
		try {
		    System.out.println("Enter the state: ");
		    Scanner scanner1 = new Scanner(System.in);
		    String paramS = scanner1.nextLine();
	

		    System.out.println("Enter the city: ");
		    Scanner scanner2 = new Scanner(System.in);
		    String paramC = scanner2.nextLine();

		    try (Scanner scanner = new Scanner(new File("covid417.csv"))) {
		        scanner.useDelimiter("\n");
		        while (scanner.hasNext()) {
		            String[] balls = scanner.next().split(",", 6);
		            HashMap<String, String[]> city = new HashMap<>();
		            String[] stats = {balls[2], balls[3], balls[4], balls[5]};
		            city.put(balls[0], stats);
		            state.put(balls[1], city);
		        }
		    }

		    if (state.containsKey(paramS) && state.get(paramS).containsKey(paramC)) {
		        System.out.println("The number of confirmed covid cases in " + paramC + ", " + paramS + " is: " + state.get(paramS).get(paramC)[1]);
		    } else {
		        System.out.println("Data not found for the entered state and city.");
		    }
		} catch (FileNotFoundException e) {
		    System.out.println(e);
		}

	}

}
