package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * InputReader class
 * @author Sterling Brinson (brinster)
 * @version 2021.04.20
 */
public class InputReader
{
    private Data[] dataArray;
    
    /**
     * InputReader constructor
     */
    public InputReader()
    {
        
    }
    
    /**
     * Reads file for inputs
     * @return Data[] array of inputs
     * @throws FileNotFoundException 
     */
    public Data[] readFile(String input) throws FileNotFoundException
    {
        Data[] data = new Data[10];
        Scanner file = new Scanner(new File(input));
        String line = "";
        
        while (file.hasNextLine()) 
        {
            line = file.nextLine();
        }
        file.close();
        return data;
    }
}
