package weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherService {

	private List<Weather> weatherList;
	
	public WeatherService() {
		 weatherList=new ArrayList<>();
		 Data();
	}
	
	private void Data() {
		weatherList.add(new Weather("Hyderabad",29,70,15,15,"Sunny", new double[] {29, 30, 28, 29, 31, 32, 33}));
		weatherList.add(new Weather("Delhi",22,60,10,5," Cloudy", new double[] {22, 24, 25, 26, 22, 24, 27}));
		weatherList.add(new Weather("chennai",25,65,12,5,"Partly Cloudy", new double[] {25, 25, 26, 29, 30, 27, 28}));
		weatherList.add(new Weather("Pune",23,15,8,4,"Light Rain", new double[] {23, 25, 30, 28, 27, 30, 29}));
	}
	
	public Weather searchWeather(String cityName) {
		for(Weather w:weatherList) {
			if(w.getCityName().equalsIgnoreCase(cityName)) {
				return w;
			}
		}
		return null;
	}
	public double[] getWeeklyForecast(String cityName) {
		Weather weather=searchWeather(cityName);
		return weather !=null ? weather.getWeeklyTemperatures():null;
	}
	
	public void getTemperature(String cityName) {
		double[] weeklyTemperatures=getWeeklyForecast(cityName);
		if(weeklyTemperatures != null) {
			double maxTemp=weeklyTemperatures[0];
			double minTemp=weeklyTemperatures[0];
			double sumTemp=0;
			
			for(double temp:weeklyTemperatures) {
				if(temp>maxTemp)
					maxTemp=temp;
				if(temp<minTemp)
					minTemp=temp;
				sumTemp +=temp;
			}
			System.out.println("Temperature for "+cityName+":");
			System.out.println("Highest Temperature: "+maxTemp+"°C");
			System.out.println("Lowest temperature: "+minTemp+"°C");
			System.out.println("Average Temperature: "+(sumTemp/weeklyTemperatures.length)+"°C");
		}
		else
			System.out.println("City not found");
	}
}
