package weather;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeatherReportSystem {

	public static void main(String[] args) {
		WeatherService ws=new WeatherService();
		Scanner sc=new Scanner(System.in);
		while(true) {
				try {
			System.out.println("Weather Report System");
			System.out.println("1.Search Weather");
			System.out.println("2.View 7-Days ForeCast");
			System.out.println("3.Analyze Temperatures");
			System.out.println("4.Exit");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1: System.out.println("Enter CityName: ");
			String cityName=sc.next();
			Weather w=ws.searchWeather(cityName);
			if(w !=null) {
				System.out.println(w);
			}
			else {
				System.out.println("City not found");
			}
			break;
			
			case 2: System.out.println("Enter CityName: ");
			cityName=sc.next();
			double[] forecast=ws.getWeeklyForecast(cityName);
			if(forecast != null) {
				System.out.println("7-Days ForeCast for"+cityName);
				for(int i=0;i<forecast.length;i++){
					System.out.println("Day "+(i+1)+":"+forecast[i]+" °C");
				}
			}
			else {
				System.out.println("City not found");
			}
				break;
			
			case 3: System.out.println("Enter City name:");
					cityName=sc.next();
					ws.getTemperature(cityName);
					break;
					
			case 4: System.out.println("Exiting");

					return;
	
			default: System.out.println("Invalid choice!");
					break;
			         
			}
			
			}	
			catch(InputMismatchException e) {
				System.out.println("Error! Invalid input");
			}
			System.out.println();
		}
}

}
