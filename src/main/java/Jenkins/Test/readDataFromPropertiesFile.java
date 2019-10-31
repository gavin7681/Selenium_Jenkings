package Jenkins.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readDataFromPropertiesFile {

	  public static void main(String[] arg)
	  {
		  File file =  new File("H:/Workspace/Test/DataFile");
			FileInputStream fileInput = null;

		  try {
			  fileInput = new FileInputStream(file);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  Properties prop = new Properties();
		  try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
		  
		  System.out.println("URL----------->"+prop.getProperty("URL"));
		  System.out.println("User Name----------->"+prop.getProperty("Username"));
		  System.out.println("Password----------->"+prop.getProperty("Password"));

		  }
}
