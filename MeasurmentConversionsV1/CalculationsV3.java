/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * ©Colorado Connection Academy 
 * @author Maddison Davis 
 * @version 
 */
public class CalculationsV3
{
    public static void main(String[ ] args)
    {
        int iNum1 = 4; 
        int iNum2 = 8;
        
        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " plus " + iNum2 + " = "); 
        System.out.println(iNum1 + iNum2);
        System.out.println("23.51 plus 8.9325 " + (23.51 + 8.9325));
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println("9 minus 33 " + (9 - 33));
        System.out.println("98.6 minus 8.9325 " + (98.6 - 47.0038));
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println("15 times 3 times 201 " + (15 * 3 * 201)); 
        System.out.println("3.14 times 5.0 times 5.0" + (3.14 * 5.0 * 5.0));
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println("48 divided by 8 " + (48 / 8));
        System.out.println("212.0 divided by 32.0 " + (212.0 / 32.0));
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println("23 modulus 15 " + 23 % 15);
        System.out.println("3298.7 modulus 243.1 " + (3298.7 % 243.1));
        //System.out.println();
               
    } // end of main method
} // end of class


    