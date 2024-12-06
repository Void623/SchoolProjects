//Dencel Julius L. Parantac
//1N - A
//Labolatory Challenge 6

package classroomattendancesystem;

import java.util.Scanner;

public class ClassroomAttendanceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Input the total number of students
        System.out.print("Enter the total number of students: ");
        int totalStudents = scanner.nextInt();
        
        // Initialize counters for present and absent students
        int presentCount = 0;
        int absentCount = 0;
        
        // Step 2: Loop through each student to ask for attendance
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Is student " + i + " present? (Y/N): ");
            char attendance = scanner.next().charAt(0);
            
            // Step 3: Check attendance and update counters
            if (attendance == 'Y' || attendance == 'y') {
                presentCount++;
            } else if (attendance == 'N' || attendance == 'n') {
                absentCount++;
            } else {
                System.out.println("Invalid input! Please enter 'Y' for present or 'N' for absent.");
                i--; // Repeat the question for the current student
            }
        }
        
        // Step 4: Display the final counts
        System.out.println("Total present: " + presentCount);
        System.out.println("Total absent: " + absentCount);
        
        scanner.close();
    }
}

