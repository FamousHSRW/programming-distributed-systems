package com.hsrw.programming_distributed_systems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RandomPVP {
    // this is just a data structure to store player names as key value pairs so we can easily access them
    // e.g. playerNames = { 1 : "Nadal" }, then playerNames.get(1) will return "Nadal"
	static HashMap playerNames = new HashMap<Number, String>();
	// this stores the keys of used player keys since we store them as key value pairs
    // e.g. from the example above if we do playerNames.get(1) we add 1 to this array which means
    // the playerName stored at index 1 has already been used, so we don't get a player twice
	static List<Integer> usedIndexes = new ArrayList<Integer>();

	public static void main(String[] args) {
		// next few lines are self explanatory
		String playerName;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the path to the file with players names: ");
		String filePath = scanner.nextLine();
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(filePath));
			int i = 0;
			playerName = bufferedReader.readLine();
			// first we put the playerNames in the hashMap
            // so after the next line playerNames will be equal to { 0: first player name in the file }
			playerNames.put(i, playerName);
			// we then loop through all the lines and add all the player names to our playerNames hashmap
			while(playerName != null) {
				i++;
				playerName = bufferedReader.readLine();
				playerNames.put(i, playerName);
			}
			// no we loop through the playerNames hashMap and get random player names;
			for(int index = 0; index < (playerNames.size()/2); index++) {
				System.out.println(getRandomPlayer() + " vs " + getRandomPlayer());
			}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Impossible to open the selected file " + filePath);
			System.out.println("Program terminated");
			return;
		}
		scanner.close();
	}
	public static String getRandomPlayer() {
	    // max random integer our random function should give us
		int max = playerNames.size() - 1;
		// min random integer
		int min = 0;
		// this will give a random integer with the range we specified above
		int index = (int)(Math.random() * ((max - 1) + 1)) + min;
		// firstly we check if we already used that playerName
		// if we used it then the usedIndexes list we made above will have the index
		// if we used the index already we call this function again (recursive) till we find a non used integer in the range
		// not perfect but works
		if(usedIndexes.contains(index)) {
			// recursive call
			return getRandomPlayer();
		} else {
			// everytime we find a number we haven't used before we add it to the usedIndexes list because we are about to use it
			usedIndexes.add(index);
			// gets the player name and returns it
			// see the next line as what we said above
			// playerNames.get(1) will return us "Nadal"
			return (String) playerNames.get(index);
		}
	}

}
