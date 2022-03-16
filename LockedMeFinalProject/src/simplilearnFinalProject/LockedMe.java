package simplilearnFinalProject;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LockedMe 
{
	//Saving Files path	
	static final String projectFilesPath="E:\\SL\\FinalProject\\Files";
	//	Menu Code
	public static void displayMenu()
	{
		System.out.println("*******************************************");
		System.out.println("\tWelcome to lockedMe.com secure app");
		System.out.println("\tDeveloped by: CH S P L L SOWMYA");
		System.out.println("*******************************************");
		System.out.println("\t1.Display all files");
		System.out.println("\t2.Add a new file");
		System.out.println("\t3.Delete a file");
		System.out.println("\t4.Search a file");
		System.out.println("\t5. Exit");
		System.out.println("*******************************************");
	}
	
	public static void getAllFiles() 
	{
		File folder = new File(projectFilesPath);
		File[] listofFiles = folder.listFiles();
		
		if(listofFiles.length>0)
		{
			System.out.println("FILES LIST IS BELOW: \n");
			for(var l:listofFiles)
			{
				System.out.println(l.getName());
			}
		}
		else
		{
			System.out.println("The folder is empty");
		}
		
	}
	public  static void createFiles()
	{
		try
		{
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("Enter File Name: ");
			fileName=obj.nextLine();
		
			int linesCount;
			System.out.println("Enter how many lines in the file: ");
			linesCount=Integer.parseInt(obj.nextLine());
		
			FileWriter fw = new FileWriter(projectFilesPath+"\\"+fileName);
		
			//Read line by line from user
			for(int i=1;i<=linesCount;i++)
			{
				System.out.println("Enter File Line");
				fw.write(obj.nextLine()+"\n");
			}
			System.out.println("File Created Successfully");
			fw.close();
		}
		catch(Exception Ex)
		{
			
		}
	}
	public static void deleteFiles()
	{
		
	}
	public static void searchFiles()
	{
		
	}
	
}
