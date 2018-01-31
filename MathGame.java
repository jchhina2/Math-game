/**
 *
 * @author Jasraj Chhina
 */
import java.util.*;
public class MathGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

int rand1 = (int) (Math.random() * 10);
int rand2 = (int) (Math.random() * 10);
int numberToken = (int) (Math.random() * 4) + 1; // Calculate range of random numbers
switch(numberToken)
{
	case 1:
	multiply(rand1, rand2,input);
	break;

	case 2:
	add(rand1, rand2,input);
	break;

	case 3:
	subtract(rand1, rand2,input);
	break;

	case 4:
	divide(rand1, rand2 ,input);
	break;

}

    }
    public static void multiply(int r1, int r2,Scanner input)
{
	System.out.println("Enter the answer for " + r1 + " * " + r2);
	int answer = input.nextInt();
	while(answer != (r1*r2))
{
	System.out.println("Wrong answer! Enter again: ");
	answer = input.nextInt();
}

System.out.println("Correct answer! " + r1 + " multiplied by " + r2 + " is equal to " + answer);
}
public static void add(int r1, int r2, Scanner input)
{
	System.out.println("Enter the answer for " + r1 + " + " + r2);
	int answer = input.nextInt();
	while(answer != (r1+r2))
{
	System.out.println("Wrong answer! Enter again: ");
	answer = input.nextInt();
}

System.out.println("Correct answer! " + r1 + " plus " + r2 + " is equal to " + answer);

}



public static void subtract(int r1, int r2, Scanner input)
{
	System.out.println("Enter the answer for " + r1 + " - " + r2);
	int answer = input.nextInt();
	while(answer != (r1-r2))
{
	System.out.println("Wrong answer! Enter again: ");
	answer = input.nextInt();
}

System.out.println("Correct answer! " + r1 + " minus " + r2 + " is equal to " + answer);
}

public static void divide(int r1, int r2, Scanner input)
{
	System.out.println("Enter the answer for " + r1 + " / " + r2);
	int answer = input.nextInt();
	while(answer != (r1/r2))
{
	System.out.println("Wrong answer! Enter again: ");
	answer = input.nextInt();
}

System.out.println("Correct answer! " + r1 + " divided by " + r2 + " is equal to " + answer);
}
    
}
