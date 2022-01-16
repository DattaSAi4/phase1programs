import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



public class OPerations {
	File foldername;
	static String dir;
	 OPerations()
	{
	  dir = System.getProperty("user.dir");
	     foldername = new File(dir + "/files1");
	     
		if (!foldername.exists()) {
			foldername.mkdir();
		}
	}
	
	public void displayfiles() throws IOException {
	   
		File file1 = new File(foldername + "/simplelearn.ex");
		file1.createNewFile();
		File File2 = new File(foldername + "/z.ex");
		File2.createNewFile();
		String[] list = foldername.list();
		System.out.println("The file present in" +foldername+ "are :" );
		Arrays.sort(list);
         for( String s:list)
         {
        	System.out.println(s); 
         }
	}
	public void addfile() throws IOException
	{
		System.out.println("\n Enter the file name to add");
		Scanner s1 = new Scanner(System.in);
		String filename = s1.nextLine();
		File path = new File(foldername +"/" +filename);
		  String[] list = foldername.list();
		  for(String l1:list)
		  {
			  if(filename.equalsIgnoreCase(l1))
			  {
				System.out.println("FIle cannot be created");  
			  }
		  }
		  path.createNewFile();
		  System.out.println("The file is added to the " +foldername);
	}
	   public void deletefile()
	   {   
           System.out.println("Enter the Deleted file name");
           Scanner s1 = new Scanner(System.in);
           String filename = s1.next();
           File filepath = new File(foldername +"/"+filename);
           String[] list = foldername.list();
           for (String file: list) {
               if (filename.equals(file) && filepath.delete()) {
                   System.out.println("File " + filename + " deleted from " + foldername);
                   return;           
	   }
              
}  
           System.out.println("Delete Operation failed. FILE NOT FOUND");
          
	   }
	    public void searchfile()
	    {
	    	System.out.println("enter the file you want to Search");
	    	Scanner s1= new Scanner(System.in);
	    	    String addfile  =  s1.next();
	    	   File f1 = new File(foldername + "/" +addfile);
	    	       String[] list   =  foldername.list();
	    	       for(String s2:list)
	    	       {
	    	    	  if(addfile.equals(s2))
	    	    	  {
	    	    		  System.out.println("your file is found  :" +addfile);
	    	    		  return;
	    	    	  }
	    	       }
	    	       System.out.println("your file is not found");	       
	    }
}




