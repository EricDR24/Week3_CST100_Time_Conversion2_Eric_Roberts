/**Program: Time Conversion 2
 * File: timeConversion2.java
 * Summary: convert decimal time format to hours and minutes format
 *Author: Eric Roberts
 *Date: July 10, 2016
 */
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


public class timeConversion2 {

	public static void main(String[] args) {
		//Create Scanner for decimal input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a time in decimal format e.g.,(4.5 is 4 hours and 30 minutes): ");
		double decimal = sc.nextDouble();
		
		//method to convert decimal
		Decimal Time = new Decimal();
		Time.dec(decimal);

	}

}

class Decimal {
	
	public void dec(double time)
	{
		//get minute and hours
		int min = (int) (time * 60) % 60;
		int hours = (int)time;
		String decTime = hours + ":" + min;
	try
	{
		SimpleDateFormat _24 = new SimpleDateFormat("HH:mm");
		SimpleDateFormat _12 = new SimpleDateFormat("hh:mm a");
		Date _24Time = _24.parse(decTime);
		System.out.println(_12.format(_24Time));
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	}
}
