
public class BuildingBlocks { 

	public static int adder(int left, int middle, int right){
		int sum = left+middle+right;
		return sum;
	}
	
	//Adder Method for Question 2
	public static double adder2(int left, int middle, double right){
		double sum = left/(middle*right);
		return sum;
	}
	
	//Adder method for Question 4.
	public static void adder3(int left, int middle, int right){
		Magic.println("IN THE NEW ADDER METHOD");
	}
	
	//Adder method for Question 5.
	public static int adderUser(){
		Magic.println("Please eneter 3 numbers.");
		int num1=Magic.nextInt();
		int num2 = Magic.nextInt();
		int num3 = Magic.nextInt();
		
		return num1+num2+num3;
	}
	
	public static void main(String[] args) {
		//Question 1. 
		/* Modify the following lines of code so that you ask the user
		 * for three values and use those values instead of 10,20,50
		 */
		int num1,num2,num3;
		Magic.println("Please enter 3 numbers");
		num1 = Magic.nextInt();
		num2 = Magic.nextInt();
		num3 = Magic.nextInt();
		int ans = adder(num1,num2,num3);
		Magic.println("The answer is "+ans);

		//Question 2. 
		/* Copy the code for adder and change it in the following ways
		 * 1. Make the return type a double
		 * 2. Make the third paramater a double
		 * 3. Make it so that rather than adding the the values you divide the first value
		 * by the product of the second two.
		 * e.g., if you passed it the values 20, 2, 2.5 then you would return 4 (20/(2*2.5) = 20/5 = 4)
		 */
		
		//Question 3
		/* Call the method you wrote in question 2 with three hard-coded values, no need to use user input
		 * print out the value IN THE MAIN METHOD
		 */
		double ans2 = adder2(32,8,2.0);
		Magic.println("The answer to part 2: "+ans2);
		
		//Question 4
		/* Copy the code for adder and change the copy into a method that returns nothing, but instead
		 * prints out the message IN THE NEW ADDER METHOD. Call this new adder method in the main.
		 */
		adder3(1,2,3);
		
		//Question 5
		/* copy the code for adder and change the copy into a method has no parameters, but instead 
		 * asks the user for three values. Return the value to main like the original. Then call this
		 * method from the main and print out the answer IN THE MAIN METHOD. 
		 */
		int answer = adderUser();
		Magic.println("Answer to part 5: " + answer);
		
	}

}
