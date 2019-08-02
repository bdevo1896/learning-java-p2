

public class StartD {
	
	public static double mlToOz(double ml) {
		double oz = ml * .03381;
		return oz;
	}
	
	public static void drawSquare(int x, int y, int width, int height, String color){
		Magic.drawRectangle(x, y, width, height, color);
	}
	
	public static int[] userArray(){
		Magic.println("How many numbers do you want to put into an array?");
		
		int[] array = new int[Magic.nextInt()];
		
		for(int i = 0; i < array.length; i++){
			Magic.println("Please enter a value.");
			array[i] = Magic.nextInt();
		}
		
		return array;
	}
	
	public static double convertToMl(double tablespoons, double teaspoons){
		double sumD = 0.0;
		double tableMl = tablespoons * 3.0 * 4.929;
		double teaMl = teaspoons * 4.929;
		
		sumD = tableMl + teaMl;
		
		return sumD;
	}
	
	public static int factorial(int n){
		if(n==1){
			return 1;
		}
		else{
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		//This variable will contain the result from the "mlToOz" method to be prnted later.
		double answer = mlToOz(3.0);
		Magic.println(answer);
		
		//Using the "drawSquare" method, a red square will be drawn.
		drawSquare(10,10,50,50,"red");
		
		//This array will contain the result of the "userArrray" method that the user will make.
		int[] array = userArray();
		
		//This prints all the elements in the array.
		for(int i = 0; i < array.length;i++){
			Magic.println(array[i]);
		}
		
		//This variable will contain the result from the "convertToMl" method (with two parameters) to be printed.
		double answer2 = convertToMl(3.0,5.0);
		Magic.println(answer2+" mL");
		
		//This "int" variable will store the result of "5*4*3*2*1".
		int answer3 = factorial(5);
		Magic.println("The factorial of 5 is: "+answer3);
	}

}

