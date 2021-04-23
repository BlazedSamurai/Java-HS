/*
 *	Practical Test #2 IB Computer Science MDV: Arrays, statistics
 */
import java.util.*;
import java.io.*;

public class PracticalTestQ3
{
	// Array size:
	public static int size(double[] array)
	{
		int result = array.length; // modify
		return result;
	}
	//------------------------------------------------------------------

	// Minimum:
	public static double min(double[] array)
	{
		double minimum = array[0]; // modify
		for(int i = 0; i<array.length; i++){
			if(array[i]<minimum){
				minimum=array[i];
			}
		}
		return minimum;
	}
	//------------------------------------------------------------------

	// Maximum:
	public static double max(double[] array)
	{
		double maximum = array[0]; // modify
		for(int i = 0; i<array.length; i++){
			if(array[i]>maximum){
				maximum=array[i];
			}
		}
		return maximum;
	}
	//------------------------------------------------------------------

	// Range
	public static double range(double[] array)
	{
		double range = max(array) - min(array); // modify / your code goes here
		return range;
	}
	//------------------------------------------------------------------

	// Average:
	public static double average(double[] array)
	{
		double sum = 0;
		for(int i=0; i<array.length; i++){
			sum+=array[i];
		}
		double average = sum/array.length;
		return average;
	}
	//------------------------------------------------------------------

	// Mode:
	public static double mode(double array[])
	{

		int GreatestCount = 0;
		double GreatestValue = 0;
		for(int i =0; i<array.length; i++){
			int count = 0;
			for(int j=0; j< array.length;j++){
				if(array[i]==array[j]){
					count++;
				}
				if(count>GreatestCount){
					GreatestCount=count;
					GreatestValue=array[i];
				}
			}
		}
		double mode = GreatestValue;
		return mode;
	}
	//------------------------------------------------------------------

	// For the median to work, the array double[] MUST BE SORTED
	public static double median(double[] array)
	{
		Arrays.sort(array); // DO NOT REMOVE THIS LINE, it sorts the array
		int MiddleObject = (array.length)/2;
		double median = 0.0;
		if(array.length % 2==0){
			median = (array[MiddleObject-1] +array[MiddleObject])/2.0;
		}
		else{
			median = array[MiddleObject];
		}
		return median;
	}

	public static double formatDouble(double x)
	{
			x = (int) (x * 100);
			x = (double) (x/ 100);
		return x;
	}

	//------------------------------------------------------------------

	public static void main (String args[]) throws IOException
	{
		System.out.println("\n*** Statistical Analysis of Data Sets ***\n");

		double rainfall[]    = load("rainfall.txt");	// load data from files
		double temperature[] = load("temperature.txt"); // into arrays

		System.out.println("Student: Balaji Adithya Narayanan");
		System.out.println( "\nSingapore Rainfall Statistics" );
		System.out.println( "Measurements   : " + size(rainfall) );
		System.out.println( "Minimum   (0.2): " + formatDouble(min(rainfall) ));
		System.out.println( "Maximum (765.9): " + formatDouble(max(rainfall) ));
		System.out.println( "Range   (765.7): " + formatDouble(range(rainfall) ));
		System.out.println( "Average (178.89): " + formatDouble(average(rainfall) ));
		System.out.println( "Mode    (127.2): " + formatDouble(mode(rainfall) ));
		System.out.println( "Median  (159.69): " + formatDouble(median(rainfall) ));

		System.out.println( "\nSingapore Temperature Statistics" );

		System.out.println( "Measurements   : " + size(temperature) );
		System.out.println( "Minimum   (25.4): " + formatDouble(min(temperature) ));
		System.out.println( "Maximum (29.5): " + formatDouble(max(temperature) ));
		System.out.println( "Range   (4.1): " + formatDouble(range(temperature) ));
		System.out.println( "Average (27.62): " + formatDouble(average(temperature)));
		System.out.println( "Mode    (27.3): " + formatDouble(mode(temperature) ));
		System.out.println( "Median  (27.7): " + formatDouble(median(temperature) ));

		System.out.println();
	}

	//------------------------------------------
	//- DO NOT MODIFY THE CODE BELOW THIS LINE -
	//------------------------------------------

    public static double[] load(String fileName) throws IOException
    {
        //System.out.println("<<< Loading data >>>");
        File file = new File(fileName);
        if (!file.exists())
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return null;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		double[] data = new double[countLines(fileName)];
		while ( br.ready() )
		{
            temp = br.readLine();
            data[count] = Double.parseDouble(temp);
            count++;
        }
        br.close();
        System.out.println(fileName + " file loaded.");// optional
        return data;
    }

    public static int countLines(String fileName) throws IOException
    {
        File file = new File(fileName);
        if ( !file.exists() )
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return 0;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		while ( br.ready() )
		{
			temp = br.readLine();
            count++;
        }
        br.close();
        return count;
    }


}


