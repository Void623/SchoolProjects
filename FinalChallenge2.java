//Dencel Julius L. Parantac
//1N - A
//Final Challenge 2

package pkgfinal.challenge.pkg2;


public class FinalChallenge2 {

   public static void main(String[]finalchallenge2){
        // Declare a two-dimensional array for daily temperature readings for 3 cities over 7 days
        double[][] temperatures = {
                {72.5, 75.0, 78.3, 80.1, 79.5, 78.0, 76.5}, // City 1 temperatures for 7 days
                {65.3, 67.8, 70.0, 72.2, 71.5, 69.8, 68.0}, // City 2 temperatures for 7 days
                {80.0, 82.5, 85.0, 88.0, 86.5, 84.3, 83.0}  // City 3 temperatures for 7 days
        };

        // Loop through the cities and calculate the average temperature and highest temperature
        for (int city = 0; city < temperatures.length; city++) {
            double totalTemperature = 0;
            double highestTemperature = temperatures[city][0];

            // Calculate the total temperature and find the highest temperature for the city
            for (int day = 0; day < temperatures[city].length; day++) {
                totalTemperature += temperatures[city][day];
                if (temperatures[city][day] > highestTemperature) {
                    highestTemperature = temperatures[city][day];
                }
            }

            // Calculate the average temperature for the city
            double averageTemperature = totalTemperature / temperatures[city].length;

            // Print the results for the current city
            System.out.println("City " + (city + 1) + " Analysis:");
            System.out.println("Average temperature: " + averageTemperature + "°F");
            System.out.println("Highest temperature: " + highestTemperature + "°F");
            System.out.println();
        }
    }
}