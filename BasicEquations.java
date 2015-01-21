import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BasicEquations 
{
	public double valueMeq1, valueBeq1, valueMeq2, valueBeq2, intersectX, intersectY;
	public String equation1, equation2;
	
	//reads in values from equations
	public void GetEquation()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program will find the intersecting points of two equations");
		System.out.println("Please enter the first equation in the form of y=mx+b");
		equation1 = scan.nextLine();
		System.out.println();
		
		System.out.println("Please enter the second equation in the form of y=mx+b");
		equation2 = scan.nextLine();
		System.out.println();
	
		scan.close();
		
		
	}
	
	public void FindIntersection ()
	{	
		NumberFormat nf = new DecimalFormat("###.###");
		
		String [] eqArr1 = equation1.split("x");
		String [] eqArr2 = equation2.split("x");
		
		valueMeq1 = Double.parseDouble(eqArr1[0].substring(eqArr1[0].indexOf("=") + 1));
		valueMeq2 = Double.parseDouble(eqArr2[0].substring(eqArr2[0].indexOf("=") + 1));
		valueBeq1 = Double.parseDouble(eqArr1[1]);
		valueBeq2 = Double.parseDouble(eqArr2[1]);
		
		double interM = (valueMeq1 - valueMeq2);
		double interB = (valueBeq2 - valueBeq1);
		//System.out.print(interB);
		intersectX = ((interB)/(interM));
		intersectY = (((valueMeq2) * (intersectX)) + (valueBeq2));
		
		System.out.println("(" + nf.format(intersectX) + "," + nf.format(intersectY) + ")");
	}
	
	public static void main (String [] args)
	{
		BasicEquations equations = new BasicEquations();
		
		equations.GetEquation();
		equations.FindIntersection();
	}
}
