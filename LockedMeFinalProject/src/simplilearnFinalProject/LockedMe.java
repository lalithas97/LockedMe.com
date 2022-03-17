package simplilearnFinalProject;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe 
{
	//Storing Path	
	static final String projectFilesPath="E:\\SL\\FinalProject\\Files";
	
	//Display Menu	
	public static void displayMenu()
	{
		System.out.println("****************************************************");
		System.out.println("\tWelcome to LockedMe.com secure app");
		System.out.println("\tDeveloped by : CH S P L L SOWMYA");
		System.out.println("****************************************************");
		System.out.println("\t1.Display all files");
		System.out.println("\t2.Add a new file");
		System.out.println("\t3.Delete a file");
		System.out.println("\t4.Search a file");
		System.out.println("\t5. Exit");
		System.out.println("****************************************************");	
	}
	// Used to get all the files	
	
	public static void getAllFiles()
	{
		File folder = new File( projectFilesPath);
		File[] listofFiles = folder.listFiles();
		
		if(listofFiles.length>0)
		{
		         System.out.println("FILES LIST IS BELOW:\n");
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
	// Used to create files
	public static void createFiles() 
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
	// Used to check the file name exists or not
	public static boolean checkFileExists(String fileName) 
	{
		// Getting all files names into a list
				ArrayList<String> allFilesNames = new ArrayList<String>();
				
				File folder = new File( projectFilesPath);
				File[] listofFiles = folder.listFiles();
				
				if(listofFiles.length>0)
				{
				         for(var l:listofFiles)
				        {
					          allFilesNames.add(l.getName());
				        }
				}
				return allFilesNames.contains(fileName);
			
	}
	
	// Used delete the files
	
	public static void deleteFiles()
	{
		   try
		   {
		       Scanner obj = new Scanner(System.in);
		       String fileName;
		       System.out.println("Enter file name to be deleted: ");
		       fileName=obj.nextLine();
		       File f = new File(projectFilesPath+"\\"+fileName);
		
		       if(checkFileExists(fileName))
		       {
			        f.delete();
			        System.out.println("File deleted successfully!!");
		       }
		      else
		      {
			       System.out.println("File doesn't exist");
	          }
		  }
		    catch(Exception Ex)
		    {
			       System.out.println("Unable to delete file. Please contact: admin@test.com");
		    }
	}

	// Used to search the files
	public static void searchFiles() 
	  {
		   try
		  {
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("Enter the file name to be searched:");
			fileName=obj.nextLine();
			
			if(checkFileExists(fileName))
			{
				System.out.println("File is available");
			}
			else
			{
				System.out.println("File is not available");
			}
		  }
		   catch(Exception Ex)
		   {
			   
		   }
		
	   }
	}
