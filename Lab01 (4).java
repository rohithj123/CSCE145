import java.util.Scanner;

public class Lab01{
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
			
		final double a = 9.8;
		
		
			System.out.println("Enter the initial velocity of the ball (in meters per second):");
			double vel = key.nextDouble();
			
			System.out.println("how much time its taken (in seconds): ");
			double sec = key.nextDouble();
			
			double finalvel = vel + 9.8 * sec;
			double dist = vel * sec + .5 * 9.8 * 10 * 9.8 * 10;
			
			double S = vel * sec + 0.5 * a * sec * sec;
			
					
			System.out.println("the final velocity of the ball = " + finalvel + "m/s");
			System.out.println("distance traveled by the ball (s) = " + S + " meters");
		}
			
}


	


	
	
	






