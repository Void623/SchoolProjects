//Dencel Julius L. Parantac
//1N - A
//Final Challenge 3

package pkgfinal.challenge.pkg3;

public class FinalChallenge3 {

    public static void main(String[] finalchallenge3) {
        // Step 1: Create a one-dimensional array to store the names of 5 students
        String[] studentNames = {
                "Alice Johnson",
                "Bob Smith",
                "Charlie Brown",
                "Diana White",
                "Eva Green"
        };

        // Step 2: Create a two-dimensional array to store grades for each student in 3 subjects
        // Grades are stored in rows (each student) and columns (subjects)
        double[][] grades = {
                {85.5, 90.0, 88.5}, // Alice's grades in 3 subjects
                {78.0, 82.5, 80.0}, // Bob's grades
                {92.0, 95.5, 93.0}, // Charlie's grades
                {70.0, 75.5, 72.5}, // Diana's grades
                {88.0, 91.0, 89.5}  // Eva's grades
        };

        // Step 3: Calculate and display the average grade for each student
        for (int i = 0; i < studentNames.length; i++) {
            double total = 0;

            // Calculate total grades for the student
            for (int j = 0; j < grades[i].length; j++) {
                total += grades[i][j];
            }

            // Calculate the average grade for the student
            double average = total / grades[i].length;

            // Step 4: Display student's name and average grade
            System.out.println(studentNames[i] + "'s average grade: " + average);
        }
    }
}