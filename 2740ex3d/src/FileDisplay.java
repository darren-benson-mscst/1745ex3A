import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FileDisplay {
	String fileName = "";

	public FileDisplay(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public String displayHead() {
		StringBuilder str = new StringBuilder(
				"<html>DisplayHead(): first five lines:<br>");
		
	    // Open the file.
	    try {
	    	File file = new File(this.fileName);
			if (!file.exists()) {
				// Display an error message.
				str.append("The file " + this.fileName +
							" does not exist.");
			}
			else {
				// Open the file.
			    Scanner inputFile = new Scanner(file);

			    // Read 5 lines from the file or until no more are left.
			    int counter = 0;
			    while (inputFile.hasNext() && counter < 5)
			    {
			    	
			    	String textLine = inputFile.nextLine();
				    str.append(textLine);
		            str.append("<br>");		            
		            counter++;

			    }
			    
			    // Close the file.
			    inputFile.close();
			}
	    }
	    catch (IOException e) {}
		
		return str.toString();		
	}
	
	public String displayContents() {
		StringBuilder str = new StringBuilder(
				"<html>DisplayContents(): complete file contents:<br>");
		// Open file, read all rows, append strings to str, close file
		try {
	    	File file = new File(this.fileName);
			if (!file.exists()) {
				// Display an error message.
				str.append("The file " + this.fileName +
							" does not exist.");
			}
			else {
				
			    Scanner inputFile = new Scanner(file);

			    while (inputFile.hasNext())
			    {
			    	
			    	String textLine = inputFile.nextLine();
				    str.append(textLine);
		            str.append("<br>");		            
		           
			    }
			    
			    str.append("</html>");
			    
			    inputFile.close();
			}
		}
			 catch (IOException e) {}
		return str.toString();
	}
	
	public String displayWithLineNumbers() {
		StringBuilder str = new StringBuilder(
				"<html>DisplayWithLineNumbers(): contents with line numbers:<br>");
		// Open file, read all rows, append strings to str, close file
		try {
	    	File file = new File(this.fileName);
			if (!file.exists()) {
				// Display an error message.
				str.append("The file " + this.fileName +
							" does not exist.");
			}
			else {
				
			    Scanner inputFile = new Scanner(file);
			    int lineNumber = 1;

			    while (inputFile.hasNext())
			    {
			    	
			    	String textLine = inputFile.nextLine();
				    str.append(lineNumber + ": " + textLine);
		            str.append("<br>");		            
		            lineNumber++;
			    }
			    
			    str.append("</html>");
			    
			    inputFile.close();
			}
		}
			 catch (IOException e) {}
	
			 return str.toString();			
	}

}
