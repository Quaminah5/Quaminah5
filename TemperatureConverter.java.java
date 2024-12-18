import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        double temperature;

        switch (choice) {
            case 1:

                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", temperature, fahrenheit);
                break;

            case 2:

                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                double celsius = (temperature - 32) * 5 / 9;
                System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.%n", temperature, celsius);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                break;
        }

        scanner.close();
    }

}
