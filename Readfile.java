import java.io.*;

public class Readfile
{
    public static void main(String[] args)
    {
        String filePath = "FileSample.txt";

        try (FileReader fileReader = new FileReader(filePath))
        {
            int character;
            while ((character = fileReader.read()) != -1)
            {
                System.out.print((char) character);
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
