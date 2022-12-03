/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * ©Colorado Connection Academy 
 * @author Maddison Davis 
 * @version 
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        int iNum1 = 4; 
        int iNum2 = 8;
        int iNum3 = 9;
        int iNum4 = 33; 
        int iNum5 = 15; 
        int iNum6 = 3;
        int iNum7 = 201; 
        int iNum8 = 48; 
        int iNum9 = 8; 
        int iNum10 = 23; 
        int iNum11 = 15; 
        
        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " plus " + iNum2 + " = "); 
        System.out.println(iNum1 + iNum2);
        System.out.println("23.51 plus 8.9325 " + (23.51 + 8.9325));
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + "minus" + iNum4 + " = ");
        System.out.println(iNum3 - iNum4);
        System.out.println("98.6 minus 8.9325 " + (98.6 - 47.0038));
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum5 + "times" + iNum6 + "times" + iNum7 + " = ");
        System.out.println(iNum5 * iNum6 * iNum7);
        System.out.println("3.14 times 5.0 times 5.0" + (3.14 * 5.0 * 5.0));
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum8 + "divided by" + iNum9 + " = ");
        System.out.println(iNum8 / iNum9);
        System.out.println("212.0 divided by 32.0 " + (212.0 / 32.0));
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum10 + "modulus" + iNum11 + " = ");
        System.out.println(iNum10 % iNum11); 
        System.out.println("3298.7 modulus 243.1 " + (3298.7 % 243.1));
        //System.out.println();
 
    } // end of main method
} // end of class


    