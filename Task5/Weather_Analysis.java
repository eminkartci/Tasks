package Task5;

import java.util.*;
import java.util.ArrayList;

public class Weather_Analysis {
	public static void main(String[] args) {
		Scanner cons = new Scanner(System.in);
		double sum = 0;
		int count = 0;

//		 Defining how many days data
		System.out.print("How many days' temperatures: ");
		int days = cons.nextInt();

		int[] daysweather = new int[days];

//		Filling the array and finding the sum of all temperatures
		for (int i = 0; i < daysweather.length; i++) {
			System.out.print("Day " + (i + 1) + ", highest temp is ");
			int dailyweather = cons.nextInt();
			sum += dailyweather;
			daysweather[i] = dailyweather;
		}
//		Counting the days that higher than the average
		double average = sum / days;
		for (int i = 0; i < daysweather.length; i++) {
			if (average < daysweather[i]) {
				count++;
			}
		}
		System.out.printf("Average tempreture of " + days + " days: %.1f \n",average);
		System.out.println(count + " days were above the average.");

	}

}
