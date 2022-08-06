
import java.io.File;
import java.util.Scanner;

public class FinalProjectDelete {
  void delete() 
  {
	    String path="C:\\Users\\sathi\\OneDrive\\Desktop\\FinalProject\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename to delete");
		String filename=sc.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//delete operation
		
		
		if(f.delete()==true) {
		System.out.println("file gets deleted");
		
	}
		else
			System.out.println("file not found");

}

}


