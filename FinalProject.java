
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class FinalProject {
	
	  public static void main(String[] args) throws IOException{
		  {
			  
			  
            System.out.println("*****Welcome*****\n'LockedMe.com'");			  
			System.out.println("Developer Details:");  
			System.out.println("C Sathish Kumaar\nFull Stack Developer\nCompany Lockers Pvt. Ltd\n\n");
			  
			  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("<---Menu-->");
		  
	 System.out.println("1. Retrieve file names in ascending order");
	 System.out.println("2. Business level operations");
		  System.out.println("(a) To add a file to the application");
		  System.out.println("(b) To delete a file from the application");
		  System.out.println("(c) To search a file from the application");
		  System.out.println("(d) To close the current execution context and return to the main context");
	 System.out.println("3. Close the application");
			
	 
	 
	   FinalProjectDisplay x1=new FinalProjectDisplay();
       
	   FinalProjectAdd x2 = new FinalProjectAdd();
	   
	   FinalProjectDelete x3 =  new FinalProjectDelete();
	   
	   FinalProjectSearch x4 = new FinalProjectSearch();
	   
	   int flag = 0;
	   
	 while(true)
	 {   
		 System.out.println("Enter the option(1,2,3):");
		 int a=sc.nextInt();
		 
		 String y;
	   switch(a) {
	   
	   case 1:
		   x1.display();
		   break;
		   
	   case 2:
		   
		    while(true)
		    { 	
			 System.out.println("Enter the option for Business-level operations(a,b,c,d):");
			 String ip=sc.next();
			 {
				 
				 switch(ip) 
				 {
				 
				 case "a":
					 x2.add();
					 break;
					 
				 case "b":
				     x3.delete();
				     break;
				 
				 case "c":					
			         x4.search();
			         break;
				 case "d":
                    
                     flag = 1;
                     break;
				 } 
				 
			  }
				 
			    if( flag ==1)
			    	break;
				 
			 }

		    break;
		   
	   case 3:System.exit(0);	
		   
   
	   
	   
	   }
	 
	 
	 
		  
		  }
		  
	 }	  
		  
		  
	  }

}
