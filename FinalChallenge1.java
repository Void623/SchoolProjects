//Dencel Julius L. Parantac
//1N - A
//Final Challenge 1

package pkgfinal.challenge.pkg1;

public class FinalChallenge1 {

    public static void main (String []finalchallenge1){
            // Declare an array for stock quantities and an array for prices
            int[] stockLevels = new int[10]; // Stock levels of 10 products
            double[] productPrices = new double[10]; // Prices of 10 products

            // Initialize the stock levels (quantities) of each product
            stockLevels[0] = 50;
            stockLevels[1] = 30;
            stockLevels[2] = 20;
            stockLevels[3] = 100;
            stockLevels[4] = 75;
            stockLevels[5] = 200;
            stockLevels[6] = 15;
            stockLevels[7] = 60;
            stockLevels[8] = 10;
            stockLevels[9] = 80;

            // Initialize the prices of each product
            productPrices[0] = 19.99;
            productPrices[1] = 29.99;
            productPrices[2] = 9.99;
            productPrices[3] = 49.99;
            productPrices[4] = 5.99;
            productPrices[5] = 15.99;
            productPrices[6] = 22.50;
            productPrices[7] = 14.99;
            productPrices[8] = 39.99;
            productPrices[9] = 7.99;

            // Calculate the total value of stock
            double totalValue = 0.0;
            for (int i = 0; i < stockLevels.length; i++) {
                totalValue += stockLevels[i] * productPrices[i];
            }

            // Output the total value of all items in stock
            System.out.println("The total value of all products in stock is: $" + totalValue);

        }
}
