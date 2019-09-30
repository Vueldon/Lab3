
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
public class PaintJobEstimator 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter number of rooms to be painted");
        float numberOfRooms = keyboard.nextFloat();
        
        System.out.println("Enter price of paint per gallon");
        float paintCostPerGallon = keyboard.nextFloat();
        
        System.out.println("Enter square feet of wall space in each room");
        float wallSpace = keyboard.nextFloat();
        
        float numberOfGallons = NumberOfGallons(wallSpace, numberOfRooms);
        System.out.println("Gallons of paint: " + numberOfGallons);
        
        float hoursOfLabor = HoursOfLabor(wallSpace, numberOfRooms);
        System.out.println("Hours of labor: " + hoursOfLabor);
        
        float paintCost = PaintCost(numberOfGallons, paintCostPerGallon);
        System.out.println("Cost of paint: " + paintCost);
        
        float laborCharges = LaborCharges(hoursOfLabor);
        System.out.println("Cost of Labor: " + laborCharges);
        
        float totalCost = TotalCost(paintCost, laborCharges);
        System.out.println("Total cost: " + totalCost);
    }
    
    public static float NumberOfGallons(float wallSpace, float numberOfRooms)
    {
        float numberOfGallons = (wallSpace / 115) * numberOfRooms;
        return numberOfGallons;
    }
    public static float HoursOfLabor(float wallSpace, float numberOfRooms)
    {
        float hoursOfLabor = ((wallSpace / 115)*numberOfRooms)*8;
        return hoursOfLabor;
    }
    public static float PaintCost(float numberOfGallons, float paintCostPerGallon)
    {
        float paintCost = numberOfGallons * paintCostPerGallon;
        return paintCost;
    }
    public static float LaborCharges(float hoursOfLabor)
    {
        float laborCharges = hoursOfLabor * 18;
        return laborCharges;
    }
    public static float TotalCost(float paintCost, float laborCharges)
    {
        float totalCost = paintCost + laborCharges;
        return totalCost;
    }
}
