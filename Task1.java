import java.util.Scanner;
import java.util.Random;
class Task1
{
	void random()
	{	
		Scanner scan= new Scanner(System.in);
		int n=1,m=100,randomNumber,guess=0,i;
		
		Random r = new Random();
		randomNumber = r.nextInt(m - n) + n;
		//System.out.println("random number is:"+randomNumber);

		System.out.println("\nA random number has generated.\n");

		System.out.println("You have 3 chances to guess the correct number.\n");
		for(i=1;i<=3;i++)
		{
			System.out.println("ROUND "+ i+"\n");
			System.out.println("Enter your guess for generated number:");
			guess= scan.nextInt();

			if(guess==randomNumber)
			{
				System.out.println("You guessed correct in ROUND "+ i);
				if(i<=1)
				{
					System.out.println("You got 100 points..\n");
					System.exit(0);
				}
				else if(i<=2)
				{
					System.out.println("You got 50 points..\n");
					System.exit(0);
				}
				else
				System.out.println("You got 10 points..\n");
			}	

			else if(guess>m)
			System.out.println("You exceed the range..\n");

			else if(guess<n)
			System.out.println("You subceed the range..\n");

			else if (guess<randomNumber)
			System.out.println("Your guess is too low..\n");

			else 
			System.out.println("Your guess is too high..\n");

		}
		if(guess!=randomNumber)
		{
			System.out.println("Oops..!! You could not guess the correct number.");
			System.out.println("The randomly generated number is: "+ randomNumber);
			System.out.println("You got 0 points..\n");
		}
	}

	public static void main(String args[])
	{
		Task1 obj= new Task1();
		obj.random();
	}
}
