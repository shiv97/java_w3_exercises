package checkf;

import java.io.File;

public class CheckF 
{
    public static void main(String[] args) 
    {
        File f=new File("C:\\Program Files\\Java\\jdk1.8.0_221");
        System.out.println("file status:"+f.exists());
    }
    
}
