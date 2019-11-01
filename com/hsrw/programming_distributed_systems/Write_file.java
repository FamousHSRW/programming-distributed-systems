package com.hsrw.programming_distributed_systems;
import java.io.*;
import java.util.Scanner;

public class Write_file {

	public static void main(String [] args) throws IOException {
		 String textLine, filePath = "newFile.txt";
		 Scanner scanner = new Scanner(System.in);
		 // Declare a BufferedWriter in order to write text to a character-output stream.
		 BufferedWriter bufferedReader = null;
		 try {
		 // open the text file
		 bufferedReader = new BufferedWriter(new FileWriter(filePath,true));
		 } catch(Exception e) {
		 // ocorreu um erro na abertura do ficheiro, logo:
		 System.out.println("Impossible to create the file " + filePath);
		 System.out.println("Program terminated");
		 return;
		 }
		 textLine = scanner.nextLine();
		 // read one line of the command line
		 // While line inserted has some characters
		 while(textLine.length() > 0) {
		 // cycle stops when user press <enter>
		 bufferedReader.write(textLine);
		 // write the new line in the file
		 bufferedReader.newLine();
		 // insert a new line
		 textLine = scanner.nextLine();
		 // read the next line of the command line
		 }
		 // close the file
		 bufferedReader.close();
		 System.out.println("The content was stored in the file: " + filePath);
		 }
}
