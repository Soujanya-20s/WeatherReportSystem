package weather;

public class Weather {

	private String cityName;
	private double temperature;
	private double humidity;
	private double wind;
	private double precipitation;
	private String  weatherDiscription;
	private double[] weeklyTemperatures;
	
	public Weather(String cityName,double temperature,double humidity,double wind,double precipitation,String weatherDiscription,double[] weeklyTemperatures) {
		this.cityName=cityName;
		this.temperature=temperature;
		this.humidity=humidity;
		this.wind=wind;
		this.precipitation=precipitation;
		this.weatherDiscription=weatherDiscription;
		this.weeklyTemperatures=weeklyTemperatures;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public double getTemperature() {
		return temperature;
	}
	
	public double getHumidity() {
		return humidity;
	}
	
	public double getWind() {
		return wind;
	}
	
	public double getPrecipitation() {
		return precipitation;
	}
	
	public String getWeatherDiscription() {
		return weatherDiscription;
	}
	
	public double[] getWeeklyTemperatures() {
		return weeklyTemperatures;
	}

	public String toString() {
		return "City:"+cityName+"\n"+"Temperature:"+temperature	+"°C"+"\n"+"Humidity:"+humidity+"%"+"\n"+"Wind:"
	+wind+"km/h"+"\n"+"Precipitation:"+precipitation+"mm"+"\n"+"Description:"+weatherDiscription;
	}
}