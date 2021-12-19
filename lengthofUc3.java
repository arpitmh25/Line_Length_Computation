import java.util.Scanner;
class lengthofUc3
{
	public static void main(String[] Args)	
	{
        Scanner t = new Scanner(System.in);
		System.out.println("Enter Coordinate of First Line");
		System.out.println("Enter Coordinate of X1, Y1");
		int x1 = t.nextInt();
		int	y1 = t.nextInt();
		System.out.println("Enter Coordinate of X2, Y2");
		int	x2 = t.nextInt();
		int y2 = t.nextInt();
     		double lengthofirst = Math.sqrt((x2-x1)^2+ (y2-y1)^2);	 	    
        System.out.println("lengthof line" +lengthofirst);
		System.out.println("Enter Coordinate of Second Line");
		System.out.println("Enter Coordinate of X3, Y3");
	    int x3 = t.nextInt();
		int	y3 = t.nextInt();
		System.out.println("Enter Coordinate of X4, Y4");
	    int x4 = t.nextInt();
		int	y4 = t.nextInt();
		double lengthosecond = Math.sqrt((x2-x1)^2+ (y2-y1)^2);
	    System.out.println("lengthof line" +lengthosecond);
	    if(lengthofirst > lengthosecond)
		System.out.println("Line 1 is Greater Than Line 2");
		else if(lengthofirst < lengthosecond)
		System.out.println("Line 2 is Greater Than Line 1");
		else
		System.out.println("Two Lines are Equal");
			
	}
}