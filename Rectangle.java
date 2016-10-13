import java.util.Scanner;
 
 public class Rectangle {
 	private static Scanner sc;
	 
	public static void main(String[] args) {
	double width, height, Area, Perimeter; 
	sc = new Scanner(System.in);
								
	System.out.println(" Please Enter the Width of a Rectangle =  ");
	width = sc.nextDouble();
	System.out.println(" Please Enter the Height of a Rectangle = ");
	height = sc.nextDouble();
																 
	Area = width * height;
	Perimeter = 2 * (width + height);
																				 
System.out.format(" The Area of a Rectangle = %.2f\n",Area);
																								System.out.format(" The Perimeter of a Rectangle = %.2f\n", Perimeter);
																									}
																									}
