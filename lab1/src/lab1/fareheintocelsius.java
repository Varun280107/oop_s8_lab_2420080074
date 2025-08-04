package lab1;
	import java.util.Scanner;
	public class fareheintocelsius {
	    public static void main(String[] args) {
	       try( Scanner scanner = new Scanner(System.in)){

	        // Accept temperature in Fahrenheit
	        System.out.print("Enter temperature in Fahrenheit: ");
	        double temperatureFahrenheit = scanner.nextDouble();

	        // Convert to Celsius using the formula
	        double temperatureCelsius = (5.0 / 9) * (temperatureFahrenheit - 32);

	        // Print the converted temperature with units
	        System.out.println("Temperature in Celsius: " + temperatureCelsius + "°C");
	    }
	}
}