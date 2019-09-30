
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vueld
 */
public class IsPrimeMethod 
{

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("This program will check if an integer is prime\nEnter a positive integer");
        int number = keyboard.nextInt();
        
        if ((IsPrime(number)) == true)
        {
            System.out.println("This number is prime!");
        } else
        {
            System.out.println("This number is not prime");
        }
    }

    public static boolean IsPrime(int number) 
    {
        if (number == 1 || number == 0) 
        {
            return false;
        } else 
        {
            for (int x = 2; x < number; x++) 
            {
                if (number % x == 0) 
                {
                    return false;
                } else 
                {
                    
                }
            }
            return true;
        }
    }
}
