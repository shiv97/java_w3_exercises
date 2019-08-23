
package getfsz;

import java.io.File;

public class Getfsz
{
    public static void main(String[] args) 
    {

        File f=new File("C:\\Program Files\\Java\\jdk1.8.0_221");
        System.out.println("file status:"+f.exists());
        System.out.println(getFileSizeBytes(f));
       
    }
     private static String getFileSizeBytes(File file) 
     {
		return file.length() + " bytes";
     }
    
}
