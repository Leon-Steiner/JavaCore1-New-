package Homework7;
/**
* JavaСore 1 Homework7-8
*
* @author Leon Steiner
* version 13.06.2022
* 
*/
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public interface WeatherForecast {
    public void getWeatherForecast(int option, String cityID) throws IOException, ParseException, ClassNotFoundException, SQLException;
    public void printDataFromDB() throws ClassNotFoundException, SQLException;
}