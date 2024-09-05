package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year to be determined: ");
		int yr = in.nextInt();
		boolean c1 = yr%4==0;
		boolean c2 = yr%100!=0;
		boolean c3 = yr%400==0;
		boolean leap = (c1&&c2)||c3;
		System.out.println(yr+" is a leap year: "+leap);

	}

}
