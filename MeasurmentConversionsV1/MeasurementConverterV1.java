/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 * 
 *      Sample Calculation:
 *        1 mile = 5280 ft, therefore    6230 ft / 5280 = 1.7992 miles
 *                      
 * 
 * @author Maddison Davis 
 * @version 1
 * 
 * Modified by: (Maddison Davis)
 * 
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {    
        //local variable declarations - assign actual values below
        double miles;                    // distance in miles
        double feet;                    // distance in feet
        double kilometers;              //distance in kilometers    
        double pounds;
        double kilograms;
        double millagram;
        double gram;
        double ounce;
        //...finish declaring local variables here, including end of line 
        //...comments doccumenting purpose of each variable
       
        
        //convert feet to miles
        feet = 6230;
        miles = feet / 5280;
        System.out.println(feet + " ft. = " + miles + " mi.");
        
        
        //convert miles to feet
        miles = 50;
        feet = miles * 5280;
        System.out.println(miles + " mi. = " + feet + " ft. "); 
        
        //convert miles to kilometers
        miles = 9867;
        kilometers = miles / 0.62137;
        System.out.println(miles + " mi. = " + kilometers + " km. ");
        
        //convert kilometers to miles
        kilometers = 67659; 
        miles = kilometers * 0.62137;
        System.out.println(kilometers + " km. = " + miles + " mi. ");
       
        //convert pounds to kilograms
        pounds = 65;
        kilograms = pounds / 2.2046;
        System.out.println(pounds + " lb. = " + kilograms + " kg. "); 
        
        //convert kilograms to pounds
        kilograms = 976; 
        pounds = kilograms * 2.2046; 
        System.out.println(kilograms + " kg. " + pounds + " lb. ");
        
        //My conversions 
        gram = 784432;
        ounce = gram * 0.035274;
        System.out.println(gram + " g. = " + ounce + " oz. "); 
        double dNum = (int)38.78; 
        System.out.println(dNum);
        //number 2
        ounce = 8765; 
        gram = ounce / 0.035274;
        System.out.println(ounce + " oz. = " + gram + " g. ");
        
        
    }//end of main method
}//end of class


