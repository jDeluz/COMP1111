package temperature;

import java.util.Scanner;

public class TempConvert 
{
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);
        
        double celsiusTemp; // Celsius = ( Fahrenheit - 32) * (5/9)
        double fahrenheitTemp; // Fahrenheit = Celsius * (9/5) + 32
       
        final int base = 32;
        final double fFactor = (0.55555555555);
        final double cFactor = (1.8);
     
        double celsius;
        double fahrenheit;
        
        // Choose type of conversion
        double input;        
        System.out.print("Type 0 for Fahrenheit to Celsius, Type 1 for"
                + " Celsius to Fahrenheit: ");
       //Asking for input
        input = scan.nextInt();
        if (input == 0) { // 0 = F to C
            System.out.println("[Fahrenheit to Celsius has been selected]");
            System.out.println("Enter a Fahrenheit value to be converted: ");
           fahrenheit = scan.nextInt();
          
           celsiusTemp = (fahrenheit - 32) * fFactor;
           System.out.println(fahrenheit + " degrees Fahrenheit converted to Celsius is:"
                   + celsiusTemp + " degrees Celsius");
            }
       
        else if  // 1 = C to F
            (input == 1) {
            System.out.println("[Celsius to Fahrenheit has been selected]");
            System.out.println("Enter a Celsius value to be converted: ");
            celsius = scan.nextInt();
           
            fahrenheitTemp = celsius * cFactor + base;
            System.out.println(celsius + " degress Celsius converted to Fahrenheit is: "
                    + fahrenheitTemp + " degrees Fahrenheit");
            }
        else {
            System.out.println("Please enter a 0 or 1");
            input = scan.nextInt();
            if (input == 0) { // 0 = F to C
                System.out.println("[Fahrenheit to Celsius has been selected]");
                System.out.println("Enter a Fahrenheit value to be converted: ");
               fahrenheit = scan.nextInt();
              
               celsiusTemp = (fahrenheit - 32) * fFactor;
               System.out.println(fahrenheit + " degrees Fahrenheit converted to Celsius is:"
                       + celsiusTemp + " degrees Celsius");
                }
           
            else if  // 1 = C to F
                (input == 1) {
                System.out.println("[Celsius to Fahrenheit has been selected]");
                System.out.println("Enter a Celsius value to be converted: ");
                celsius = scan.nextInt();
               
                fahrenheitTemp = celsius * cFactor + base;
                System.out.println(celsius + " degress Celsius converted to Fahrenheit is: "
                        + fahrenheitTemp + " degrees Fahrenheit");
                }
            
        }
       }
            
        
        
        
        
    }

