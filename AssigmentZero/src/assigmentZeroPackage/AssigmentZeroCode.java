package assigmentZeroPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AssigmentZeroCode {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		//this is the input code
		Scanner FileInput = new Scanner (System.in);
		
		//this asks the user for their file 
		System.out.println("Please provide the name of the input file (to be located in data// input): ");
		// this save the file name that the user just typed in
		String InputFilename = FileInput.nextLine();
		
		//this asks the user for the file that they want us to create and name
		System.out.println("Please provide the name of the output file (to be located in data// output): ");
		// this save the file name that the user just typed in
		String OutputFilename = FileInput.nextLine();
		
		/*
		 *  this allows us to write into the file that we just opened 
		 *  and this is whats gonna be displayed in the end
		 */
		
		PrintWriter writer = new PrintWriter("data/output/" + OutputFilename);
		
		// this is indicating which file i want to read 
		File InputFile = new File("data/input/" + InputFilename);
		
		
		// This is what acc opens the  file that we were given 
		Scanner reader = new Scanner(InputFile);
		
		
		/*
		 * this line of code causes the code to skip the first line of the file 
		 * I did this because if it tries to read the first line of the file
		 * and calculate it the code will crash cause there are no numbers or data
		 * just the sections 
		 */
		String Head = reader.nextLine();
		
		
		// this reads every single line in the code 
		while(reader.hasNextLine()) {
			String line = reader.nextLine();
			
			Scanner s = new Scanner(line).useDelimiter("\\s*\t\\s*");
			s.close();
			
		}
		
		//this closes the writing and the opening of the 2 files 
		reader.close();
		writer.close();
		
	}

	

	
	
	
	
	
	
}
	
	
	//19 columns and unspecified number of people 
	
	

