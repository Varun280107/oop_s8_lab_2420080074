package lab1;

import java.util.Scanner;

public class volumeofsphere {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        // Accept radius input
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Calculate the volume using the formula V = (4/3) * π * r^3
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

        // Display the result with labeling
        System.out.println("Volume of the sphere: " + volume + " cubic units");
    }
}
}
