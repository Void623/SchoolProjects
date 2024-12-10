//Dencel Julius L. Parantac
//CC2 CITCS 1N - A
//Final Project 5 B

package online.shopping.cart;

import javax.swing.JOptionPane;

// Custom Exception: Invalid Quantity
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

public class OnlineShoppingCart {
    public static void main(String[] args) {
        // Available stock
        int availableStock = 10;
        
        // User input: Product quantity
        String input = JOptionPane.showInputDialog(null, "Enter the quantity you want to purchase:", "Online Shopping Cart", JOptionPane.QUESTION_MESSAGE);
        
        try {
            // Parse input to integer
            int quantity = Integer.parseInt(input);
            
            // Check if the quantity is valid (non-negative and not exceeding available stock)
            if (quantity < 0) {
                throw new InvalidQuantityException("Error: Quantity cannot be negative.");
            }
            if (quantity > availableStock) {
                throw new InvalidQuantityException("Error: Not enough stock. Only " + availableStock + " items available.");
            }
            
            // If no exception, proceed with the purchase
            JOptionPane.showMessageDialog(null, "Purchase successful! You bought " + quantity + " items.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (InvalidQuantityException e) {
            // Handle the custom exception
            JOptionPane.showMessageDialog(null, e.getMessage(), "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            // Handle invalid input (non-numeric input)
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number for the quantity.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
