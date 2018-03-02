package temperature_AI;

import java.io.IOException;

public class Main {
	public static void main(String[] Args) throws IOException{

		inside_temp_range temp1 = new inside_temp_range();  
	//	temp1.PEAS();
	    inside_temp_range temp2 = new inside_temp_range(70, 80, 75); 
	//	temp2.PEAS();
		
		temp1.get_temp();
		temp1.adjust_temp(temp1.get_temp());

	}

}
