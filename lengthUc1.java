import java.util.*;
class lengthUc1
{
	public static void main(String[] Args)	
	{
        Scanner t = new Scanner(System.in);
		System.out.println("Enter Coordinate of X1, Y1");
		int x1 = t.nextInt();
		int	y1 = t.nextInt();
		System.out.println("Enter Coordinate of X2, Y2");
		int	x2 = t.nextInt();
		int y2 = t.nextInt();
     		double lengthof = Math.sqrt((x2-x1)^2+ (y2-y1)^2);	 	    
        System.out.println("lengthof line" +lengthof);
	}
}