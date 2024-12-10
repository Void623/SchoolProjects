//Dencel Julius L. Parantac
//CC2 CITCS 1N - A
//Final Challenge 5 A

package banking.system;

import javax.swing.JOptionPane;

// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // Initial account balance
        double balance = 500.00;
        
        // User input: Withdrawal amount
        String input = JOptionPane.showInputDialog(null, "Enter the amount to withdraw:", "Banking System", JOptionPane.QUESTION_MESSAGE);
        
        try {
            // Parse input to double
            double withdrawalAmount = Double.parseDouble(input);
            
            // Check if the withdrawal amount is greater than balance
            if (withdrawalAmount > balance) {
                throw new InsufficientFundsException("Error: Insufficient funds. You cannot withdraw more than your balance.");
            }
            
            // If no exception, deduct the amount and show new balance
            balance -= withdrawalAmount;
            JOptionPane.showMessageDialog(null, "Withdrawal successful! New balance: $" + balance, "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (InsufficientFundsException e) {
            // Handle the custom exception
            JOptionPane.showMessageDialog(null, e.getMessage(), "Transaction Failed", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            // Handle invalid input (non-numeric input)
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number for the withdrawal amount.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
