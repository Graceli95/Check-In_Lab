import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherReader {
    public String path = "/Users/FS/Documents/Check-In Lab/WeatherAppLab/src/weather.txt";
    File file = new File(path);


    /*
Step 1: Method to check if the file exists, if file does not exists it throws and
will throw a WeatherFileNotFoundException
*/


    public void checkFileExists(File file) throws WeatherFileNotFoundException {
        try {
            if (file.exists()) {
                System.out.println("File exists");
            } else {
                throw new WeatherFileNotFoundException("file not exists");
            }


        } catch (WeatherFileNotFoundException e) {

            System.out.println("File not exists 2");
            e.printStackTrace();


        }


    }

    /*
    Step 2: Method to read file using Scanner methods and display the file content
    In this method catch the FileNotFoundException only
    */
    public void readFile(File file) throws FileNotFoundException {
// Reading file line by line and display each line

        try{
            Scanner input = new Scanner(file);
            while(input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

    /*
    Step 3: Method to process the file by combining both tasks.
    In this method catch the WeatherFileNotFoundException only
    */
    public void processWeatherFile(String filePath) throws WeatherFileNotFoundException, FileNotFoundException {
// Step 1: Create File object to assign filePath
        File file = new File(filePath);
// Step 2: Check file existence
        checkFileExists(file);
// Step 3: Read the file
        readFile(file);

    }
}
