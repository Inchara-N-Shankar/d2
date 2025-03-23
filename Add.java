import java.util.Scanner;  

public class Add {  
    public static void main(String[] args) {  
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);  
        
        // Prompt user for two numbers
        System.out.print("Enter first number: ");  
        double num1 = scanner.nextDouble();  
        
        System.out.print("Enter second number: ");  
        double num2 = scanner.nextDouble();  
        
        // Calculate sum
        double sum = num1 + num2;  
        
        // Display result
        System.out.println("The sum is: " + sum);  
        
        // Close scanner
        scanner.close();
    }  
}
