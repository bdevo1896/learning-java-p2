
public class RunTracker {
	/*
	 * -----BREAKDOWN-----
	 * 
	 * Note(s): Make a speed array to store the speeds for later.
	 * 
	 * 1)
	 * 		Make a method to calculate the speed from the distance and time values. The method 
	 * 		will take three parameters. Two parameters are "double" arrays, and the last one is an integer
	 * 		that represents which of the runs they want to find the speed for. It will return the speed of
	 *  	speed of that run as an double.
	 *  
	 * 2)
	 * 		Make a method that returns a "double" array. It will take in an integer parameter to
	 * 		represent the amount of elements in the array, and a "String" parameter as the category.
	 * 		This will be used to store an array for the distance array and minutes array.
	 * 
	 * 3)
	 * 		Make a method to calculate the average of all the categories. It will return a double
	 *  	and will take one "double" array parameter. Then it will add the elements of the array
	 *  	and find its average.
	 *  
	 *  4)
	 *  	Make a method to calculate the pace and return the pace (as a double) to be used. The 
	 *  	parameters will be the same as "calculateSpeed".
	 */
	
	//This is the method that will find the speed of a specific run.
	public static double calculateSpeed(double[] distance, double[] time, int exactRun){
		
		double runTime = time[exactRun];
		double exactDistance = distance[exactRun];
		
		double speed = -1.0;
		if(runTime != 0.0 || runTime > 0.0){
			speed = exactDistance / (runTime / 60.0);
		}
		
		return speed;
	}
	
	//This method will create a "double" array through user input.
	public static double[] createDoubleArray(String category, int numberOfElements){
		if(numberOfElements == 0 || numberOfElements < 0){
			Magic.println("How many "+category+" will you enter?");
			numberOfElements = Magic.nextInt();
		}
		
		double[] array = new double[numberOfElements];
		for(int i = 0; i < array.length; i++){
			Magic.println("Please enter "+category+" ("+(i+1)+")");
			array[i] = Magic.nextDouble();
		}
		return array;
	}
	
	//This method will calculate the average of the "double" array inputted as the parameter.
	public static double calculateAvg(double[] array){
		
		double sum = 0.0;
		
		for(int i =0; i < array.length; i++){
			sum += array[i];
		}
		
		double average = sum / array.length;
		
		return average;
	}
	
	//This method will find a pace for a specific run.
	public static double calculatePace(double[] distance, double[] time, int exactRun){
		double runTime = time[exactRun];
		double dist = distance[exactRun];
		
		double pace = -1.0;
		
		if(dist > 0.0){
			pace = runTime / dist;
		}
		
		return pace;
	}
	
	public static void main(String[] args) {
		
		double[] miles = createDoubleArray("Distances (in miles)",0);
		double[] times = createDoubleArray("Times",miles.length);
		double[] speeds = new double[miles.length];
		
		for(int i = 0; i < miles.length; i++){
			double speed = calculateSpeed(miles, times, i);
			speeds[i] = speed;
			double pace = calculatePace(miles,times,i);
			Magic.println("Run "+(i+1)+") Time: "+times[i]+" Distance: "+miles[i]+" Speed: "+speeds[i]);
			
			if(((int)(pace - (int)pace)*60) < 10){
				Magic.println("       Pace: "+((int)pace)+":0"+(int)((pace-(int)pace)*60));
			}
			else if(pace % (int)pace != 0){
				Magic.println("       Pace: "+((int)pace)+":"+(int)((pace-(int)pace)*60));
			}
			else{
				Magic.println("       Pace: "+((int)pace)+":00");
			}
		}
		
		Magic.println("Average Time: "+calculateAvg(times)+" Average Distance: "+calculateAvg(miles)+" Average Speed: "+calculateAvg(speeds));
		
	}

}
