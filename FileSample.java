import java.io.FileWriter;
import java.io.Writer;
import java.io.*;
public class FileSample
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter w=new FileWriter("FileSample.txt");
            w.write("I have written above file");
            w.close();
            System.out.println("Writing work done");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
