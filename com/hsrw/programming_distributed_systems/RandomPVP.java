package com.hsrw.programming_distributed_systems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RandomPVP {
	static HashMap playerNames = new HashMap<Number, String>();
	static List<Integer> usedIndexes = new ArrayList<Integer>();

	public static void main(String[] args) {
		String playerName;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the path to the file with players names: ");
		String filePath = scanner.nextLine();
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(filePath));
			int i = 0;
			playerName = bufferedReader.readLine();
			playerNames.put(i, playerName);
			while(playerName != null) {
				i++;
				playerName = bufferedReader.readLine();
				playerNames.put(i, playerName);
			}
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
		int max = playerNames.size() - 1;
		int min = 0;
		int index = (int)(Math.random() * ((max - 1) + 1)) + min;
		if(usedIndexes.contains(index)) {
			return getRandomPlayer();
		} else {
			usedIndexes.add(index);
			return (String) playerNames.get(index);
		}
	}

}
