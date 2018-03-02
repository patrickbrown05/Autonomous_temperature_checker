package temperature_AI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class inside_temp_range 
{
	int _min_temp;
	int _max_temp;
	int _avg_temp;
	int _outside_temp;
	
	public inside_temp_range(int min_temp, int max_temp, int avg_temp) {
		_min_temp = min_temp;
		_max_temp = max_temp;
		_avg_temp = avg_temp;
		
		System.out.println("The range is " + _min_temp + " as a low, and " + _max_temp +" as "
				+ "a maximum inside the house and an average inside temp of " + _avg_temp);
	}
	
	public inside_temp_range ()
	{
		_min_temp = 71;
		_max_temp = 79;
		_avg_temp = 75;
		
		System.out.println("the default range is " + _min_temp + " as a low, and " + _max_temp +" as "
				+ "a maximum temperature inside the house with an average inside temp of " + _avg_temp);
	}
	
/*	public void PEAS (){
		String P = "P: How comfortable the inside temperature of the house is.";
		System.out.println(P);
		String E = "E: The temperature in the immediate area";
		System.out.println(E);
		String A = "A: Inside temperature control, display for the temperature outside and temperature inside";
		System.out.println(A);
		String S = "S: Sensors for temperature outside, weather sources for the temperature";
		System.out.println(S);
	
	}*/
	
	public void raise_temp(int inside_temp) { //function for raising the inside temp based on the outside temp
		//System.out.println("the current inside temp is " + inside_temp);
		while (inside_temp <= _avg_temp)
		inside_temp++;
		
		System.out.println("The inside temp has been adjusted to " + inside_temp);
	}

	public void lower_temp (int inside_temp){ //function for lowering the inside temp based on the outside temp
		//System.out.println("the current inside temp is " + inside_temp);
		while (inside_temp >= _avg_temp)
		inside_temp--;
		
		System.out.println("The inside temp has been adjusted to " + inside_temp);
	}
		
		public void adjust_temp (int inside_temp){ //a more general temp adjusting function that calls
			if (inside_temp > _max_temp)				   //both the lower temp and raise temp functions 
			lower_temp(inside_temp);			   // depending on the value of the outside temp
			//calling lower temp if outside temp is above max temp setting
			if (inside_temp < _min_temp)
			raise_temp(inside_temp);
			//calling the raise temp if the outside temp is below the min temp setting
		}
		
		public int get_temp () throws FileNotFoundException {
			//this function is to get the current outside temperature from a txt file
			Scanner fileIn = new Scanner(new File("C:\\Users\\patrick.brown05\\Desktop\\Temp Sensor\\Inside Temperature.txt"));
			//this is a scanner to read from the file what the current temp is
			int temp = 0;
			//an in to save the value of the temperature from the file
			while (fileIn.hasNextInt()){ //an iteration to find the newest value of the temperature
				temp = fileIn.nextInt(); //saving the value to the int temp
			}
			fileIn.close(); //closing the file
			System.out.println("the temperature read is " + temp); //outputting the temp
			return temp; //returning the value of the temperature from the file
		}
		
	}


