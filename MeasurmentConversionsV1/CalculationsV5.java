/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * ©Colorado Connection Academy 
 * @author Maddison Davis 
 * @version 
 */
public class CalculationsV5 extends MeasurementConverterV1 
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
        
        double dNum1 = 23.51;
        double dNum2 = 8.9325;
        
        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " plus " + iNum2 + " = "); 
        System.out.println(iNum1 + iNum2);
        System.out.println(dNum1 + " plus " + dNum2 + " = ");
        System.out.println(dNum1 + dNum2);
        System.out.println();
        //System.out.println();
        
        double dNum3 = 98.6; 
        double dNum4 = 47.0038; 
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " minus " + iNum4 + " = ");
        System.out.println(iNum3 - iNum4);
        System.out.println(dNum3 + " minus " + dNum4 + " = ");
        System.out.println(dNum3 - dNum4);
        System.out.println();
        //System.out.println();
        
        double dNum5 = 3.14;
        double dNum6 = 5.0; 
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum5 + " times " + iNum6 + " times " + iNum7 + " = ");
        System.out.println(iNum5 * iNum6 * iNum7);
        System.out.println(dNum5 + " times " + dNum6 + " times " + dNum6 + " = ");
        System.out.println(dNum5 * dNum6 * dNum6);
        System.out.println();
        //System.out.println();
        
        double dNum7 = 212.0;
        double dNum8 = 32.0; 
        
        // Division
        System.out.println("Division");
        System.out.println(iNum8 + " divided by " + iNum9 + " = ");
        System.out.println(iNum8 / iNum9);
        System.out.println(dNum7 + " divided by " + dNum8 + " = ");
        System.out.println(dNum7 / dNum8);
        System.out.println();
        //System.out.println();
         
        double dNum9 = 3298.7; 
        double dNum10 = 243.1;
        
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum10 + " modulus " + iNum11 + " = ");
        System.out.println(iNum10 % iNum11); 
        System.out.println(dNum9 + " modulus " + dNum10 + " = ");
        System.out.println(dNum9 % dNum10);
        System.out.println();
        //System.out.println();
        
        double dNum11 = 76.54;
        int iNum12 = 9745;
        int iNum13 = 12;
        double dNum12 = 67.0;
        int iNum14 = 1234;
        int iNum15 = 6;
        double dNum13 = 787.28;
     
        
        //Maddison's Test
        System.out.println("Maddison's Test"); 
        System.out.println(dNum11 + " minus " + iNum12 + " times " + iNum13 + " modulus " + dNum12 + " = ");
        System.out.println(dNum11 - iNum12 * iNum13 % dNum12);
        System.out.println(iNum14 + " plus " + iNum15 + " times " + dNum13 + " divided by " + dNum11 + " = "); 
        System.out.println(iNum14 + iNum15 * dNum13 / dNum11);
        System.out.println();
        //System.out.println();
        
        
    } // end of main method
} // end of class


    