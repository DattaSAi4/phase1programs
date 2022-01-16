import java.io.IOException;
import java.util.Scanner;



public class file {
OPerations o1 = new OPerations();

	
	public  file()
	{
		System.out.println("The Application  is ******LockedMe.com*********");
		System.out.println("The developer name is Datta Sai Vinay");
	}
	public void selection() 
	{
	 String mainmenu =
     "\nMAIN MENU - Select any of the following: \n"+
             "1 -> List files in directory\n"+
             "2 -> Add, Delete or Search\n"+
             "3 -> Exit Program";
           System.out.println(mainmenu);
		try
		{
			while(true)
			{
		Scanner s1 = new Scanner(System.in);
		int Choice = s1.nextInt();
         switch(Choice)
         {
         case 1: 
         {
        	 o1.displayfiles();
        	 break;
         }
         case 2:
         {
        	 secondmenu();
        	 break;
         }
         case 3:
         {
        	 System.out.println("Thankyou");
        	 System.exit(0);
         }
         default :  selection();
        	 
         }
		}
		}
         catch(Exception e)
         {
        	 System.out.println("please enter 1 ,2, and 3");
        	 selection();
        	 }
		
	}
	
	public  void secondmenu() throws IOException
	{
		String secondmenu=
	            "   \nSelect any of the following: \n"+
	                    "   1 -> Add a file\n"+
	                    "   2 -> Delete a file\n"+
	                    "   3 -> Search a file\n"+
	                    "   4-> GoBack";
		System.out.println(secondmenu);
		try
		{
		Scanner s1 = new Scanner(System.in);
		     int option = s1.nextInt();
		 switch(option)
		 {
		 case  1:
		 {
			 o1.addfile();
			 break;
		 }
		 case 2:
		 {
			 o1.deletefile();
			 break;
		 }
		 case 3:
		 {
			 o1.searchfile();
			 break;
		 }
		 case 4:
		 {
			 System.out.println("go back to the back menu");
			 selection();
			 break;
		 }
		 default : System.out.println("please enter 1,2,3,4,");	
	}
	}
		catch(Exception e)
		{
			System.out.println("please enter 1,2,3,4");
			secondmenu();
			}
		}
}




