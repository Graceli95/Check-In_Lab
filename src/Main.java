import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws WeatherFileNotFoundException, FileNotFoundException {
        WeatherReader weatherReader = new WeatherReader();
        String path = "/Users/FS/Documents/Check-In Lab/WeatherAppLab/src/weather.txt";
        File  file = new File(path);
//        weatherReader.checkFileExists(file);
//        weatherReader.readFile(file);
        weatherReader.processWeatherFile(path);


    }


}