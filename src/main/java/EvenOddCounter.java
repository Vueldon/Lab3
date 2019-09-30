
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vueld
 */
public class EvenOddCounter 
{

    public static void main(String[] args) 
    {
        int evenTally = 0;
        int oddTally = 0;
        
        for (int x = 0; x < 100; x++)
        {
            Random number = new Random();
            int numberAsInteger = number.nextInt();
            
            if (IsEven(numberAsInteger) == true)
            {
                evenTally++;
            } else
            {
                oddTally++;
            }
        }
        
        System.out.println("Number of even numbers: " + evenTally);
        System.out.println("Number of odd numbers: " + oddTally);
    }

    public static boolean IsEven(int number) 
    {
        if ((number % 2) == 0) 
        {
            return true;
        } else {
            return false;
        }
    }
}
