
import java.util.Scanner;
import assignment2.Airplane;
public class Assignment2
{
  public static void main(String[] args)

  {
    //Variables used:
    /*
    air1 -- first plane
    air2 -- second plane
    scan -- scanner for input
    call -- call sign for 3rd plane
    distp -- distance of 3rd plane
    bearp -- bearings of 3rd plane
    altp -- altitude of 3rd plane
    air3 -- 3rd plane
    distfunc1 -- dist between plane 1 and 2
    distfunc2 -- dist between plane 1 and 3
    distfunc3 -- dist between plane 2 and 3
    
    distfunc4 -- new dist between plane 1 and 2
    distfunc5 -- new dist between plane 1 and 3
    distfunc6 -- new dist between plane 2 and 3
    */
    
    //first two planes
    Airplane air1 = new Airplane();
    Airplane air2 = new Airplane("AAA02", 15.8, 128, 30000);
    
    //scanner
    Scanner scan = new Scanner(System.in);
    
    //String to prompt input
    System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude):");
    
    //input and manipulation of input
    String call = new String(scan.nextLine());
    call = call.toUpperCase();
    double distp = scan.nextDouble();
    int bearp = scan.nextInt();
    int altp = scan.nextInt();
    
    //creation of 3rd plane
    Airplane air3 = new Airplane(call, distp, bearp, altp);
    
    //output strings with initial position
    //YOUR ISSUE IS HERE
    System.out.print("\nIntitial Positions:\n\"Airplane 1\": ");
    System.out.print(air1 + "\n\"Airplane 2\": ");
    System.out.print(air2 + "\n\"Airplane 3\": ");
    System.out.println(air3 + "\n");
    
    
    //output strings with initial distance using .distTo() method
    System.out.println("Initial Distances:\nThe distance between Airplane 1 and Airplane 2 is " + air1.distTo(air2) + " miles." + "\nThe distance between Airplane 1 and Airplane 3 is " + 
      air1.distTo(air3) + " miles."  + "\nThe distance between Airplane 2 and Airplane 3 is " + air2.distTo(air3) + " miles." + "\n");
      
    //compute differences in height
    int distfunc1 = Math.abs(air1.getAlt() - air2.getAlt());
    int distfunc2 = Math.abs(air1.getAlt() - air3.getAlt());
    int distfunc3 = Math.abs(air2.getAlt() - air3.getAlt());
    
    //output strings with initial heigh difference with values computed above
    System.out.println("Initial Height Differences:\nThe difference in height between Airplane 1 and Airplane 2 is " + distfunc1 + " feet.\nThe difference in height between Airplane 1 and Airplane 3 is " + distfunc2 + " feet.\nThe difference in height between Airplane 2 and Airplane 3 is "+ distfunc3 + " feet.\n");
    
    //changes to first airplane
    air1.move((air2.distTo(air3)), 65); // Move by distance between a2 and a3
    air1.gainAlt();
    air1.gainAlt();
    air1.gainAlt();
    
    //changes to second airplane
    air2.move(8.0,135);
    air2.loseAlt();
    air2.loseAlt();
    
    //changes to third airplane
    air3.move(5.0,55);
    air3.loseAlt();
    air3.loseAlt();
    air3.loseAlt();
    air3.loseAlt();
    
    
    //new positions after above changes
    System.out.print("New Positions:\n\"Airplane 1\": ");
    System.out.print(air1 + "\n\"Airplane 2\": ");
    System.out.print(air2 + "\n\"Airplane 3\": ");
    System.out.println(air3 + "\n");
    
    
    System.out.println("New Distances:\nThe distance between Airplane 1 and Airplane 2 is " + air1.distTo(air2) + " miles." + "\nThe distance between Airplane 1 and Airplane 3 is " + 
      air1.distTo(air3) + " miles." + "\nThe distance between Airplane 2 and Airplane 3 is " + air2.distTo(air3) + " miles." + "\n");
      
    //might give error later remmove abs and switch cvlues
    int distfunc4 = Math.abs(air1.getAlt() - air2.getAlt());
    int distfunc5 = Math.abs(air1.getAlt() - air3.getAlt());
    int distfunc6 = Math.abs(air2.getAlt() - air3.getAlt());
    
    System.out.println("New Height Differences:\nThe difference in height between Airplane 1 and Airplane 2 is " + distfunc4 + " feet.\nThe difference in height between Airplane 1 and Airplane 3 is " + distfunc5 + " feet.\nThe difference in height between Airplane 2 and Airplane 3 is "+ distfunc6 + " feet.\n");
    
    
  }
}
